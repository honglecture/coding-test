// https://www.acmicpc.net/problem/2703
// Cryptoquote
import java.io.*;
import java.util.HashMap;
import java.util.Map;
public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader bf = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        int size = Integer.parseInt(bf.readLine());
        for (int i = 0; i < size; i++) {
            String str1 = bf.readLine();
            String str2 = bf.readLine();
            String answer = "";
            Map<String, String> map = new HashMap<>();
            for (int j = 0; j < str2.length(); j++) {
                String key = str2.charAt(j) + "";
                String v = String.valueOf((char) (j + 65));
                map.put(v, key);
            }
            for (int j = 0; j < str1.length(); j++) {
                String s = str1.charAt(j) + "";
                if(s.equals(" ")){
                    answer += " ";
                } else {
                    answer += map.get(s);
                }
            }
            bw.write(answer + "\n");
        }
        bw.flush();
        bw.close();
    }


}