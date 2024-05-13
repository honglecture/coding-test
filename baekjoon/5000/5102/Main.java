// https://www.acmicpc.net/problem/5102
// Sarah's Toys
import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader bf = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        while (true) {
            String[] sArray = bf.readLine().split(" ");
            int n1 = Integer.parseInt(sArray[0]);
            int n2 = Integer.parseInt(sArray[1]);
            if(n1 == 0 && n2 == 0){
                break;
            }
            int result = n1 - n2;
            int answer1 = 0;
            int answer2 = 0;
            if(result % 2 == 0){
                answer1 = result / 2;
            } else {
                if(result % 3 == 0){
                    answer2 = 1;
                }
            }
            bw.write(answer1 + " " + answer2 + "\n");
        }
        bw.flush();
        bw.close();
    }
}