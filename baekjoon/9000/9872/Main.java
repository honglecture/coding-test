// https://www.acmicpc.net/problem/9872
// Record Keeping
import java.io.*;
import java.util.Arrays;
import java.util.HashMap;
import java.util.Map;
public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader bf = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        int size = Integer.parseInt(bf.readLine());
        Map<String, Integer> map = new HashMap<>();
        int answer = 0;
        for (int i = 0; i < size; i++) {
            String[] array = bf.readLine().split(" ");
            Arrays.sort(array);
            String key = array[0] + array[1] + array[2];
            if(map.get(key) == null){
                map.put(key, 1);
            } else {
                map.put(key, map.get(key) + 1);
            }
        }
        for (String key : map.keySet()) {
            answer = Integer.max(answer, map.get(key));
        }
        System.out.println(answer);
        bw.flush();
        bw.close();
    }
}