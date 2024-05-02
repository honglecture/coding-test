// https://www.acmicpc.net/problem/26906
// Vikingahackare
import java.io.*;
import java.util.HashMap;
import java.util.Map;

public class Main {

    public static void main(String[] args) throws IOException {
        BufferedReader bf = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        int size = Integer.parseInt(bf.readLine());
        StringBuilder sb = new StringBuilder();
        Map<String, String> map = new HashMap<>();
        for (int i = 0; i < size; i++) {
            String[] sArray = bf.readLine().split(" ");
            String s1 = sArray[0];
            String s2 = sArray[1];
            map.put(s2, s1);
        }
        String str = bf.readLine();
        for (int i = 0; i < str.length(); i+=4) {
            String s = str.substring(i, i + 4);
            if(map.get(s) == null){
                sb.append("?");
            } else {
                sb.append(map.get(s));
            }
        }
        System.out.println(sb.toString());
        bw.flush();
        bw.close();
    }

}
