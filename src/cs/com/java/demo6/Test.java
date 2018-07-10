package cs.com.java.demo6;
//null异常
public class Test {
    public static void main(String[] args) {

        System.out.println(strLen(null));

    }

    static int strLen(String s) {
        if (s != null) {
            return s.length();
        }
        return 0;
    }
}
