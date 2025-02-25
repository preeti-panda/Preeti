import java.util.Scanner;

public class Question5 {
    static int Question5(int[] arr, int target){
        int count = 0;
        int n = arr.length;

        for(int i=0; i<n; i++ ){
            for(int j = i+1; j<n; j++){
                if(arr[i] + arr[j] == target){
                    count++;
                }

            }
        }
        return count;
    }
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter array size");
        int n = sc.nextInt();
        int[] arr = new int[n];

        System.out.println("Enter" + n + "elements");
        for(int i=0; i<n; i++){
            arr[i] = sc.nextInt();
        }
        System.out.println("Enter target sum");
        int target = sc.nextInt();

        int result = Question5(arr, target);
        System.out.println("Number of pairs with sum " + target + ": " + result);
        
        sc.close(); 
    }

    
}
