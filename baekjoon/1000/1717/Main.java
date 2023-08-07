// https://www.acmicpc.net/problem/1717
// 집합의 표현

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
        int n = Integer.parseInt(sArray[0]);
        int m = Integer.parseInt(sArray[1]);
        Map<Integer, Integer> map = new HashMap<>();
        for (int i = 0; i <= n; i++) {
            map.put(i, i);
        }
        for (int i = 0; i < m; i++) {
            sArray = bf.readLine().split(" ");
            int n1 = Integer.parseInt(sArray[0]);
            int n2 = Integer.parseInt(sArray[1]);
            int n3 = Integer.parseInt(sArray[2]);
            int setNum1 = map.get(n2);
            int setNum2 = map.get(n3);
            if(n1 == 0){
                int min = Integer.min(setNum1, setNum2);
                int max = Integer.max(setNum1, setNum2);
                //map.put(n2, result);
                //map.put(n3, result);
            } else {
                if(setNum1 == setNum2){
                    bw.write("YES\n");
                } else {
                    bw.write("NO\n");
                }
            }
        }
        System.out.println(map);
        bw.flush();
        bw.close();
    }


}
