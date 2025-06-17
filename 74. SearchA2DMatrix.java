import java.util.Scanner;
class Solution {
    public boolean searchMatrix(int[][] matrix, int target) {
        
        int rows = matrix.length;
        int cols = matrix[0].length;
        int low=0;
        int high= rows*cols-1;
        while(low<=high){
            int mid = low+(high-low)/2;
            int row = mid/cols;
            int col= mid%cols;
            int midvalue = matrix[row][col];
            if(midvalue==target){
                return true;
            }else if(midvalue<target){
                low= mid+1;
            }else{
                high=mid-1;
            }
        }
        return false;
    }
    public static void main(String[] args){
        Scanner sc= new Scanner(System.in);
        int rows = sc.nextInt();
        int cols= sc.nextInt();
        int [][]matrix=new int[rows][cols];
        for(int i=0; i<rows; i++){
            for(int j=0; j<cols; j++){
                matrix[i][j]=sc.nextInt();
            }
        }
        int target=sc.nextInt();
        Solution search =  new Solution();
        boolean found = search.searchMatrix(matrix,target);
        if(found){
            System.out.println("True");
        }else{
            System.out.println("False");
        }
    }

}
