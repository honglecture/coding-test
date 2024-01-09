// https://www.acmicpc.net/problem/1233
// 주사위
import java.io.*;
import java.util.HashMap;
import java.util.Map;
public class Main {

    public static void main(String[] args) throws IOException {
        BufferedReader bf = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        String[] sArray = bf.readLine().split(" ");
        int n1 = Integer.parseInt(sArray[0]);
        int n2 = Integer.parseInt(sArray[1]);
        int n3 = Integer.parseInt(sArray[2]);
        Map<Integer, Integer> map = new HashMap<>();
        for (int i = 1; i <= n1; i++) {
            for (int j = 1; j <= n2; j++) {
                for (int k = 1; k <= n3; k++) {
                    int sum = i + j + k;
                    if(map.get(sum) == null){
                        map.put(sum, 1);
                    } else {
                        map.put(sum, map.get(sum) + 1);
                    }
                }
            }
        }
        int maxNum = 0;
        int maxCount = 0;
        for (int n : map.keySet()) {
            int count = map.get(n);
            if(maxCount < count){
                maxNum = n;
                maxCount = count;
            } else if(maxCount == count){
                if(maxNum > n){
                    maxNum = n;
                }
            }
        }
        System.out.println(maxNum);
        bw.flush();
        bw.close();
    }

}
