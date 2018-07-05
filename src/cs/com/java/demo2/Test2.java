package cs.com.java.demo2;

public class Test2 {
    public static void main(String[] args) {
        String imagename="webChat-webChat二维码";
        System.out.println(Test2.substringBefore(imagename, "-"));

    }

    public static String substringBefore(String str, String separator) {
        if (!isEmpty(str) && separator != null) {
            if (separator.length() == 0) {
                return "";
            } else {
                int pos = str.indexOf(separator);
                return pos == -1 ? str : str.substring(0, pos);
            }
        } else {
            return str;
        }
    }

    public static boolean isEmpty(CharSequence cs) {
        return cs == null || cs.length() == 0;
    }
}
