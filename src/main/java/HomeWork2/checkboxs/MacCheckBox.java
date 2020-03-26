package HomeWork2.checkboxs;

public class MacCheckBox extends CheckBox {

    @Override
    public void check() {
        System.out.println("MacCheckBox Cheked");
    }

    @Override
    public void unCheck() {
        System.out.println("MacCheckBox unCheked.");
    }
}
