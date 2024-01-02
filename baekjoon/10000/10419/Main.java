// https://www.acmicpc.net/problem/10419
// 지각
import java.io.*;
public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader bf = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        int size = Integer.parseInt(bf.readLine());
        for (int i = 0; i < size; i++) {
            int d = Integer.parseInt(bf.readLine());
            int answer = 0;
            for (int j = 1; j <= d; j++) {
                int n1 = j;
                int n2 = j * j;
                if(n1 + n2 > d){
                    answer = j - 1;
                    break;
                }
                
            }
            bw.write(answer + "\n");
        }
        bw.flush();
        bw.close();
    }
}



