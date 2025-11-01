package Q_3;

import java.util.ArrayList;

public class DemoArraylist {
    public static void main(String[] args) {
        ArrayList<Integer> arrayList=new ArrayList<>();
        arrayList.add(30);
        arrayList.add(40);
        arrayList.add(50);

        System.out.println(arrayList);

        arrayList.remove(1);
        System.out.println(arrayList);



    }
}
