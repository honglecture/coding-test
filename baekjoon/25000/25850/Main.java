// https://www.acmicpc.net/problem/25850
// A Game Called Mind
import java.io.*;
import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;
import java.util.HashSet;
import java.util.List;
import java.util.Map;
import java.util.Set;

public class Main {

    public static void main(String[] args) throws IOException {
        BufferedReader bf = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        String answer = "";
        int size = Integer.parseInt(bf.readLine());
        List<Integer> list = new ArrayList<>();
        Map<String, Set<Integer>> map = new HashMap<>();
        for (int i = 0; i < size; i++) {
            String[] sArray = bf.readLine().split(" ");
            String key = String.valueOf((char)(i + 65));
            map.put(key, new HashSet<>());
            for (int j = 1; j < sArray.length; j++) {
                int n = Integer.parseInt(sArray[j]);
                list.add(n);
                map.get(key).add(n);
            }
        }
        Collections.sort(list);
        for (int i = 0; i < list.size(); i++) {
            int n = list.get(i);
            for (String key : map.keySet()) {
                if(map.get(key).contains(n)){
                    answer += key;
                    break;
                }
            }
        }
        System.out.println(answer);
        bw.flush();
        bw.close();
    }

}
