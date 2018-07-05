package cs.com.java.demo2;

import javafx.util.Pair;

public class Test1 {
    public static void main(String[] args) {
        System.out.println(max(4, 5));

    }

    static int max(int a,int b){
        int c;
        if (a>b){
            c=a;
        }else {
            c=b;
        }
        return c;
    }
}
