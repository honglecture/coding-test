// https://www.acmicpc.net/problem/19685
// Palindromic FizzBuzz
import java.io.*;

public class Main {

    public static void main(String[] args) throws IOException {
        BufferedReader bf = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        String[] sArray = bf.readLine().split(" ");
        long start = Long.parseLong(sArray[0]);
        long end = Long.parseLong(sArray[1]);
        for (long i = start; i <= end; i++) {
            StringBuilder sb = new StringBuilder(String.valueOf(i));
            if(sb.toString().equals(sb.reverse().toString())){
                bw.write("Palindrome!\n");
            } else {
                bw.write(i + "\n");
            }
        }
        bw.flush();
        bw.close();
    }
}