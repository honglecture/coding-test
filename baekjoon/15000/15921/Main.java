// https://www.acmicpc.net/problem/15921
// 수찬은 마린보이야!!
import java.io.*;
import java.util.HashMap;
import java.util.Map;

public class Main {

    public static void main(String[] args) throws IOException {
        BufferedReader bf = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        int size = Integer.parseInt(bf.readLine());
        if(size == 0){
            bw.write("divide by zero\n");
        } else {
            String[] sArray = bf.readLine().split(" ");
            int[] array = new int[size];
            double sum = 0;
            Map<Integer, Integer> map = new HashMap<>();
            for (int i = 0; i < array.length; i++) {
                array[i] = Integer.parseInt(sArray[i]);
                sum += array[i];
                if(map.get(array[i]) != null){
                    map.put(array[i], map.get(array[i]) + 1);
                } else {
                    map.put(array[i], 1);
                }
            }
            double avg = sum / size;
            double gdv = 0;
            for (int key : map.keySet()) {
                double n = map.get(key);
                gdv += key * (n / (double) size);
            }
            double result = avg / gdv;
            String answer = String.format("%.2f", result);
            System.out.println(answer);
        }
        
        bw.flush();
        bw.close();
    }
    
}