// https://www.acmicpc.net/problem/1952
// 달팽이2
import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader bf = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        String[] sArray = bf.readLine().split(" ");
        int y = Integer.parseInt(sArray[0]);
        int x = Integer.parseInt(sArray[1]);
        int answer = 0;
        int type = 0;
        while (true) {
            if(x == 1 || y == 1){
                break;
            }
            if(type == 0){
                x--;
                answer++;
            } else {
                y--;
                answer++;
            }
            
            if(type == 0){
                type = 1;
            } else {
                type = 0;
            }
        }
        System.out.println(answer);
        bw.flush();
        bw.close();
    }
}