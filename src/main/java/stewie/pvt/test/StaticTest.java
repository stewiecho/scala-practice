package stewie.pvt.test;

/**
 * Created by Stewie on 2016. 1. 4..
 */
public class StaticTest {

    public static class StaticResource {
        private int a = 0;

        public void plus(){
            this.a = this.a + 1;
        }

        public int getA() {
            return a;
        }
    }

    public static void main(String[] args) {
        new StaticResource().plus();
        new StaticResource().plus();
        new StaticResource().plus();
        System.out.println(new StaticResource().getA());
    }
}
