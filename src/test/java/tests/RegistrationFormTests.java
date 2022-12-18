package tests;

import org.junit.jupiter.api.Test;

public class RegistrationFormTests extends TestBase {


    @Test
    void fillFormTest() {
        registrationPage.openPage()
                .setFirstName(testData.firstName)
                .setLastName(testData.lastName)
                .setEmail(testData.userEmail)
                .setGender(testData.gender)
                .setNumber(testData.userNumber)
                .setBirthDate(testData.dayOfBirth, testData.monthOfBirth, testData.yearOfBirth)
                .setSubject(testData.subject)
                .setHobby(testData.hobby)
                .uploadPicture(testData.pictureDirectory)
                .setAddress(testData.address)
                .setState(testData.state)
                .setCity(testData.city)
                .clickSubmitButton()
                .verifyModalResultsAppears()
                .verifyFormResult("Student Name", testData.firstName + " " + testData.lastName)
                .verifyFormResult("Student Email", testData.userEmail)
                .verifyFormResult("Gender", testData.gender)
                .verifyFormResult("Mobile", testData.userNumber)
                .verifyFormResult("Date of Birth", testData.dayOfBirth + " " + testData.monthOfBirth + "," + testData.yearOfBirth)
                .verifyFormResult("Subjects", testData.subject)
                .verifyFormResult("Hobbies", testData.hobby)
                .verifyFormResult("Picture", testData.pictureDirectory.replaceAll("src/test/resources/",""))
                .verifyFormResult("Address", testData.address)
                .verifyFormResult("State and City", testData.state + " " + testData.city)
                .clickCloseButton();
    }
}
