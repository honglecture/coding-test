// https://www.acmicpc.net/problem/2721
// 삼각수의 합
import java.io.*;
public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader bf = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        int size = Integer.parseInt(bf.readLine());
        for (int i = 0; i < size; i++) {
            int n = Integer.parseInt(bf.readLine());
            int answer = 0;
            int sum = 0;
            int count = 3;
            for (int j = 1; j <= n; j++) {
                if(j == 1){
                    sum = 3;
                } else {
                    sum += (count++);
                }
                answer += sum * j;
            }
            bw.write(answer + "\n");
        }
        bw.flush();
        bw.close();
    }

}