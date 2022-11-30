package tests;

import org.junit.jupiter.api.Test;

import static com.codeborne.selenide.Condition.text;
import static com.codeborne.selenide.Selenide.*;

public class RegistrationFormTests extends TestBase {
    @Test
    void fillFormTest() {
        String firstName = "Maria",
                lastName = "Ivanova",
                userEmail = "test@gmail.com",
                gender = "Female",
                userNumber = "7999999999",
                dayOfBirth = "14",
                monthOfBirth = "April",
                yearOfBirth = "1997",
                subject = "Maths",
                hobby = "Sports",
                pictureDirectory = "src/test/resources/picture.png",
                address = "75 Park Place, 15",
                state = "NCR",
                city = "Delhi";

        registrationPage.openPage()
                .setFirstName(firstName)
                .setLastName(lastName)
                .setEmail(userEmail)
                .setGender(gender)
                .setNumber(userNumber)
                .setBirthDate(dayOfBirth, monthOfBirth, yearOfBirth)
                .setSubject(subject)
                .setHobby(hobby)
                .uploadPicture(pictureDirectory)
                .setAddress(address)
                .setState(state)
                .setCity(city)
                .clickSubmit();




        $("#example-modal-sizes-title-lg").shouldHave(text("Thanks for submitting the form"));
        $(".table-responsive").shouldHave(
                text("Maria Ivanova"),
                text("test@gmail.com"),
                text("Female"),
                text("7999999999"),
                text("14 April,1997"),
                text("Maths"),
                text("Sports"),
                text("picture.png"),
                text("75 Park Place, 15"),
                text("NCR Delhi")
        );
    }
}
