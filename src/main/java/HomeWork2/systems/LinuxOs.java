package HomeWork2.systems;

import HomeWork2.OS;
import HomeWork2.buttons.Button;
import HomeWork2.buttons.LinuxButton;
import HomeWork2.checkboxs.CheckBox;
import HomeWork2.checkboxs.LixunCheckBox;
import HomeWork2.folder.Folder;
import HomeWork2.folder.LinuxFolder;

public class LinuxOs extends OS {

    public LinuxOs(){
        this.button= new LinuxButton();
        this.checkBox = new LixunCheckBox();
        this.folder = new LinuxFolder();
    }


    @Override
    public void sendEmail() {
        System.out.println("Send Email from Linux");
    }

    @Override
    public void createButton() {
        System.out.println("Create LinuxOsButton");
    }

    @Override
    public void createCheckBox() {
        System.out.println("Create linux checkBox");
    }

    @Override
    public void openFolder() {
        System.out.println("Open Linux Folder");
    }
}
