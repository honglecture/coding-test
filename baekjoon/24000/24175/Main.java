// https://www.acmicpc.net/problem/24175
// Tokyo2020
import java.io.*;
import java.util.HashMap;
import java.util.Map;

public class Main {

    public static void main(String[] args) throws IOException {
        BufferedReader bf = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        while (true) {
            int size = Integer.parseInt(bf.readLine());
            if(size == 0){
                break;
            }
            Map<Integer, Integer> map1 = new HashMap<>();
            Map<Integer, Integer> map2 = new HashMap<>();
            for (int i = 0; i < size; i++) {
                String[] sArray = bf.readLine().split(" ");
                int n = Integer.parseInt(sArray[0]);
                String str1 = sArray[1];
                String str2 = sArray[2];
                if(str2.equals("Gold")){
                    if(map1.get(n) == null){
                        map1.put(n, 1);
                    } else {
                        map1.put(n, map1.get(n) + 1);
                    }
                }
                if(map2.get(n) == null){
                    map2.put(n, 1);
                } else {
                    map2.put(n, map2.get(n) + 1);
                }
            }
            int answer1 = 0;
            int count1 = 0;
            int answer2 = 0;
            int count2 = 0;
            for (int n : map1.keySet()) {
                int v = map1.get(n);
                if(count1 < v){
                    count1 = v;
                    answer1 = n;
                } else if(count1 == v){
                    if(answer1 > n){
                        answer1 = n;
                    }
                }
            }
            for (int n : map2.keySet()) {
                int v = map2.get(n);
                if(count2 < v){
                    count2 = v;
                    answer2 = n;
                } else if(count2 == v){
                    if(answer2 > n){
                        answer2 = n;
                    }
                }
            }
            bw.write(answer1 + " " + answer2 + "\n");
        }
        bw.flush();
        bw.close();
    }

}
