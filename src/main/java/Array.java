import java.util.Arrays;
import java.util.Random;

public class Array {


    public static void main(String[] args) {

        int [] ints = new int[10];



        for (int i = 0; i<ints.length; i++){
            int num = new Random().nextInt(100);
            ints[i] = num;
        }
        System.out.println(Arrays.toString(ints));

    }

    //array of cars(20 shtuck)
    // 1 enum car  // 20 cars.
    //CaType :  Typefuel(enum), amountOfFuel(Random int), FuelPerKM(int),  switch with available km
    //sum of all cars  km depends on each capability of car/
    // 1 for for array initialize,  second for for sum of all cars km
}
