// https://www.acmicpc.net/problem/4351
// Hay Points
import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.util.HashMap;
import java.util.Map;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader bf = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        String[] sArray = bf.readLine().split(" ");
        int size1 = Integer.parseInt(sArray[0]);
        int size2 = Integer.parseInt(sArray[1]);
        Map<String, Integer> map = new HashMap<>();
        for (int i = 0; i < size1; i++) {
            sArray = bf.readLine().split(" ");
            map.put(sArray[0], Integer.parseInt(sArray[1]));
        }
        for (int i = 0; i < size2; i++) {
            int sum = 0;
            while (true) {
                String str = bf.readLine();
                if(str.equals(".")){
                    break;
                }
                sArray = str.split(" ");
                for (int j = 0; j < sArray.length; j++) {
                    String key = sArray[j];
                    if(map.get(key) != null){
                        sum += map.get(key);
                    }
                }
            }
            bw.write(sum + "\n");
        }
        bw.flush();
        bw.close();
    }
}