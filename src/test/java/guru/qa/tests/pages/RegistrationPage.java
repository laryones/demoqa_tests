package guru.qa.tests.pages;

import com.codeborne.selenide.SelenideElement;
import guru.qa.tests.pages.components.CalendarComponent;

import static com.codeborne.selenide.Condition.text;
import static com.codeborne.selenide.Selectors.byText;
import static com.codeborne.selenide.Selenide.$;
import static com.codeborne.selenide.Selenide.open;

public class RegistrationPage {

    private SelenideElement
            formTitle = $(".practice-form-wrapper"),
            firstNameInput = $("#firstName"),
            lastNameInput = $("#lastName"),
            emailInput = $("#userEmail"),
            selectGender = $("#genterWrapper"),
            userNumberInput = $("#userNumber"),
            subjectInput = $("#subjectsInput"),
            hobbiesSelect = $("#hobbiesWrapper"),
            pictureUpload = $("#uploadPicture"),
            addressCurrent = $("#currentAddress"),
            stateSelect =  $("#state"),
            citySelect = $("#city"),
            submitclick = $("#submit"),
            resultTitle = $("#example-modal-sizes-title-lg"),
            resultTable = $(".table-responsive")

            ;



    ;

    public CalendarComponent calendar = new CalendarComponent();

    private String FORM_TITLE = "Student Registration Form";

    public void openPage() {
        // Open site
        open("https://demoqa.com/automation-practice-form");
        // Check title Registration Form
        formTitle.shouldHave(text(FORM_TITLE));
    }

    // Input Name
    public void typeFirstName(String value) {
        firstNameInput.setValue(value);
    }

    // Input Last name
    public void typeLastName(String value) {
        lastNameInput.setValue(value);
    }

    // Input Email
    public void typeEmail(String value) {
        emailInput.setValue(value);
    }

    // Select gender
    public void selectGender() {
        selectGender.$(byText("Male")).click();
    }

    // Input phone number
    public void typeNumber(String value) {
        userNumberInput.setValue(value);
    }

    // select subject
    public void inputSubject() {
        subjectInput.setValue("Math").pressEnter();
    }

    // Select Hobbies
    public void selectHobbies() {
        hobbiesSelect.$(byText("Music")).click();
    }

    // Upload Picture
    public void uploadPicture() {
        pictureUpload.uploadFromClasspath("img/IMG_4661.JPG");
    }

    // Current address
    public void  currentAddress(String value) {
        addressCurrent.setValue(value);
    }

    // Scroll down to state
    public void scrollDownToState() {
        $("#state").scrollIntoView(true);
    }

    // select State
    public void selectState() {
        stateSelect.click();
        $("#stateCity-wrapper").$(byText("Uttar Pradesh")).click();
    }

    // Select City
    public void selectCity() {
        citySelect.click();
        $("#stateCity-wrapper").$(byText("Merrut")).click();
    }

    // click Submit
    public void clickSubmit() {
        submitclick.click();
    }

    private String RESULT_TITLE = "Thanks for submitting the form";

    // Check title on result table
    public void titleResult() {
        resultTitle.shouldHave(text(RESULT_TITLE));
    }

    // Check Name
    public void checkName(String value) {
        resultTable.shouldHave(text(value));
    }

    // Check email
    public void checkEmail(String value) {
        resultTable.shouldHave(text(value));
    }

    // Check Gender
    public void checkGender(String value) {
        resultTable.shouldHave(text(value));
    }

    // Check Phone Number
    public void checkMobile(String value) {
        resultTable.shouldHave(text(value));
    }

    // Check DoB
    public void checkDob(String value) {
        resultTable.shouldHave(text(value));
    }

    // Check Subjects
    public void checkSubjects(String value) {
        resultTable.shouldHave(text(value));
    }

    // Check Hobbies
    public void checkHobbies(String value) {
        resultTable.shouldHave(text(value));
    }

    // Check Picture
    public void checkPicture(String value) {
        resultTable.shouldHave(text(value));
    }

    // Check Address
    public void checkAddress(String value) {
        resultTable.shouldHave(text(value));
    }

    // Check State and City
    public void checkStateAndCity(String value) {
        resultTable.shouldHave(text(value));
    }
}
