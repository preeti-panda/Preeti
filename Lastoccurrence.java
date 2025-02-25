//last Occurrence 
public class Question2 {
    static int lastOccurrence(int[] arr, int x){
        int lastIndex = -1;
        for(int i=0; i<arr.length; i++){
            if(arr[i] == x){
                lastIndex = i;
            }
        }
        return lastIndex;
    }
  
public static void main(String[] args){
    int[] arr = {1, 2, 3, 4, 2, 5, 2};
    int x = 2;
    System.out.println("lastOccurrence " + x + ":" + lastOccurrence(arr, x));
}
}
