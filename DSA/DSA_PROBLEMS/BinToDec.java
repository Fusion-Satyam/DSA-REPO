package DSA_PROBLEMS;

public class BinToDec {
    public static int bintoDec(String str){
        if( str == null || str.length() == 0){
            return 0;
        }
        int sum = 0;
        int power = 0;
        

         for(int i = str.length()-1;i>=0;i--){
            if(str.charAt(i)=='1'){
                power = str.length()-i-1; 
                sum += Math.pow(2, power);

            }
         }
            return sum;

    }
    public static void main(String[] args) {
        String str = "1010";
        System.out.println(bintoDec(str));
        
    }
    
}
