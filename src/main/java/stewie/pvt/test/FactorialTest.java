package stewie.pvt.test;

/**
 * Created by Stewie on 2016. 2. 16..
 */
public class FactorialTest {

    public static void main(String[] args) {

        System.out.println(fact(5));
    }

    public static int fact(int num) {
        int result = 1;

        if (num == 1) return num;
        else if (num == 0) return 1;

        do {
            result *= num;
            num--;
        } while (num > 1);

        return result;
    }
}
