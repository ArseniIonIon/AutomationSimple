public class Cat {
    String name = "KAT";
    int age = 7;


    @Override
    public boolean equals(Object obj) {

        if (this.name.equals(((Dog)obj).name)){
            return true;
        }
        else return this.age == ((Dog) obj).age;
    }


}
