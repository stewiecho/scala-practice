package stewie.pvt.test;

/**
 * Created by Stewie on 2016. 2. 16..
 */
public class FizzBuzz {

    public static void main(String[] args) {
//        1에서 100 까지의 수를 출력하는 프로그램을 작성하라.
//                하지만 3의 배수는 해당 수자 대신 "Fizz"를 출력하고,
//        5의 배수는 "Buzz"를 출력한다.
//        3과 5의 배수에 모두 해당하는 수는 "FizzBuzz" 를 출력한다.

        int i = 1;

        do {
            if (i % 3 == 0 && i % 5 == 0) {
                System.out.println("FizzBuzz");
            } else if (i % 3 == 0) {
                System.out.println("Fizz");
            } else if (i % 5 == 0) {
                System.out.println("Buzz");
            } else {
                System.out.println(i);
            }

            i++;
        }while (i != 100);
    }
}
