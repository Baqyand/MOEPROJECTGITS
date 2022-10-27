import java.util.*;
class HelloWorld {
  public static void main(String args[]) {
        Scanner s = new Scanner(System.in);
        String data = s.nextLine();
        int size = data.length();
        int[] arr = new int[size];
        
        if (data.matches("[0-1]+")){
            
        for (int i = 0; i < size; i++) {
            arr[i] = Integer.parseInt(String.valueOf(data.charAt(i)));
        }
    
        System.out.print(ArrayChallenge(arr));
        }else{
         System.out.print("input only 0 1");

        }
    }

    public static int ArrayChallenge(int[] arr) {
        // code goes here
      
        int data = 1;
        int prof = 0;
        int max  = 0;
        
        for(int a : arr){
            if (a == data){
                prof++;
            }else{
                
                max = Math.max(max, prof);
                prof = 0;
            }
        }
        
        return Math.max(max, prof);
    }
}