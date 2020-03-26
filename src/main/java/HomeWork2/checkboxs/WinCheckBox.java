package HomeWork2.checkboxs;

public class WinCheckBox extends  CheckBox{

    @Override
    public void unCheck() {
        System.out.println("Win checkbox unCheked");
    }

    @Override
    public void check() {
        System.out.println("Win checkbox checked");
    }
}
