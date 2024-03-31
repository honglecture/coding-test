// https://www.acmicpc.net/problem/15036
// Just A Minim
import java.io.*;
import java.util.HashMap;
import java.util.Map;

public class Main {

    public static void main(String[] args) throws IOException {
        BufferedReader bf = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        int size = Integer.parseInt(bf.readLine());
        String[] sArray = bf.readLine().split(" ");
        Map<Integer, Double> map = new HashMap<>();
        double answer = 0;
        map.put(0, 2.0);
        map.put(1, 1.0);
        map.put(2, 0.5);
        map.put(4, 0.25);
        map.put(8, 0.125);
        map.put(16, 0.0625);
        for (int i = 0; i < sArray.length; i++) {
            int n = Integer.parseInt(sArray[i]);
            answer += map.get(n);
        }
        System.out.println(answer);
        bw.flush();
        bw.close();
    }

    
}
