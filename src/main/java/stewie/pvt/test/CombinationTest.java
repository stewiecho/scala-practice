package stewie.pvt.test;

/**
 * Created by Stewie on 2016. 2. 16..
 */
public class CombinationTest {

    public static void main(String[] args) {
        int num1 = 5;
        int num2 = 2;

        double result = 1;
        for (int i= 0; i < num2; i++){
            result *= num1 - i;
            result /= num2 - i;
        }

        System.out.println(result);

        double a = 10;

        System.out.println(a / 9 * 3 * 3 * 7);
    }
}
