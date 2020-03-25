package HomeWork2.systems;

import HomeWork2.OS;
import HomeWork2.buttons.Button;
import HomeWork2.buttons.LinuxButton;
import HomeWork2.buttons.WinButton;
import HomeWork2.checkboxs.CheckBox;
import HomeWork2.checkboxs.LixunCheckBox;
import HomeWork2.checkboxs.WinCheckBox;
import HomeWork2.folder.Folder;
import HomeWork2.folder.LinuxFolder;
import HomeWork2.folder.WinFolder;

public class WinOs extends OS {

    public WinOs(){
        this.button= new WinButton();
        this.checkBox = new WinCheckBox();
        this.folder = new WinFolder();
    }


    @Override
    public void sendEmail() {
        System.out.println("Send Email from WinOS");
    }

    @Override
    public void createButton() {
        System.out.println("Create WinOsButton");
    }

    @Override
    public void createCheckBox() {
        System.out.println("Create win checkBox");
    }

    @Override
    public void openFolder() {
        System.out.println("Open Win Folder");
    }
}
