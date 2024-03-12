// https://www.acmicpc.net/problem/23738
// Ресторан
import java.io.*;
import java.util.HashMap;
import java.util.Map;

public class Main {

    public static void main(String[] args) throws IOException {
        BufferedReader bf = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        String str = bf.readLine();
        String answer = "";
        Map<String, String> map = new HashMap<>();
        map.put("A", "a");
        map.put("B", "v");
        map.put("E", "ye");
        map.put("K", "k");
        map.put("M", "m");
        map.put("H", "n");
        map.put("O", "o");
        map.put("P", "r");
        map.put("C", "s");
        map.put("T", "t");
        map.put("Y", "u");
        map.put("X", "h");
        for (int i = 0; i < str.length(); i++) {
            String s = String.valueOf(str.charAt(i));
            answer += map.get(s);
        }
        System.out.println(answer);
        bw.flush();
        bw.close();
    }

}
