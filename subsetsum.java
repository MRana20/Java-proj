import java.util.Arrays;
class Solution {
    public static boolean hasSum ( int indx, int arr[], int [][] dp, int target){
        if (target == 0){
            return true;
        }
        
        if (indx== arr.length - 1){
            if (arr[indx] == target){
                return true;
            }
            return false;
        }
        
        if (arr[indx] == target){
            return true;
        }
        
        if (dp[indx][target] != -1){
            // so it is either 0 or 1
            return dp[indx][target] == 1;}
            
        
        
        if (arr[indx] > target ){
            //SKIP
            if  (hasSum(indx + 1, arr, dp, target)){
                dp[indx][target] = 1;
                return true;
            }
            else{
                dp[indx][target] = 0;
                return false;
            }
            
        }
        else{
            // half skip, half keep
            if  (hasSum(indx + 1, arr, dp, target) || hasSum(indx + 1, arr, dp, target-arr[indx]) ){
                dp[indx][target] = 1;
                return true;
            }
            else{
                dp[indx][target] = 0;
                return false;
            }
            
        }
         
    }
    static boolean isSubsetSum(int arr[], int sum) {
        // code here
        int [][] dp =  new int [arr.length][sum+1];
        
        for (int [] a : dp){
            Arrays.fill(a,-1);
            }// initialisation of dp array
            
        return hasSum(0, arr, dp, sum);
            
        
    }
    
    
}
