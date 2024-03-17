// https://www.acmicpc.net/problem/29155
// 개발자 지망생 구름이의 취업 뽀개기
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
        String[] sArray = bf.readLine().split(" ");
        int[] array = new int[sArray.length];
        Map<Integer, List<Integer>> map = new HashMap<>();
        int answer = 0;
        for (int i = 0; i < array.length; i++) {
            array[i] = Integer.parseInt(sArray[i]);
            map.put(i + 1, new ArrayList<>());
        }
        for (int i = 0; i < size; i++) {
            sArray = bf.readLine().split(" ");
            int n1 = Integer.parseInt(sArray[0]);
            int n2 = Integer.parseInt(sArray[1]);
            map.get(n1).add(n2);
        }
        for (int key : map.keySet()) {
            Collections.sort(map.get(key));
        }
        for (int i = 0; i < array.length; i++) {
            int n = array[i];
            for (int j = 0; j < n; j++) {
                int n1 = map.get(i + 1).get(j);
                answer += n1;
                if(j < n - 1){
                    answer += Math.abs(n1 - map.get(i + 1).get(j + 1));
                }
            }
            if(i != array.length - 1){
                answer += 60;
            }
        }
        System.out.println(answer);
        bw.flush();
        bw.close();
    }
}
