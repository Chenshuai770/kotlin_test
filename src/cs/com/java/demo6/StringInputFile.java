package cs.com.java.demo6;

import java.io.IOException;
import java.io.StringReader;

public class StringInputFile {
    public static String read(String content) throws IOException {
        StringReader in = new StringReader(content);
        int s;
        String sb="";
        while ((s=in.read())!=-1){
            sb+=(char)s; //类型转换了
        }
        in.close();
        return sb;
    }

    public static void main(String[] args) {
        try {
            System.out.println(read("我收是123\n你你1"));
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
