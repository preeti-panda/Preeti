public class ArrayEx2 {

    public static void main(String args[]){
        int[] arr = {1,2,4,5,2,7};
        int x = 2;
        int ans = -1;

        for(int i=0; i<arr.length; i++){
            if(arr[i] == x){
                ans = i;
                break;
            }
                if (ans == -1){
                    System.out.println("Not Found");
                } else {

                
                System.out.println("Found" + x +"at index"+ ans);
            }
        }

        }
    }

