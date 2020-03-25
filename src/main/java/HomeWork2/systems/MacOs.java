package HomeWork2.systems;

import HomeWork2.OS;
import HomeWork2.buttons.Button;
import HomeWork2.buttons.MacButton;
import HomeWork2.buttons.WinButton;
import HomeWork2.checkboxs.CheckBox;
import HomeWork2.checkboxs.MacCheckBox;
import HomeWork2.checkboxs.WinCheckBox;
import HomeWork2.folder.Folder;
import HomeWork2.folder.MacFolder;
import HomeWork2.folder.WinFolder;

public class MacOs extends OS {

    public MacOs(){
        this.button= new MacButton();
        this.checkBox = new MacCheckBox();
        this.folder = new MacFolder();
    }

    @Override
    public void sendEmail() {
        System.out.println("Send Email from MacOS");
    }

    @Override
    public void createButton() {
        System.out.println("Create MacOsButton");
    }

    @Override
    public void createCheckBox() {
        System.out.println("Create mac checkBox");
    }

    @Override
    public void openFolder() {
        System.out.println("Open Mac Folder");
    }


}
