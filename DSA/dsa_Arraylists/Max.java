package dsa_Arraylists;
import java.util.ArrayList;

public class Max {
    public static void main(String[] args) {
        ArrayList <Integer> list = new ArrayList<>();
        int max = Integer.MIN_VALUE;
        list.add(5);
        list.add(8);
        list.add(2);
        list.add(1);
        for(int i = 0 ; i<list.size()-1;i++){
            if(max<list.get(i)){
                max = list.get(i);
            }

        }
        System.out.println("Max "+max);

    }
    
}
