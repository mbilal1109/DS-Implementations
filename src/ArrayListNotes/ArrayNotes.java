package ArrayListNotes;
import java.util.ArrayList;
import java.util.Collections;

public class ArrayNotes {
    public static void main(String[] args) {
        ArrayList<Integer> list = new ArrayList<>();

        // add elements
        list.add(3);
        list.add(4);
        list.add(5);
        System.out.println(list);

        // get element from a index
        System.out.println(list.get(2));

        // set a element at an index, replace with old element
        list.set(0, 6);
        System.out.println(list);

        // add at a certain index, like inserting.
        list.add(2, 10);
        System.out.println(list);

        // traversing in arraylist
        for (Integer integer : list) {
            System.out.print(integer + " ");
        }
        System.out.println();

        //sorting
        Collections.sort(list);
        System.out.println(list);
    }
}
