import java.util.Scanner;
class Solution {
    public int removeElement(int[] nums, int val) {
        int k=0;
        for(int i=0; i<nums.length; i++){
            if(nums[i] != val){
                nums[k]= nums[i];
                k++;
            }
        }
        return k;
    }
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        int n= sc.nextInt();
        int[] nums = new int[n];
        for(int i=0;i<n; i++){
            nums[i]=sc.nextInt();

        }
        int val= sc.nextInt();
        Solution sol = new Solution();

        int k= sol.removeElement(nums,val);
        for(int i=0; i<k; i++){
            System.out.print(nums[i]+ " ");
        }
    }
}
