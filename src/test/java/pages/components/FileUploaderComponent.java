package pages.components;

import com.codeborne.selenide.SelenideElement;

import java.io.File;

public class FileUploaderComponent {
    public void uploadFile(SelenideElement elementSelector, String filePath) {
        elementSelector.uploadFile(new File(filePath));
    }
}
