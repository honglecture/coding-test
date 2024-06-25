// https://www.acmicpc.net/problem/2910
// 빈도 정렬
import java.io.*;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.Comparator;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader bf = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        bf.readLine();
        String[] sArray = bf.readLine().split(" ");
        List<Integer> array = new ArrayList<>();
        for (int i = 0; i < sArray.length; i++) {
            int n = Integer.parseInt(sArray[i]);
            array.add(n);
        }
        Map<Integer, Integer> map1 = new HashMap<>();
        Map<Integer, Integer> map2 = new HashMap<>();
        int count = 1;
        for (int i = 0; i < array.size(); i++) {
            int n = array.get(i);
            if(map1.get(n) == null){
                map1.put(n, 1);
            } else {
                map1.put(n, map1.get(n) + 1);
            }
            if(map2.get(n) == null){
                map2.put(n, count++);
            }
        }
        Collections.sort(array, new Comparator<Integer>() {
            @Override
            public int compare(Integer o1, Integer o2) {
                int n1 = o1;
                int n2 = o2;
                int count1 = map1.get(n1);
                int count2 = map1.get(n2);
                int rank1 = map2.get(n1);
                int rank2 = map2.get(n2);
                if(count1 == count2){
                    return rank1 - rank2;
                } else {
                    return count2 - count1;
                }
            }
        });
        for (int i = 0; i < array.size(); i++) {
            bw.write(array.get(i) + " ");
        }
        bw.write("\n");
        bw.flush();
        bw.close();
    }
}