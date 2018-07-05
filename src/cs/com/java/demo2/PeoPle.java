package cs.com.java.demo2;

import java.util.ArrayList;
import java.util.List;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class PeoPle {
    private String name;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public static void main(String[] args) {

        List<PeoPle> list=new ArrayList<>();
        PeoPle peoPle1 = new PeoPle();
        PeoPle peoPle2 = new PeoPle();
        PeoPle peoPle3 = new PeoPle();
        PeoPle peoPle4 = new PeoPle();
        PeoPle peoPle5 = new PeoPle();
        peoPle1.setName("高手");
        peoPle2.setName("销售");
        peoPle3.setName("小手");
        peoPle4.setName("低手");
        peoPle5.setName("高级收");

        list.add(peoPle1);
        list.add(peoPle2);
        list.add(peoPle3);
        list.add(peoPle4);
        list.add(peoPle5);

        PeoPle peoPle = new PeoPle();
        List<PeoPle> wam = peoPle.search("手", list);
        for (int i = 0; i < wam.size(); i++) {

            System.out.println(wam.get(i).getName());
        }

    }

    public List search(String name,List list){
        List results = new ArrayList();
        Pattern pattern = Pattern.compile(name);
        for(int i=0; i < list.size(); i++){
            Matcher matcher = pattern.matcher(((PeoPle)list.get(i)).getName());
            if(matcher.find()){
                results.add(list.get(i));
            }
        }
        return results;
    }
}
