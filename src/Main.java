

import java.sql.Array;
import java.util.*;
public class Main {


    public static void main(String[] args) {

        try {
            Integer[] arr1 = {1, 2, 4, 6};

            List<Integer> list = Arrays.asList(arr1);
            Integer[] arr2 = Arrays.copyOf(arr1, arr1.length);
            list.add(3);
            List<Integer> list2 = Arrays.asList(arr2);
            list2.add(4);
            System.out.println(Arrays.equals(arr1, arr2));


            Arrays.sort(arr1);
            System.out.println(Arrays.binarySearch(arr1, 5));
         //   display(arr2 + "before fill");
            Arrays.fill(arr2, 5);

        } catch (Exception e) {
            System.out.println(e);
        }
    }
    public static void display(Integer[] arr, String str) {
        for (Integer n : arr) {
            System.out.println(n);
        }
    }

    public void dS() {
        Integer [] dsArr = {1,5,6};
    List<Integer> ls= Arrays.asList(dsArr);

        ArrayList<Integer> arrayList=new ArrayList<Integer>();
        arrayList.add(arrayList.size()/2,9);
        arrayList.get(2);
        arrayList.remove(2);
        arrayList.addAll(ls);
        System.out.println(arrayList);
        ListIterator<Integer>li= ls.listIterator();
        System.out.println(li.next()   );
        System.out.println(li.hasNext());
        System.out.println(li.hasPrevious());
        System.out.println(li.next());
        li.set(30);
        System.out.println(ls);
        li.next();
        li.set(30);
        System.out.println(ls);
    }
    public void linkedls(){
        Integer[] LI={2,4,6};
        List<Integer> li=Arrays.asList();
        LinkedList<Integer> linkedList=new LinkedList<>();
        linkedList.addAll(li);
        System.out.println(linkedList.getFirst());
        System.out.println(linkedList.getLast());
        System.out.println(linkedList.add(65));
        linkedList.addFirst(5);
        linkedList.addLast(5);

        linkedList.add(5,7);
Vector<Integer> vector=new Vector<>();
System.out.println(linkedList.getFirst());
        System.out.println(linkedList.getLast());
        System.out.println(linkedList.getFirst());


    }
}
