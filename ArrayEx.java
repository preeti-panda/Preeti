public class ArrayEx {
    public static void main(String[] args){
    
        int[] arr = {1,1,1,2};
        int ans = 0;
        for(int i=0; i< arr.length; i++){
            if(arr[i]>ans){
                ans = arr[i];
            }
        }
        System.out.println("Max" +ans);
    
    }

}
