// https://www.acmicpc.net/problem/11437
// LCA
import java.io.*;
import java.util.ArrayDeque;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.Queue;
public class Main {

    private static Map<Integer, List<Integer>> tempPathMap;
    private static Map<Integer, Integer> pathMap;
    private static Map<Integer, Integer> dMap;
    private static int n;

    public static void main(String[] args) throws IOException {
        BufferedReader bf = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        n = Integer.parseInt(bf.readLine());
        int size1 = n - 1;
        tempPathMap = new HashMap<>();
        pathMap = new HashMap<>();
        dMap = new HashMap<>();
        for (int i = 1; i <= n; i++) {
            tempPathMap.put(i, new ArrayList<>());
        }
        boolean[] visitArray = new boolean[n + 1];
        for (int i = 0; i < size1; i++) {
            String[] sArray = bf.readLine().split(" ");
            int n1 = Integer.parseInt(sArray[0]);
            int n2 = Integer.parseInt(sArray[1]);
            tempPathMap.get(n2).add(n1);
            tempPathMap.get(n1).add(n2);
        }

        Queue<int[]> queue = new ArrayDeque<>();
        queue.add(new int[]{1, 1});
        dMap.put(1, 1);
        while (queue.size() != 0) {
            int[] pollArray = queue.poll();
            int num = pollArray[0];
            int d = pollArray[1];
            if(visitArray[num]){
                continue;
            }
            visitArray[num] = true;
            List<Integer> list = tempPathMap.get(num);
            for (int i = 0; i < list.size(); i++) {
                int nextNum = list.get(i);
                if(visitArray[nextNum]){
                    continue;
                }
                pathMap.put(nextNum, num);
                dMap.put(nextNum, d + 1);
                queue.add(new int[]{nextNum, d + 1});
            }
        }
        
        int size2 = Integer.parseInt(bf.readLine());
        for (int i = 0; i < size2; i++) {
            String[] sArray = bf.readLine().split(" ");
            int n1 = Integer.parseInt(sArray[0]);
            int n2 = Integer.parseInt(sArray[1]);
            int result = getAnswer(n1, n2);
            bw.write(result +"\n");
        }
        bw.flush();
        bw.close();
    }
    private static int getAnswer(int n1, int n2){
        int d1 = dMap.get(n1);
        int d2 = dMap.get(n2);
        if(d1 < d2){
            int temp = n1;
            n1 = n2;
            n2 = temp;
            temp = d1;
            d1 = d2;
            d2 = temp;
        }
        int result = 0;
        Queue<Integer> queue = new ArrayDeque<>();
        queue.add(n1);
        int n3 = 0;
        while (true){
            int d = dMap.get(n1);
            if(d == d2){
                n3 = n1;
                break;
            }
            n1 = pathMap.get(n1);
        }
        queue = new ArrayDeque<>();
        while (true) {
            if(n2 == n3){
                result = n2;
                break;
            }
            n2 = pathMap.get(n2);
            n3 = pathMap.get(n3);
        }
        return result;
    }
}