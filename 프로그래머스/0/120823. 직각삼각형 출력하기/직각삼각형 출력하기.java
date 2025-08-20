import java.util.Scanner;

public class Solution {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int i = 0;
        String str = "";
        while (i < n){
            str += "*";
            System.out.println(str);
            i++;
        }
        
    }
}