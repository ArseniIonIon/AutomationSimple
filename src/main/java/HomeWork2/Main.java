package HomeWork2;

import HomeWork2.buttons.Button;
import HomeWork2.buttons.LinuxButton;
import HomeWork2.buttons.MacButton;
import HomeWork2.buttons.WinButton;
import HomeWork2.checkboxs.CheckBox;
import HomeWork2.checkboxs.LixunCheckBox;
import HomeWork2.checkboxs.MacCheckBox;
import HomeWork2.checkboxs.WinCheckBox;
import HomeWork2.folder.Folder;
import HomeWork2.folder.LinuxFolder;
import HomeWork2.folder.MacFolder;
import HomeWork2.folder.WinFolder;
import HomeWork2.systems.LinuxOs;
import HomeWork2.systems.MacOs;
import HomeWork2.systems.WinOs;

import javax.crypto.Mac;
import java.util.HashMap;
import java.util.Map;

public class Main {

    public static void main(String[] args) {

        OS macOs =  new MacOs();
        macOs.button.press();
        macOs.checkBox.check();
        macOs.checkBox.unCheck();
        macOs.folder.open();
        macOs.sendEmail();
        macOs.openFolder();
        macOs.createCheckBox();
        macOs.createButton();

        OS winOS =  new WinOs();
        winOS.button.press();
        winOS.checkBox.check();
        winOS.checkBox.unCheck();
        winOS.folder.open();
        winOS.sendEmail();
        winOS.openFolder();
        winOS.createCheckBox();
        winOS.createButton();

        OS linuxOs =  new LinuxOs();
        linuxOs.button.press();
        linuxOs.checkBox.check();
        linuxOs.checkBox.unCheck();
        linuxOs.folder.open();
        linuxOs.sendEmail();
        linuxOs.openFolder();
        linuxOs.createCheckBox();
        linuxOs.createButton();


        Map<Integer,OS> osMap = new HashMap<Integer, OS>();


    }
}
