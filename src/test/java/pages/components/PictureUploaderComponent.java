package pages.components;

import com.codeborne.selenide.SelenideElement;

import java.io.File;

public class PictureUploaderComponent {
    public void uploadPicture(SelenideElement elementSelector, String filePath) {
        elementSelector.uploadFile(new File(filePath));
    }
}
