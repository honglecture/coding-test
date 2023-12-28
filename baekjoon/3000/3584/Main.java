// https://www.acmicpc.net/problem/3584
// 가장 가까운 공통 조상
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
        for (int i = 0; i < size; i++) {
            int n = Integer.parseInt(bf.readLine());
            Map<Integer, Integer> patMap = new HashMap<>();
            for (int j = 0; j < n - 1; j++) {
                String[] sArray = bf.readLine().split(" ");
                int n1 = Integer.parseInt(sArray[0]);
                int n2 = Integer.parseInt(sArray[1]);
                patMap.put(n2, n1);
            }
            String[] sArray = bf.readLine().split(" "); 
            int n1 = Integer.parseInt(sArray[0]);
            int n2 = Integer.parseInt(sArray[1]);
            int result = getAnswer(patMap, n, n1, n2);
            bw.write(result + "\n");
        }
        bw.flush();
        bw.close();
    }

    private static int getAnswer(Map<Integer, Integer> patMap, int size, int n1, int n2){
        int result = 0;
        boolean[] visitArray = new boolean[size + 1];
        int start = n1;
        while (true) {
            visitArray[start] = true;
            if(patMap.get(start) == null){
                break;
            }
            start = patMap.get(start);
        }
        start = n2;
        while (true) {
            if(visitArray[start]){
                result = start;
                break;
            }
            start = patMap.get(start);
        }
        return result;
    }
    

}

