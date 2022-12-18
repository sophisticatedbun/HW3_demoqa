package tests;

import com.github.javafaker.Faker;

import java.text.SimpleDateFormat;
import java.util.Random;

public class TestData {
    Faker faker = new Faker();
    static Random random = new Random();
    static String[] genders = {"Male", "Female", "Other"},
                    subjects = {"Accounting", "Arts", "Biology", "Chemistry", "English", "History"},
                    hobbies = {"Sports", "Reading", "Music"},
                    citiesNCR = {"Delhi", "Gurgaon", "Noida"};

    SimpleDateFormat dateFormat = new SimpleDateFormat("dd MMMM yyyy");
    String[] birthDay = dateFormat.format(faker.date().birthday()).split(" ");

    String firstName = faker.name().firstName(),
            lastName = faker.name().lastName(),
            userEmail = faker.internet().emailAddress(),
            gender = randomItem(genders),
            userNumber = faker.phoneNumber().subscriberNumber(10),
            dayOfBirth = birthDay[0],
            monthOfBirth = birthDay[1],
            yearOfBirth = birthDay[2],
            subject = randomItem(subjects),
            hobby = randomItem(hobbies),
            pictureDirectory = "src/test/resources/picture.png",
            address = faker.address().fullAddress(),
            state = "NCR",
            city = randomItem(citiesNCR);

    public static String randomItem(String[] list) {
        int i = random.nextInt(list.length);
        return list[i];
    }
}
