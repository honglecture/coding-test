// https://www.acmicpc.net/problem/10865
// 친구 친구
import java.io.*;
import java.util.HashMap;
import java.util.Map;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader bf = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        String[] sArray = bf.readLine().split(" ");
        int n = Integer.parseInt(sArray[0]);
        int m = Integer.parseInt(sArray[1]);
        Map<Integer, Integer> map = new HashMap<>();
        for (int i = 1; i <= n; i++) {
            map.put(i, 0);
        }
        for (int i = 0; i < m; i++) {
            sArray = bf.readLine().split(" ");
            int n1 = Integer.parseInt(sArray[0]);
            int n2 = Integer.parseInt(sArray[1]);
            map.put(n1, map.get(n1) + 1);
            map.put(n2, map.get(n2) + 1);
        }
        for (int i = 1; i <= n; i++) {
            System.out.println(map.get(i));
        }
        bw.flush();
        bw.close();
    }
}