package cs.com.java.demo2;

import cs.com.kotlinTest.demo2.Person;

public class Test3 {
    public static void main(String[] args) {
        Person person = new Person();
        person.setIsmarried(false);
        System.out.println(person.getName());
        System.out.println(129 % 3);
        int[] numArray=new int[100];
        for (int i = 0; i < 100; i++) {
            numArray[i]=i+1;
        }
        getNum(numArray);

    }

    private static String getNum(int[] numArray){
        String strNum=null;
        for (int num: numArray) {
           if (num%3==0){
               strNum="Fizz";
               System.out.println(num+">>>"+strNum);
           }

            if (num%5==0){
                strNum="Buzz";
                System.out.println(num+">>>"+strNum);
            }

            if (num%15==0){
                strNum="FizzBuzz";
                System.out.println(num+">>>"+strNum);
            }
            System.out.println(num);
        }
        return strNum;

    }


}
