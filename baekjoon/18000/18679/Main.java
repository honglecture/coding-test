// https://www.acmicpc.net/problem/18679
// Banana
import java.io.*;
import java.util.HashMap;
import java.util.Map;

public class Main {

    public static void main(String[] args) throws IOException {
        BufferedReader bf = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        int size = Integer.parseInt(bf.readLine());
        Map<String, String> map = new HashMap<>();
        for (int i = 0; i < size; i++) {
            String[] sArray = bf.readLine().split(" = ");
            String s1 = sArray[0];
            String s2 = sArray[1];
            map.put(s1, s2);
        }
        size = Integer.parseInt(bf.readLine());
        for (int i = 0; i < size; i++) {
            bf.readLine();
            StringBuilder sb = new StringBuilder();
            String[] sArray = bf.readLine().split(" ");
            for (int j = 0; j < sArray.length; j++) {
                sb.append(map.get(sArray[j]) + " ");
            }
            sb.deleteCharAt(sb.length() - 1);
            bw.write(sb.toString() + "\n");
        }
        bw.flush();
        bw.close();
    }

}
