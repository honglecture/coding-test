// https://www.acmicpc.net/problem/9375
// 패션왕 신해빈
import java.io.*;
import java.util.HashMap;
import java.util.Map;
public class Main {

    private static int[] array;
    private static int answer;
    public static void main(String[] args) throws IOException {
        BufferedReader bf = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        int arraySize = Integer.parseInt(bf.readLine());
        for (int i = 0; i < arraySize; i++) {
            int size = Integer.parseInt(bf.readLine());
            Map<String, Integer> map = new HashMap<>();
            answer = 0;
            for (int j = 0; j < size; j++) {
                String[] sArray = bf.readLine().split(" ");
                String s2 = sArray[1];
                if(map.get(s2) != null){
                    map.put(s2, map.get(s2) + 1);
                } else {
                    map.put(s2, 1);
                }
            }
            array = new int[map.keySet().size()];
            int index = 0;
            for (String key : map.keySet()) {
                array[index++] = map.get(key);
            }
            getAnswer();
            bw.write(answer + "\n");
        }
        bw.flush();
        bw.close();
    }
    private static void getAnswer(){
        int result = 1;
        for (int i = 0; i < array.length; i++) {
            result *= (array[i] + 1);
        }
        answer = result - 1;
    }
}