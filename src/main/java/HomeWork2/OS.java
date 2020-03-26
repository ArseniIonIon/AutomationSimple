package HomeWork2;

import HomeWork2.buttons.Button;
import HomeWork2.checkboxs.CheckBox;
import HomeWork2.folder.Folder;

public class OS {

    public Button button;
    public CheckBox checkBox;
    public Folder folder;

    public OS() {
    }


    public void sendEmail(){System.out.println("Default email send"); }
    public void createButton(){
        System.out.println("Default button created ");
    }
    public void createCheckBox(){
        System.out.println("Default checkBox  created ");
    }
    public void openFolder(){
        System.out.println("Default folder open");
    }

}
