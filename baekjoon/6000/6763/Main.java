// https://www.acmicpc.net/problem/6763
// Speed fines are not fine!
import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;

public class Main {

    public static void main(String[] args) throws IOException {
        BufferedReader bf = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        int n1 = Integer.parseInt(bf.readLine());
        int n2 = Integer.parseInt(bf.readLine());
        if(n1 >= n2){
            System.out.println("Congratulations, you are within the speed limit!");
        } else {
            int result = n2 - n1;
            if(result >= 1 && result <= 20){
                System.out.println("You are speeding and your fine is $"+100+".");
            } else if(result >= 21 && result <= 30){
                System.out.println("You are speeding and your fine is $"+270+".");

            } else {
                System.out.println("You are speeding and your fine is $"+500+".");

            }
        }
        bw.flush();
        bw.close();
    }

    
}