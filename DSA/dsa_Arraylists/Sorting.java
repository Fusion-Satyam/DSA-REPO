package dsa_Arraylists;
import java.util.ArrayList;
import java.util.Collections;

public class Sorting {
    public static void main(String[] args) {
        ArrayList <Integer> list = new ArrayList<>();
        list.add(8);
        list.add(7);
        list.add(3);
        list.add(4);
        list.add(5);
        list.add(2);
        list.add(9);

        Collections.sort(list);
        System.out.println(list);

        Collections.sort(list,Collections.reverseOrder());//Reverse or decreasing order 
        System.out.println(list);
    }
    
}
