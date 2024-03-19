// https://www.acmicpc.net/problem/4606
// The Seven Percent Solution
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
        map.put(" ", "%20");
        map.put("!", "%21");
        map.put("$", "%24");
        map.put("%", "%25");
        map.put("(", "%28");
        map.put(")", "%29");
        map.put("*", "%2a");
        while (true) {
            String str = bf.readLine();
            if(str.equals("#")){
                break;
            }
            StringBuilder sb = new StringBuilder();
            for (int i = 0; i < str.length(); i++) {
                String s = String.valueOf(str.charAt(i));
                if(map.get(s) != null){
                    sb.append(map.get(s));
                } else {
                    sb.append(s);
                }
            }
            bw.write(sb.toString() + "\n");
        }
        bw.flush();
        bw.close();
    }
    
}