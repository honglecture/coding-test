// https://www.acmicpc.net/problem/1411
// 비슷한 단어
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
        String[] array = new String[size];
        for (int i = 0; i < array.length; i++) {
            array[i] = bf.readLine();
        }
        for (int i = 0; i < array.length - 1; i++) {
            for (int j = i + 1; j < array.length; j++) {
                String s1 = array[i];
                String s2 = array[j];
                String answer = "";
                for (int k = 0; k < s1.length(); k++) {
                    char c1 = s1.charAt(k);
                    char c2 = s2.charAt(k);
                }
            }
        }
        bw.flush();
        bw.close();
    }
    
}