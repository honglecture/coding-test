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

    private static Map<Integer, Integer> map;
    private static int totalSize;
    
    public static void main(String[] args) throws IOException {
        BufferedReader bf = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        String[] sArray = bf.readLine().split(" ");
        int n = Integer.parseInt(sArray[0]);
        int m = Integer.parseInt(sArray[1]);
        map = new HashMap<>();
        totalSize = n;
        for (int i = 0; i <= n; i++) {
            map.put(i, i);
        }
        for (int i = 0; i < m; i++) {
            sArray = bf.readLine().split(" ");
            int n1 = Integer.parseInt(sArray[0]);
            int n2 = Integer.parseInt(sArray[1]);
            int n3 = Integer.parseInt(sArray[2]);
            int num1 = map.get(n2);
            int num2 = map.get(n3);
            int root1 = getRoot(num1);
            int root2 = getRoot(num2);
            int min = Integer.min(root1, root2);
            int max = Integer.max(root1, root2);
            if(n1 == 0){
                // 합침
                map.put(min, max);
            } else {
                // 찾아감
                if(find(n2, n3)){
                    bw.write("YES\n");
                } else {
                    bw.write("NO\n");
                }
            }
        }
        bw.flush();
        bw.close();
    }

    private static int getRoot(int n){
        int result = 0;
        while(true){
            int currentNum = map.get(n);
            if(n == currentNum){
                result = currentNum;
                break;
            }
            n = map.get(currentNum);
        }
        return result;
    }
    private static boolean find(int start, int end){
        boolean flag = false;
        int n1 = getRoot(start);
        int n2 = getRoot(end);
        if(n1 == n2){
            flag = true;
        }        
        return flag;
    }


}
