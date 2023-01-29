package BUcs673.HW1;

import com.sun.scenario.effect.impl.state.AccessHelper;

import java.util.Scanner;

public class PalindromeCheck {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Please input a string from your keyboard:");
        String s = input.next();
        if(is_palindrome(s)){
            System.out.println(s+" is a palindrome ");
        }else {
            System.out.println(s+" is not a palindrome ");
        }
    }
    public static boolean is_palindrome(String s){
        if(s=="") return false;
        int left = 0, right = s.length()-1;
        while(left<right){
            if(s.charAt(left++)!=s.charAt(right--)) return false;
        }
        return true;
    }
}
