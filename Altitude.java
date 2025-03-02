public class Solution {
    public static int largestAltitude(int[] gain) {
        int maxAltitude = 0, currentAltitude = 0;
        for (int g : gain) {
            currentAltitude += g; 
            maxAltitude = Math.max(maxAltitude, currentAltitude); 
        }
        return maxAltitude;
    }
    public static void main(String[] args) {
        int[] gain1 = {-5, 1, 5, 0, -7};
        int[] gain2 = {-4, -3, -2, -1, 4, 3, 2};
        System.out.println(largestAltitude(gain1)); 
        System.out.println(largestAltitude(gain2)); 
    }
}
