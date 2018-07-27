package cs.com.imocc.demo4;

public class InnerClassJava {
    private int a;
    private static int b;

    //静态内部类
    public static class InnerStatic {
        static String value1 = "gaoshou1";
        private String value2 = "gaosho2";
        public void hello() {
            System.out.println(b);
        }
    }

    //实例内部类 能拿到外部类的状态
    public class InnerInstance {
        String value3 = "gaoshou3";
        private String value4 = "gaosho4";

        public void hello() {
            System.out.println(b);
            System.out.println(InnerClassJava.this.a);
        }
    }

    public static void main(String[] args) {
        InnerStatic inner = new InnerStatic();
        System.out.println(inner.value2);
        InnerClassJava innerClassJava = new InnerClassJava();
        InnerInstance innerInstance = innerClassJava.new InnerInstance();

        View view=new View();
        view.setOnClickListener(new OnClickListener() {
            @Override
            public void onClick() {
                System.out.println("高手");
            }
        });

    }
}
