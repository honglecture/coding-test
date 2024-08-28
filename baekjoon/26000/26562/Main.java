// https://www.acmicpc.net/problem/26562
// Presidents
import java.io.*;
import java.util.HashMap;
import java.util.Map;

public class Main {

    public static void main(String[] args) throws IOException {
        BufferedReader bf = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        int size = Integer.parseInt(bf.readLine());
        Map<String, Integer> map = new HashMap<>();
        map.put("Franklin", 100);
        map.put("Grant", 50);
        map.put("Jackson", 20);
        map.put("Hamilton", 10);
        map.put("Lincoln", 5);
        map.put("Washington", 1);
        for (int i = 0; i < size; i++) {
            String[] sArray = bf.readLine().split(" ");
            int sum = 0;
            for (int j = 0; j < sArray.length; j++) {
                sum += map.get(sArray[j]);
            }
            bw.write("$" + sum + "\n");
        }
        bw.flush();
        bw.close();
    }

}
