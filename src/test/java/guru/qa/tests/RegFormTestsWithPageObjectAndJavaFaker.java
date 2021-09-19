package guru.qa.tests;

import com.github.javafaker.Faker;
import guru.qa.tests.pages.RegistrationPage;
import org.junit.jupiter.api.Test;

import static com.codeborne.selenide.Condition.text;
import static com.codeborne.selenide.Selectors.byText;
import static com.codeborne.selenide.Selenide.$;
import static com.codeborne.selenide.Selenide.open;
import static guru.qa.tests.TestData.firstName;
import static guru.qa.tests.TestData.lastName;

public class RegFormTestsWithPageObjectAndJavaFaker extends TestBase {

    Faker faker = new Faker();
    String firstName = faker.name().firstName(),
            lastName = faker.name().lastName(),
            userEmail = faker.internet().emailAddress(),
            currentAddress = faker.address().streetAddress(),
            userNumber = faker.numerify("##########");

    RegistrationPage registrationPage= new RegistrationPage();



    @Test
    void testFormRegistration() {

        // Open site
        registrationPage.openPage();

        // Input Name
        registrationPage.typeFirstName(firstName);

        // Input Last Name
        registrationPage.typeLastName(lastName);

        // Input email
        registrationPage.typeEmail(userEmail);

        // Select Gender
        registrationPage.selectGender();

        // Input Mobile number
        registrationPage.typeNumber(userNumber);

        // Select Date of Birth
        registrationPage.calendar.setDate("29","September","1995");

        // Input Subject
        registrationPage.inputSubject();

        // Select Hobbies
        registrationPage.selectHobbies();

        // Select picture
        registrationPage.uploadPicture();

        // Input Address
        registrationPage.currentAddress(currentAddress);

        // Scroll down to state block
        registrationPage.scrollDownToState();

        // Select State
        registrationPage.selectState();

        // Select City
        registrationPage.selectCity();

        // Click Submit
        registrationPage.clickSubmit();

        // Check Title

        registrationPage.titleResult();

        // Check Name
        registrationPage.checkName(firstName + " " + lastName);

        // Check Email
        registrationPage.checkEmail(userEmail);

        // Check Gender
        registrationPage.checkGender("Male");

        // Check Mobile
        registrationPage.checkMobile(userNumber);

        // Check DoB
        registrationPage.checkDob("22 October,1995");

        // Check Subjects
        registrationPage.checkSubjects("Maths");

        // Check Hobbies
        registrationPage.checkHobbies("Music");

        // Check Picture
        registrationPage.checkPicture("IMG_4661.JPG");

        // Check Address
        registrationPage.checkAddress(currentAddress);

        // Check State and City
        registrationPage.checkStateAndCity("Uttar Pradesh Merrut");

    }


}
