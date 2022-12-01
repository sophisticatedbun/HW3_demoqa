package tests;

import org.junit.jupiter.api.Test;

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
                .clickSubmitButton()
                .verifyModalResultsAppears()
                .verifyFormResult("Student Name", firstName + " " + lastName)
                .verifyFormResult("Student Email", userEmail)
                .verifyFormResult("Gender", gender)
                .verifyFormResult("Mobile", userNumber)
                .verifyFormResult("Mobile", userNumber)
                .verifyFormResult("Date of Birth", dayOfBirth + " " + monthOfBirth + "," + yearOfBirth)
                .verifyFormResult("Subjects", subject)
                .verifyFormResult("Hobbies", hobby)
                .verifyFormResult("Picture", pictureDirectory.replaceAll("src/test/resources/",""))
                .verifyFormResult("Address", address)
                .verifyFormResult("State and City", state + " " + city)
                .clickCloseButton();
    }
}
