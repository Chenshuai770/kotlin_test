package cs.com.java.demo2;

import java.util.ArrayList;
import java.util.List;

public class Test7 {


    public static void main(String[] args) {
        int varA = 2;
        List<Integer> mList = new ArrayList<>();
        mList.add(0);

        mList.add(1);
        mList.add(2);
        mList.add(3);

        mList.add(1, 1);

        System.out.println(mList);
        System.out.println(mList.size());

        if (varA < mList.size()-1) {
            int temp = mList.get(varA + 1);
            if (temp - varA < 1) {
                for (int i = (varA + 1); i < mList.size(); i++) {
                    mList.set(i, mList.get(i) + 1);
                }

            }
            System.out.println(">>>" + mList);
        } else {
            System.out.println("参数异常");
        }








/*
        System.out.println(">>>"+mList);
        System.out.println(">>>"+mList.size());*/
    }
}
