import java.util.*;
class Solution {
    public int findKthPositive(int[] arr, int k) {
        int left=0, right=arr.length-1;
        while(left<=right){
            int mid=left+(right-left)/2;
            int missing=arr[mid]-(mid+1);
            if(missing<k){
                left=mid+1;
            }else{
                right=mid-1;
            }
        }
        return left+k;
    }
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        int n= sc.nextInt();
        int[] arr =new int[n];
        for(int i=0; i<n; i++){
            arr[i]=sc.nextInt();
        }
        int k=sc.nextInt();
        Solution sol = new Solution();
        int result= sol.findKthPositive(arr,k);
        System.out.println(result);
    }
}
