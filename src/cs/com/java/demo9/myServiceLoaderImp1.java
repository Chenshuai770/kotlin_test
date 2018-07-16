package cs.com.java.demo9;

class myServiceLoaderImp1 implements IMyServiceLoader{
    @Override
    public String sayHello() {
        return "hello1";
    }

    @Override
    public String getfromByName() {
        return "name1";
    }
}
