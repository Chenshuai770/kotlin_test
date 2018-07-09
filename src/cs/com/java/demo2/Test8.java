package cs.com.java.demo2;

import java.util.ArrayList;
import java.util.List;

public class Test8 {

    public static void main(String[] args) {
        long l1 = System.currentTimeMillis();
        List<Integer> items = new ArrayList<>();
        List<Integer> mList = new ArrayList<>();
        /*for (int i = 0; i <100000 ; i++) {
            mList.add(i);
        }*/
        /*for (Integer i:mList) {
            System.out.println(i);
        }*/

       // mList.forEach(item->System.out.println(item));


        for (int i = 0; i <100000 ; i++) {
            System.out.println(i);
        }
        long l2 = System.currentTimeMillis();

        System.out.println(l2-l1);


    }
}
