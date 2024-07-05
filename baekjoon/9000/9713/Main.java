// https://www.acmicpc.net/problem/9713
// Sum of Odd Sequence 
import java.io.*;
public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader bf = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        int size = Integer.parseInt(bf.readLine());
        for (int i = 0; i < size; i++) {
            int answer = 0;
            int n = Integer.parseInt(bf.readLine());
            for (int j = 1; j <= n; j++) {
                if(j % 2 == 1){
                    answer += j;
                }
            }
            bw.write(answer +"\n");
        }
        bw.flush();
        bw.close();
    }
}