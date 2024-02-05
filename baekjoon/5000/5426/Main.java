// https://www.acmicpc.net/problem/5426
// 비밀 편지
import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader bf = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        int size = Integer.parseInt(bf.readLine());
        for (int i = 0; i < size; i++) {
            String str = bf.readLine();
            int length = (int) Math.sqrt(str.length());
            String[][] array = new String[length][length];
            int index = 0;
            for (int j = 0; j < array.length; j++) {
                for (int k = 0; k < array.length; k++) {
                    array[j][k] = String.valueOf(str.charAt(index++));
                }
            }
            StringBuilder sb = new StringBuilder();
            for (int j = array.length - 1; j >= 0; j--) {
                for (int k = 0; k < array.length; k++) {
                    sb.append(array[k][j]);
                }
            }
            bw.write(sb.toString() + "\n");
        }
        bw.flush();
        bw.close();
    }
}