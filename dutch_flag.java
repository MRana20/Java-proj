//DUTCH NATIONAL FLAG ALGORITHM

int[] arr= {0,1,1,0,1,2,1,2,0,0,0}



// class Solution {
//     public void sortColors(int[] nums) {
//         int n=nums.length;
//         int ctr0=0;
//         int ctr1=0;
//         int ctr2=0;
//         for (int i=0;i<n;i++){
//             if (nums[i]==0){
//                 ctr0++;
//             }
//             else if (nums[i]==1){
//                 ctr1++;
//             }
//             else{
//                 ctr2++;
//             }

//         }
//         int i=0;
//         while(ctr0>0){
//             nums[i]=0;
//             ctr0--;
//             i++;
//         }
//         while(ctr1>0){
//             nums[i]=1;
//             ctr1--;
//             i++;
//         }
//         while(ctr2>0 && i<n){
//             nums[i]=2;
//             ctr2--;
//             i++;
//         }
//     }
// }
