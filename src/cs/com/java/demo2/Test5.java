package cs.com.java.demo2;

import cs.com.kotlinTest.demo2.Person;
import cs.com.kotlinTest.demo2.StaticTestKt;

import java.util.ArrayList;
import java.util.List;

import static cs.com.kotlinTest.demo2.StaticTestKt.lastChar;


class Dog extends Animal{
    public Dog() {

    }
    @Override
    public void say(){
        System.out.println("dog");
    }
}


public class Test5 {
    public static void main(String[] args) {
        String name = StaticTestKt.TNAME;
        System.out.println(lastChar(name));
        List<Integer> mList=new ArrayList<>();
        mList.add(1);
        mList.add(22);
        mList.add(324);

        Animal dog = new Dog();
        Dog dog1 = new Dog();
        dog.say();

        Person person = new Person();



    }



}
