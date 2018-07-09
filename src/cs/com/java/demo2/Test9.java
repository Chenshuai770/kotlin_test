package cs.com.java.demo2;

import java.util.Collection;

public class Test9 {

    public static void main(String[] args) {



    }

    public void printProblemCounts(Collection<String > responses){
        int clienErrors=0;
        int serverErrors=0;
        for (String item:responses) {
            if (item.equals("4")) {
                clienErrors++;
            }else if (item.equals("5")){
                serverErrors++;
            }
        }
    }
}
