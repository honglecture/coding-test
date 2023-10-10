// https://www.acmicpc.net/problem/2592
// 대표값
import java.io.*;
import java.util.HashMap;
import java.util.Map;
public class Main {

    public static void main(String[] args) throws IOException {
        BufferedReader bf = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        int[] array = new int[10];
        Map<Integer, Integer> map = new HashMap<>();
        int sum = 0;
        for (int i = 0; i < array.length; i++) {
            array[i] = Integer.parseInt(bf.readLine());
            sum += array[i];
            if(map.get(array[i]) == null){
                map.put(array[i], 1);
            } else {
                map.put(array[i], map.get(array[i]) + 1);
            }
        }
        int answer1 = sum / 10;
        int maxNum = 0;
        int maxCount = 0;
        for (int key : map.keySet()) {
            int count = map.get(key);
            if(count > maxCount){
                maxCount = count;
                maxNum = key;
            }
        }
        bw.write(answer1 + "\n");
        bw.write(maxNum + "\n");
        bw.flush();
        bw.close();
    }

}