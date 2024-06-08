// https://www.acmicpc.net/problem/14761
// FizzBuzz
import java.io.*;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.PriorityQueue;
import java.util.Queue;
public class Main {

    public static void main(String[] args) throws IOException {
        BufferedReader bf = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        String[] sArray = bf.readLine().split(" ");
        int x = Integer.parseInt(sArray[0]);
        int y = Integer.parseInt(sArray[1]);
        int n = Integer.parseInt(sArray[2]);
        for (int i = 1; i <= n; i++) {
            if(i % x == 0 && i % y == 0){
                bw.write("FizzBuzz\n");
            } else {
                if(i % x == 0){
                    bw.write("Fizz\n");
                } else if(i % y == 0){
                    bw.write("Buzz\n");
                } else {
                    bw.write(i + "\n");
                }
            }
        }
        bw.flush();
        bw.close();
    }

    
}