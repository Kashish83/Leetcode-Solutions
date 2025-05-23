import java.util.Scanner;
class Solution {
    public void reverseString(char[] s) {
        int left=0, right= s.length-1;
        while(left < right){
          char temp = s[left];
          s[left]=s[right];
          s[right]=temp;
          left++;
          right--;
        }
    }
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        String input = sc.nextLine();
        char[] s = input.toCharArray();
        Solution Sol = new Solution();
        Sol.reverseString(s);
        System.out.println(s);
    }
}
