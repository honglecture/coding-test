// https://www.acmicpc.net/problem/5715
// Jingle Composing
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
        Map<String, Integer> map = new HashMap<>();
        map.put("W", 64);
        map.put("H", 32);
        map.put("Q", 16);
        map.put("E", 8);
        map.put("S", 4);
        map.put("T", 2);
        map.put("X", 1);

        while (true) {
            String str = bf.readLine();
            int answer = 0;
            if(str.equals("*")){
                break;
            }
            String[] array = str.split("/");
            for (int i = 0; i < array.length; i++) {
                int sum = 0;
                String s = array[i];
                if(s.equals("")){
                    continue;
                }
                for (int j = 0; j < s.length(); j++) {
                    sum += map.get(String.valueOf(s.charAt(j)));
                }
                if(sum == 64){
                    answer++;
                }
            }
            bw.write(answer + "\n");
        }
        bw.flush();
        bw.close();
    }
}