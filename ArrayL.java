import java.util.ArrayList;
import java.util.Collections;
public class ArrayL{
        public static void main (String args[]){
        ArrayList<Integer> list =new ArrayList<>();
        ArrayList<String> list2=new ArrayList<>();
ArrayList<Boolean> list3 =new ArrayList<>();
   list.add(1);//(1)
list.add(2);
list.add(5);
list.add(9);
list.add(12);
list.add(6);
System.out.println(list);
Collections.sort(list);
System.out.println(list);
    }
}