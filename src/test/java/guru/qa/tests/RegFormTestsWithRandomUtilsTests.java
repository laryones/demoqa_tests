package guru.qa.tests;

import org.junit.jupiter.api.Test;

import static com.codeborne.selenide.Condition.text;
import static com.codeborne.selenide.Selectors.byText;
import static com.codeborne.selenide.Selenide.$;
import static com.codeborne.selenide.Selenide.open;
import static guru.qa.tests.TestData.firstName;
import static guru.qa.tests.TestData.lastName;
import static guru.qa.tests.utils.RandomUtils.getRandomString;

public class RegFormTestsWithRandomUtilsTests extends TestBase {

    String firstName = getRandomString(11),
            lastName = getRandomString(8);



    @Test
    void testFormRegistration() {

        // Open site
        open("https://demoqa.com/automation-practice-form");

        // Input Name
        $("#firstName").setValue(firstName);

        // Input Last Name
        $("#lastName").setValue(lastName);

        // Input email
        $("#userEmail").setValue("pavel.larion@inex-digital.com");

        // Select Gender
        $("#genterWrapper").$(byText("Male")).click();

        // Input Mobile number
        $("#userNumber").setValue("9998762534");

        // Select Date of Birth
        $("#dateOfBirthInput").click();
        $(".react-datepicker__month-select").selectOption("October");
        $(".react-datepicker__year-select").selectOption("1995");
        $(".react-datepicker__day--022").click();

        // Input Subject
        $("#subjectsInput").setValue("Math").pressEnter();

        // Select Hobbies
        $("#hobbiesWrapper").$(byText("Music")).click();


        // Select picture
        $("#uploadPicture").uploadFromClasspath("img/IMG_4661.JPG");

        // Input Address
        $("#currentAddress").setValue("St 23");

        // Scroll down to state block
        $("#state").scrollIntoView(true);

        // Select State
        $("#state").click();
        $("#stateCity-wrapper").$(byText("Uttar Pradesh")).click();

        // Select City
        $("#city").click();
        $("#stateCity-wrapper").$(byText("Merrut")).click();

        // Click Submit
        $("#submit").click();

        // Check Title

        $("#example-modal-sizes-title-lg").shouldHave(text("Thanks for submitting the form"));

        // Check Name
        $(".table-responsive").shouldHave(text(firstName + " " + lastName));

        // Check Email
        $(".table-responsive").shouldHave(text("pavel.larion@inex-digital.com"));

        // Check Gender
        $(".table-responsive").shouldHave(text("Male"));

        // Check Mobile
        $(".table-responsive").shouldHave(text("9998762534"));

        // Check DoB
        $(".table-responsive").shouldHave(text("22 October,1995"));

        // Check Subjects
        $(".table-responsive").shouldHave(text("Maths"));

        // Check Hobbies
        $(".table-responsive").shouldHave(text("Music"));

        // Check Picture
        $(".table-responsive").shouldHave(text("IMG_4661.JPG"));

        // Check Address
        $(".table-responsive").shouldHave(text("St 23"));

        // Check State and City
        $(".table-responsive").shouldHave(text("Uttar Pradesh Merrut"));



    }


}
