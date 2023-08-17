// https://www.acmicpc.net/problem/2133
// 타일 채우기
import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader bf = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        int n = Integer.parseInt(bf.readLine());
        long[] array = new long[31];
        array[2] = 3;
        array[4] = 11;
        for (int i = 6; i < array.length; i+= 2) {
            array[i] =  array[i - 2] * 4 - array[i - 4];
        }
        bw.write(array[n]+"\n");
        bw.flush();
        bw.close();
    }
}
