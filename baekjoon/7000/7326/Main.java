// https://www.acmicpc.net/problem/7326
// Number Steps
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
        int size = Integer.parseInt(bf.readLine());
        Map<String, Integer> map = new HashMap<>();
        map.put("0 0", 0);
        map.put("1 1", 1);
        int num = 4;
        int y = 2;
        int x = 2;
        while (true) {
            if(y == 6000){
                break;
            }
            map.put(x + " " + y, num);
            map.put(x + " " + (y - 2), num - 2);
            if(num % 2 == 0){
                num += 1;
            } else {
                num += 3;
            }
            y += 1;
            x += 1;
        }
        for (int i = 0; i < size; i++) {
            String[] sArray = bf.readLine().split(" ");
            int currentX = Integer.parseInt(sArray[0]);
            int currentY = Integer.parseInt(sArray[1]);
            String key = currentX + " " + currentY;
            if(map.get(key) == null){
                bw.write("No Number\n");
            } else {
                bw.write(map.get(key) + "\n");
            }
        }
        bw.flush();
        bw.close();
    }
}