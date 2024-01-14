// https://www.acmicpc.net/problem/13752
// 히스토그램
import java.io.*;
public class Main {
    
    public static void main(String[] args) throws IOException {
        BufferedReader bf = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        int size = Integer.parseInt(bf.readLine());
        for (int i = 0; i < size; i++) {
            int n = Integer.parseInt(bf.readLine());
            String str = "";
            for (int j = 0; j < n; j++) {
                str += "=";
            }
            bw.write(str +"\n");
        }
        bw.flush();
        bw.close();
    }

}