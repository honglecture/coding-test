// https://www.acmicpc.net/problem/10991
// 별 찍기 - 16
import java.io.*;
public class Main {
    
    public static void main(String[] args) throws IOException {
        BufferedReader bf = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        int size = Integer.parseInt(bf.readLine());
        for (int i = 0; i < size; i++) {
            String resilt = "";
            for (int j = 0; j < size - i - 1; j++) {
                resilt += " ";
            }
            for (int j = 0; j <= i; j++) {
                resilt += "* ";
            }
            resilt = resilt.substring(0, resilt.length() - 1);
            bw.write(resilt + "\n");
        }
        bw.flush();
        bw.close();
    }

}