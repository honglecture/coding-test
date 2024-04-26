// https://www.acmicpc.net/problem/9286
// Gradabase
import java.io.*;
public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader bf = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        int testCase = Integer.parseInt(bf.readLine());
        for (int i = 0; i < testCase; i++) {
            int size = Integer.parseInt(bf.readLine());
            bw.write("Case "+(i + 1)+":" + "\n");
            for (int j = 0; j < size; j++) {
                int n = Integer.parseInt(bf.readLine()) + 1;
                if(n >= 7){
                    continue;
                }
                bw.write(n + "\n");
            }
        }
        bw.flush();
        bw.close();
    }
}