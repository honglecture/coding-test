// https://www.acmicpc.net/problem/31009
// 진주로 가자! (Easy)
import java.io.*;
import java.util.HashMap;
import java.util.Map;

public class Main {

    public static void main(String[] args) throws IOException {
        BufferedReader bf = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        int size = Integer.parseInt(bf.readLine());
        Map<String, Integer> map = new HashMap<>();
        int answer = 0;
        for (int i = 0; i < size; i++) {
            String[] sArray = bf.readLine().split(" ");
            String key = sArray[0];
            int cost = Integer.parseInt(sArray[1]);
            map.put(key, cost);
        }
        int keyNum = map.get("jinju");
        for (String key : map.keySet()) {
            if(!key.equals("jinju")){
                if(keyNum < map.get(key)){
                    answer++;
                }
            }
        }

        bw.write(keyNum + "\n");
        bw.write(answer + "\n");
        bw.flush();
        bw.close();
    }

    

}
