// https://www.acmicpc.net/problem/3035
// 스캐너
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
        int zr = Integer.parseInt(sArray[2]);
        int zc = Integer.parseInt(sArray[3]);
        String[] array = new String[y];
        for (int i = 0; i < array.length; i++) {
            array[i] = bf.readLine();
        }
        for (int i = 0; i < array.length; i++) {
            String str = array[i];
            String result = "";
            for (int j = 0; j < str.length(); j++) {
                for (int j2 = 0; j2 < zc; j2++) {
                    result += str.charAt(j);
                }
            }
            array[i] = result;
        }
        for (int i = 0; i < array.length; i++) {
            for (int j = 0; j < zr; j++) {
                System.out.println(array[i]);
            }
        }
        bw.flush();
        bw.close();
    }
}