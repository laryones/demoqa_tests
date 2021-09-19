package guru.qa.tests.pages;

import com.codeborne.selenide.SelenideElement;
import guru.qa.tests.pages.components.CalendarComponent;

import static com.codeborne.selenide.Condition.text;
import static com.codeborne.selenide.Selenide.$;
import static com.codeborne.selenide.Selenide.open;

public class RegistrationPage {

    private SelenideElement
            formTitle = $(".practice-form-wrapper"),
            firstNameInput = $("#firstName"),
            lastNameInput = $("#lastName");

    public CalendarComponent calendar = new CalendarComponent();

    private String FORM_TITLE = "Student Registration Form";

    public void openPage() {
        // Open site
        open("https://demoqa.com/automation-practice-form");
        // Check title Registration Form
        formTitle.shouldHave(text(FORM_TITLE));
    }

    public RegistrationPage typeFirstName(String value) {
        // Input Name
        firstNameInput.setValue(value);

        return this;
    }

    public void typeLastName(String value) {
        // Input Last name
        lastNameInput.setValue(value);
    }
}
