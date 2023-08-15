// https://www.acmicpc.net/problem/17219
// 비밀번호 찾기
import java.io.*;
import java.util.HashMap;
import java.util.Map;

public class Main {

    public static void main(String[] args) throws IOException {
        BufferedReader bf = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        String[] sArray = bf.readLine().split(" ");
        int size1 = Integer.parseInt(sArray[0]);
        int size2 = Integer.parseInt(sArray[1]);
        Map<String, String> map = new HashMap<>();
        for (int i = 0; i < size1; i++) {
            sArray = bf.readLine().split(" ");
            map.put(sArray[0], sArray[1]);
        }
        for (int i = 0; i < size2; i++) {
            String key = bf.readLine();
            bw.write(map.get(key) + "\n");
        }
        bw.flush();
        bw.close();
    }

}
