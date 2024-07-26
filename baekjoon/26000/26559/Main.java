// https://www.acmicpc.net/problem/26559
// Friends
import java.io.*;
import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class Main {

    public static void main(String[] args) throws IOException {
        BufferedReader bf = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        int testCase = Integer.parseInt(bf.readLine());
        for (int i = 0; i < testCase; i++) {
            Map<Integer, String> map = new HashMap<>();
            int size = Integer.parseInt(bf.readLine());
            for (int j = 0; j < size; j++) {
                String[] sArray = bf.readLine().split(" ");
                String name = sArray[0];
                int num = Integer.parseInt(sArray[1]);
                map.put(num, name);
            }
            List<Integer> list = new ArrayList<>(map.keySet());
            Collections.sort(list);
            StringBuilder sb = new StringBuilder();
            for (int j = list.size() - 1; j >= 0; j--) {
                sb.append(map.get(list.get(j)) + ", ");
            }
            sb.deleteCharAt(sb.length() - 1);
            sb.deleteCharAt(sb.length() - 1);
            bw.write(sb.toString() + "\n");
        }
        bw.flush();
        bw.close();
    }

}
