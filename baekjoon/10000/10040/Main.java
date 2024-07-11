// https://www.acmicpc.net/problem/10040
// 투표
import java.io.*;
import java.util.HashMap;
import java.util.Map;
public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader bf = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        String[] sArray = bf.readLine().split(" ");
        int size1 = Integer.parseInt(sArray[0]);
        int size2 = Integer.parseInt(sArray[1]);
        int[] array = new int[size1];
        Map<Integer, Integer> map = new HashMap<>();
        int answer = 0;
        for (int i = 0; i < array.length; i++) {
            array[i] = Integer.parseInt(bf.readLine());
        }
        for (int i = 0; i < size2; i++) {
            int n = Integer.parseInt(bf.readLine());
            int index = -1;
            int max = -1;
            for (int j = 0; j < array.length; j++) {
                if(array[j] <= n){
                    if(max < array[j]){
                        index = j + 1;
                        max = array[j];
                    }
                }
                
            }
            //System.out.println(index + " " + max);
            bw.write(index + " " + max + "\n");
            if(map.get(index) == null){
                map.put(index, 1);
            } else {
                map.put(index, map.get(index) + 1);
            }
        }
        System.out.println(map);
        bw.flush();
        bw.close();
    }
}