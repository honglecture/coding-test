// https://www.acmicpc.net/problem/26150
// Identify, Sort, Index, Solve
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
        int size = Integer.parseInt(bf.readLine());
        Map<Integer, String> map = new HashMap<>();
        for (int i = 0; i < size; i++) {
            String[] sArray = bf.readLine().split(" ");
            String str = sArray[0];
            int n1 = Integer.parseInt(sArray[1]);
            int n2 = Integer.parseInt(sArray[2]);
            map.put(n1, String.valueOf(str.charAt(n2 - 1)));
        }
        StringBuilder sb = new StringBuilder();
        List<Integer> list = new ArrayList<>(map.keySet());
        Collections.sort(list);
        for (int i = 0; i < list.size(); i++) {
            sb.append(map.get(list.get(i)));
        }
        System.out.println(sb.toString().toUpperCase());
        bw.flush();
        bw.close();
    }

}
