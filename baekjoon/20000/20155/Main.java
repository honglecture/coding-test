// https://www.acmicpc.net/problem/20155
// 우리 집 밑에 편의점이 있는데
import java.io.*;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class Main {

    public static void main(String[] args) throws IOException {
        BufferedReader bf = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        bf.readLine();
        String[] sArray = bf.readLine().split(" ");
        int answer = 0;
        Map<Integer, Integer> map = new HashMap<>();
        for (int i = 0; i < sArray.length; i++) {
            int n = Integer.parseInt(sArray[i]);
            if(map.get(n) == null){
                map.put(n, 1);
            } else {
                map.put(n, map.get(n) + 1);
            }
        }
        for (int key : map.keySet()) {
            if(map.get(key) > answer){
                answer = map.get(key);
            }
        }
        System.out.println(answer);
        bw.flush();
        bw.close();
    }

}
