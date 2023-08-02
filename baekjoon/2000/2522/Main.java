// https://www.acmicpc.net/problem/2522
// 별 찍기 - 12
import java.io.*;
public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader bf = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        int size = Integer.parseInt(bf.readLine());
        for (int i = 0; i < size; i++) {
            String result = "";
            for (int j = 0; j < size - i - 1; j++) {
                result += " ";
            }
            for (int j = 0; j <= i; j++) {
                result += "*";
            }
            bw.write(result + "\n");
        }
        for (int i = 0; i < size - 1; i++) {
            String result = "";
            for (int j = 0; j < i + 1; j++) {
                result += " ";
            }
            for (int j = 0; j < size - i - 1; j++) {
                result += "*";
            }
            bw.write(result + "\n");
        }
        bw.flush();
        bw.close();
    }
}