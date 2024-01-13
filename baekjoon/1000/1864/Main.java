// https://www.acmicpc.net/problem/1864
// 문어 숫자
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
        Map<String, String> map = new HashMap<>();
        map.put("-", "0");
        map.put("\\", "1");
        map.put("(", "2");
        map.put("@", "3");
        map.put("?", "4");
        map.put(">", "5");
        map.put("&", "6");
        map.put("%", "7");
        map.put("/", "-1");
        while (true) {
            String str = bf.readLine();
            if(str.equals("#")){
                break;
            }
            int answer = 0;
            for (int i = 0; i < str.length(); i++) {
                int n = Integer.parseInt(map.get(String.valueOf(str.charAt(i))));
                answer += (Math.pow(8, (str.length() - 1 - i)) * n);
            }
            bw.write(answer + "\n");
        }
        bw.flush();
        bw.close();
    }


    
}
