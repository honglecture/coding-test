// https://www.acmicpc.net/problem/27058
// Message Decowding
import java.io.*;
import java.util.HashMap;
import java.util.Map;

public class Main {

    public static void main(String[] args) throws IOException {
        BufferedReader bf = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        String key = bf.readLine();
        String str = bf.readLine();
        Map<String, String> map = new HashMap<>();
        StringBuilder sb = new StringBuilder();
        for (int i = 0; i < key.length(); i++) {
            String key1 = String.valueOf((char)(i + 65));
            String key2 = String.valueOf((char)(i + 97));
            String value1 = String.valueOf(key.charAt(i)).toUpperCase();
            String value2 = String.valueOf(key.charAt(i)).toLowerCase();
            map.put(key1, value1);
            map.put(key2, value2);
        }
        for (int i = 0; i < str.length(); i++) {
            if(str.charAt(i) == ' '){
                sb.append(" ");
            } else {
                sb.append(map.get(String.valueOf(str.charAt(i))));
            }
        }
        System.out.println(sb.toString());
        bw.flush();
        bw.close();
    }


}
