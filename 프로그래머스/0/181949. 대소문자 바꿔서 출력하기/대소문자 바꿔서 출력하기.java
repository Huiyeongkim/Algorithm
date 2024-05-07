import java.util.Scanner;

public class Solution {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String a = sc.next();
        for (int i=0; i<a.length(); i++){
            char result = a.charAt(i);
            if (result >= 'A' && result <= 'Z') 
                result += 32; 
            else if (result >= 'a' && result <= 'z')
                result -= 32;
            System.out.print(result);
        }
    }
}