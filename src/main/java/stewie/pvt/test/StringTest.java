package stewie.pvt.test;

/**
 * Created by Stewie on 2016. 2. 16..
 */
public class StringTest {

    public static void main(String[] args) {
        String str = "IamChojaIamGenius";

        StringBuilder sb = new StringBuilder();
        for (int i=0; i < str.length(); i++){
            sb.append(str.charAt(str.length() - i - 1));
        }
        System.out.println(sb.toString());
    }
}
