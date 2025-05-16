import java.util.Scanner;
class Solution {
    public int removeDuplicates(int[] nums) {
        if(nums.length==0) return 0;
        int count=1;
        for(int j=1; j<nums.length; j++){
            if(nums[j]!=nums[count-1]){
                nums[count]= nums[j];
                count++;
            }
        }
        return count;
    }
    public static void main(String[]args){
        Scanner sc = new Scanner(System.in);
        int n=sc.nextInt();
        int[]nums= new int[n];
        for(int i=0; i<n; i++){
            nums[i]=sc.nextInt();
        }
        Solution solution = new Solution();
        int newLength = solution.removeDuplicates(nums);
        System.out.println(newLength);
        for(int k=0; k<newLength; k++){
            System.out.println(nums[k]+" ");
        }
    }
}
