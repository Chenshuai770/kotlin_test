package cs.com.java.demo7;

public class BreakTest {
    public static void main(String[] args) {
        abc:
        for (int i = 0; i < 10; i++) {
            System.out.println("I<<<" + i);
            for (int j = 0; j < 10; j++) {
                if (j == 2) {
                    System.out.println(j);
                    break abc;
                }
                System.out.println(j);
            }
            System.out.println("I>>>" + i);
        }
    }
}
