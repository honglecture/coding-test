// https://www.acmicpc.net/problem/2526
// 싸이클
import java.io.*;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Map;
import java.util.Set;
public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader bf = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        String[] sArray = bf.readLine().split(" ");
        int n = Integer.parseInt(sArray[0]);
        int p = Integer.parseInt(sArray[1]);
        int start = n;
        Set<Integer> set = new HashSet<>();
        Map<Integer, Integer> map = new HashMap<>();
        int count = 1;
        int lastNum = 0;
        while (true) {
            int result = (n * start) % p;
            if(set.contains(result)){
                lastNum = result;
                break;
            }
            set.add(result);
            start = result;
            map.put(result, count++);
        }
        int answer = count - map.get(lastNum);
        System.out.println(answer);
        bw.flush();
        bw.close();
    }
}