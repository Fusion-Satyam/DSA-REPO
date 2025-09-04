package dsa_Arraylists;
import java.util.ArrayList;
public class Reverse {
    public static void main(String[] args) {
        ArrayList <Integer> list = new ArrayList<>();
        list.add(10);
        list.add(10);
        list.add(10);
        list.add(10);

        for(int i = list.size()-1; i>=0;i--){
            System.out.print(list.get(i)+" ");
        }
        System.out.println();
    }
    
}
