package lesson32.collection;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Iterator;
import java.util.List;

public class ArrayList1 {
    public static void main(String[] args) {
        ArrayList<String> arrayList = new ArrayList<>();
        arrayList.add("Валерий");
        arrayList.add("Ирина");
        arrayList.add("Игорь");
        System.out.println(arrayList);

        ArrayList<String> arrayList2 = new ArrayList<>(20);
        arrayList2.add("Валерий");
        arrayList2.add("Ирина");
        System.out.println(arrayList2);

        ArrayList<String> arrayList3 = new ArrayList<>(20);
        arrayList3.add("Валерий");
        arrayList3.add("Ирина");
        System.out.println(arrayList3);

        ArrayList<String> arrayList4 = new ArrayList<>(arrayList);
        System.out.println(arrayList4);
        arrayList4.add("Владимир");
        System.out.println(arrayList4);
        System.out.println(arrayList);

        ArrayList arrayList5 = new ArrayList<>();
        arrayList5.add("Валерий");
        arrayList5.add(7);
        arrayList5.add(true);
        System.out.println(arrayList5);

        System.out.println(arrayList5.get(1));
        arrayList5.set(1, false);
        System.out.println(arrayList5);


        ArrayList<String> arrayList6 = new ArrayList<>();
        arrayList6.add("!!!");
        arrayList6.add("???");
        arrayList6.addAll(1, arrayList);
        // arrayList6.addAll(arrayList);
        //System.out.println(arrayList6);
        List<String> mylist = arrayList6.subList(0, 3);
        System.out.println(mylist);
        mylist.add("Борис");
        System.out.println(mylist);
        System.out.println(arrayList6);

        String[] array = arrayList6.toArray(new String[8]);
        for (String s : array) {
            System.out.print(s + " ");

        }
        System.out.println("\n " + array.length);

        Collections.sort(arrayList6);
        System.out.println(arrayList6);

        Collections.shuffle(arrayList6);
        System.out.println(arrayList6);

        Collections.reverse(arrayList6);
        System.out.println(arrayList6);
        Collections.swap(arrayList6, 0, 2);
        System.out.println(arrayList6);

        //Итератор

        Iterator<String> iterator = arrayList6.iterator();
        System.out.println();
       // System.out.println(iterator);;
       while (iterator.hasNext()) {
           // System.out.println(iterator.next());
           iterator.next();
           iterator.remove();
       }
        System.out.println(arrayList6);
    }


}
