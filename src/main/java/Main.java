public class Main {

    public static void main(String[] args) {
        String a = "abs";
        String b = "bcv";

        if (a.equals(b)){
            System.out.println("They are equals");
        }

        Cat cat1 = new Cat();
        Dog dog1 = new Dog();

        System.out.println(cat1.equals(dog1));


    }
}

