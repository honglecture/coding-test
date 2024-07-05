// https://www.acmicpc.net/problem/11531
// ACM 대회 채점
import java.io.*;
import java.util.HashMap;
import java.util.Map;
public class Main {

    public static void main(String[] args) throws IOException {
        BufferedReader bf = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        int answer = 0;
        int sum = 0;
        Map<String, Integer> map = new HashMap<>();
        while (true) {
            String str = bf.readLine();
            if(str.equals("-1")){
                break;
            }
            String[] sArray = str.split(" ");
            int time = Integer.parseInt(sArray[0]);
            String key = sArray[1];
            String value = sArray[2];
            if(value.equals("right")){
                if(map.get(key) != null){
                    sum += time;
                    sum += map.get(key) * 20;
                } else {
                    sum += time;
                }
                answer++;
            } else {
                if(map.get(key) == null){
                    map.put(key, 1);
                } else {
                    map.put(key, map.get(key) + 1);
                }
            }
        }
        bw.write(answer + " " + sum + "\n");
        bw.flush();
        bw.close();
    }


    
}