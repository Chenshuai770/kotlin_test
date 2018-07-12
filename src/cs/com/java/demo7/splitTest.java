package cs.com.java.demo7;

public class splitTest {

    public static void main(String[] args) {
        String str = new String("Welcome-to-Runoob");

        for (String retval: str.split("-", 2)){
            System.out.println(retval+">>>");
        }


    }

}
