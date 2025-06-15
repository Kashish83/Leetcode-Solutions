import java.util.Scanner;
class Solution {

    public int strStr(String haystack, String needle) {
        if(needle.isEmpty()) return 0;

    
    return haystack.indexOf(needle);
    }
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        String haystack = sc.nextLine();
        String needle = sc.nextLine();
        Solution sol = new Solution();
        int result = sol.strStr(haystack, needle);
        if(result!= -1){
            System.out.println(result);
        }else{
            System.out.println("-1");
        }
    }
}
