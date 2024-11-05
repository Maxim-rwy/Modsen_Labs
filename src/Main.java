import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;

public class Main {
    public static void palindromeCheck(int x){
        boolean answer;
        String numberStr = String.valueOf(x);
        String reversed = new StringBuilder(numberStr).reverse().toString();
        if (numberStr.equals(reversed)) {
            answer = true;
        } else {
            answer = false;
        }
        System.out.println(answer);
    }

    public static void main(String[] args) {
        palindromeCheck(121);
    }
}