// https://www.acmicpc.net/problem/9838
// XMAS
import java.io.*;
import java.util.HashMap;
import java.util.Map;
public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader bf = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        int size = Integer.parseInt(bf.readLine());
        Map<Integer, Integer> map = new HashMap<>();
        for (int i = 0; i < size; i++) {
            int n = Integer.parseInt(bf.readLine());
            map.put(n, i + 1);
        }
        for (int i = 1; i <= size; i++) {
            bw.write(map.get(i) + "\n");
        }
        bw.flush();
        bw.close();
    }
}