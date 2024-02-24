// https://www.acmicpc.net/problem/10570
// Favorite Number
import java.io.*;
import java.util.HashMap;
import java.util.Map;
public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader bf = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        int testCase = Integer.parseInt(bf.readLine());
        for (int i = 0; i < testCase; i++) {
            int size = Integer.parseInt(bf.readLine());
            Map<Integer, Integer> map = new HashMap<>();
            for (int j = 0; j < size; j++) {
                int n = Integer.parseInt(bf.readLine());
                if(map.get(n) == null){
                    map.put(n, 1);
                } else {
                    map.put(n, map.get(n) + 1);
                }
            }
            int count = 0;
            int answer = 0;
            for (int key : map.keySet()) {
                if(map.get(key) > count){
                    count = map.get(key);
                    answer = key;
                } else if(map.get(key) == count){
                    if(answer > key){
                        count = map.get(key);
                        answer = key;
                    }
                }
            }
            bw.write(answer + "\n");
        }
        bw.flush();
        bw.close();
    }


    

}