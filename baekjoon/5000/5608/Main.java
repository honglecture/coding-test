// https://www.acmicpc.net/problem/5608
// 問題 ２
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
        int size = Integer.parseInt(bf.readLine());
        Map<String, String> map = new HashMap<>();
        StringBuilder sb = new StringBuilder();
        for (int i = 0; i < size; i++) {
            String[] sArray = bf.readLine().split(" ");
            map.put(sArray[0], sArray[1]);
        }
        size = Integer.parseInt(bf.readLine());
        for (int i = 0; i < size; i++) {
            String str = bf.readLine();
            if(map.get(str) != null){
                sb.append(map.get(str));
            } else {
                sb.append(str);
            }
        }
        bw.write(sb.toString() + "\n");
        bw.flush();
        bw.close();
    }
}