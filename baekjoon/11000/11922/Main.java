// https://www.acmicpc.net/problem/11922
// BELA
import java.io.*;
import java.util.Comparator;
import java.util.HashMap;
import java.util.Map;
import java.util.PriorityQueue;
import java.util.Queue;
public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader bf = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        Map<String, String> map = new HashMap<>();
        map.put("A", "11 11");
        map.put("K", "4 4");
        map.put("Q", "3 3");
        map.put("J", "20 2");
        map.put("T", "10 10");
        map.put("9", "14 0");
        map.put("8", "0 0");
        map.put("7", "0 0");
        String[] sArray = bf.readLine().split(" ");
        int n = Integer.parseInt(sArray[0]);
        String type = sArray[1];
        int sum = 0;
        for (int i = 0; i < n * 4; i++) {
            sArray = bf.readLine().split("");
            String s1 = sArray[0];
            String s2 = sArray[1];
            sArray = map.get(s1).split(" ");
            int n1 = Integer.parseInt(sArray[0]);
            int n2 = Integer.parseInt(sArray[1]);
            if(s2.equals(type)){
                sum += n1;
            } else {
                sum += n2;
            }
        }
        System.out.println(sum);
        bw.flush();
        bw.close();
    }
}