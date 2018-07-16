package cs.com.java.demo9;

import java.util.ServiceLoader;

class TestMyserviceLoader{
    public static void main(String[] args) {
        ServiceLoader<IMyServiceLoader> serviceLoader = ServiceLoader.load(IMyServiceLoader.class);

        serviceLoader.forEach(it->
                System.out.println(it.getfromByName()+"  "+it.sayHello()));
    }
}
