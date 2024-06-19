// https://www.acmicpc.net/problem/26564
// Poker Hand
import java.io.*;
import java.util.HashMap;
import java.util.Map;

public class Main {

    public static void main(String[] args) throws IOException {
        BufferedReader bf = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        int size = Integer.parseInt(bf.readLine());
        for (int k = 0; k < size; k++) {
            String[] sArray = bf.readLine().split(" ");
            Map<String, Integer> map = new HashMap<>();
            int answer = 0;
            for (int i = 0; i < sArray.length; i++) {
                String str = String.valueOf(sArray[i].charAt(0));
                if(map.get(str) == null){
                    map.put(str, 1);
                } else {
                    map.put(str, map.get(str) + 1);
                }
            }
            for (String key : map.keySet()) {
                answer = Integer.max(answer, map.get(key));
            }
            bw.write(answer + "\n");
        }
        bw.flush();
        bw.close();
    }

}
