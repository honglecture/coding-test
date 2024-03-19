// https://www.acmicpc.net/problem/6190
// Another Cow Number Game
import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.util.ArrayDeque;
import java.util.Queue;

public class Main {

    public static void main(String[] args) throws IOException {
        BufferedReader bf = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        long n = Long.parseLong(bf.readLine());
        int answer = 0;
        while (true) {
            if(n == 1){
                break;
            }
            if(n % 2 == 0){
                n /= 2;
            } else {
                n = n * 3 + 1;
            }
            answer++;
        }
        System.out.println(answer);
        bw.flush();
        bw.close();
    }
   
}