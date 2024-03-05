// https://www.acmicpc.net/problem/1392
// 노래 악보
import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.util.HashMap;
import java.util.Map;

public class Main {

    public static void main(String[] args) throws IOException {
        BufferedReader bf = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        String[] sArray = bf.readLine().split(" ");
        int n1 = Integer.parseInt(sArray[0]);
        int n2 = Integer.parseInt(sArray[1]);
        Map<Integer, Integer> map = new HashMap<>();
        int time = 0;
        for (int i = 0; i < n1; i++) {
            int n = Integer.parseInt(bf.readLine());
            for (int j = 0; j < n; j++) {
                map.put(time++, i + 1);
            }
        }
        for (int i = 0; i < n2; i++) {
            int n = Integer.parseInt(bf.readLine());
            bw.write(map.get(n) + "\n");
        }
        bw.flush();
        bw.close();
    }
    
}