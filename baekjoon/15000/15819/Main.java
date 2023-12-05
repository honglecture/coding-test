// https://www.acmicpc.net/problem/15819
// 너의 핸들은
import java.io.*;
import java.util.Arrays;

public class Main {

    public static void main(String[] args) throws IOException {
        BufferedReader bf = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        String[] sArray = bf.readLine().split(" ");
        int size = Integer.parseInt(sArray[0]);
        int n = Integer.parseInt(sArray[1]);
        String[] array = new String[size];
        for (int i = 0; i < size; i++) {
            array[i] = bf.readLine();
        }
        Arrays.sort(array);
        bw.write(array[n - 1] + "\n");
        bw.flush();
        bw.close();
    }

    
}