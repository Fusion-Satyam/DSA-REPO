package dsa_backtracking;




public class FindSubset {
    public static void findsubSet(String str , String ans, int i){
        if (i==str.length()){
            if(ans.length() == 0){
               System.out.println("null"); 
            }else{
                 System.out.println(ans);
            }
            return;
        }

        //Yes Choice 
        findsubSet(str, ans+str.charAt(i), i+1);

        // No choice
        findsubSet(str, ans, i+1);
    }
    public static void main(String[] args) {
        String str = "abc";
        String ans = "";
        findsubSet(str, ans, 0);
        
    }
    
}
