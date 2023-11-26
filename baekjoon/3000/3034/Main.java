// https://www.acmicpc.net/problem/3034
// 앵그리 창영
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
        int size = Integer.parseInt(sArray[0]);
        int w = Integer.parseInt(sArray[1]);
        int h = Integer.parseInt(sArray[2]);
        for (int i = 0; i < size; i++) {
            int n = Integer.parseInt(bf.readLine());
            if(n <= w || n <= h){
                bw.write("DA\n");
            } else {
                double sum1 = Math.pow(w, 2) + Math.pow(h, 2);
                double sum2 = Math.pow(n, 2);
                if(sum1 >= sum2){
                    bw.write("DA\n");
                } else {
                    bw.write("NE\n");
                }
            }
        }
        bw.flush();
        bw.close();
    }
}