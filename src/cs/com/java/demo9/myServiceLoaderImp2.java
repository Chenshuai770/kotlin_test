package cs.com.java.demo9;

class myServiceLoaderImp2 implements IMyServiceLoader{
    @Override
    public String sayHello() {
        return "hello2";
    }

    @Override
    public String getfromByName() {
        return "name2";
    }
}
