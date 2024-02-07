// https://www.acmicpc.net/problem/6887
// Squares
import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;

public class Main {

    public static void main(String[] args) throws IOException {
        BufferedReader bf = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        int n = Integer.parseInt(bf.readLine());
        int answer = 1;
        while (true) {
            int result = answer * answer;
            if(result > n){
                break;
            }
            answer++;
        }
        answer -= 1;
        System.out.println("The largest square has side length "+answer+".");
        bw.flush();
        bw.close();
    }

    
}