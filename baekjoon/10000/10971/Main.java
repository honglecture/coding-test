// https://www.acmicpc.net/problem/10971
// 외판원 순회 2
import java.io.*;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
public class Main {

    private static Map<Integer, List<Integer>> pathMap;
    private static Map<String, Integer> costMap;
    private static int[][] array;
    private static boolean[] visitArray;
    private static int answer = Integer.MAX_VALUE;


    public static void main(String[] args) throws IOException {
        BufferedReader bf = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        int size = Integer.parseInt(bf.readLine());
        pathMap = new HashMap<>();
        for (int i = 0; i < size; i++) {
            pathMap.put(i, new ArrayList<>());
        }
        costMap = new HashMap<>();
        array = new int[size][size];
        visitArray = new boolean[size];
        for (int i = 0; i < array.length; i++) {
            String[] sArray = bf.readLine().split(" ");
            for (int j = 0; j < array[i].length; j++) {
                array[i][j] = Integer.parseInt(sArray[j]);
                if(array[i][j] == 0){
                    continue;
                }
                int n1 = i;
                int n2 = j;
                int cost = array[i][j];
                List<Integer> list = pathMap.get(n1);
                list.add(n2);
                pathMap.put(n1, list);
                costMap.put(n1 + " " + n2, cost);
            }
        }
        for (int i = 0; i < size; i++) {
            getCost(i, 0, 0, i);
        }
        bw.write(answer + "\n");
        bw.flush();
        bw.close();
    }


    private static void getCost(int num, int count, int cost, int start){
        if(count != 0 && count < array.length && num == start){
            return;
        }
        if(count == array.length && num == start){
            if(answer > cost){
                answer = cost;
            }
            return;
        }
        List<Integer> list = pathMap.get(num);
        for (int i = 0; i < list.size(); i++) {
            int nextNum = list.get(i);
            if(!visitArray[nextNum]){
                visitArray[nextNum] = true;
                getCost(nextNum, count + 1, cost + costMap.get(num + " " + nextNum), start);
                visitArray[nextNum] = false;
            }
        }
    }
}