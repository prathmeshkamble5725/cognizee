package CodSoft;

import java.util.Scanner;
public class palindrome
{
    public static void main(String[] args) {
        System.out.println("Type a word:");
        Scanner sc = new Scanner(System.in);
        String user_word = sc.nextLine();
        System.out.println(is_palindrome(user_word));
    }


    public static boolean is_palindrome(String word){
        boolean pal = false;
        int x = 0;
        int len = word.length();
        if (word.length()%2==0){
            for (int i=0; i<word.length(); i++){
                if (word.charAt(i)==word.charAt(len-i-1) & i<word.length()/2){
                    x = x+1;
                }
            }
            if (x==word.length()/2){
                pal = true;
            }
        }
        else{
            for (int i=0; i<word.length(); i++){
                if (word.charAt(i)==word.charAt(len-i-1) & i<=(word.length()/2)-1){
                    x = x+1;
                }
            }
            if (x==((double) word.length() /2)-0.5){
                pal = true;
            }
        }
        return pal;
    }
}
