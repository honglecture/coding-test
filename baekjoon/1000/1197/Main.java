// https://www.acmicpc.net/problem/1197
// 최소 스패닝 트리
import java.io.*;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
public class Main {

    public static void main(String[] args) throws IOException {
        BufferedReader bf = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        String[] sArray = bf.readLine().split(" ");
        int size1 = Integer.parseInt(sArray[0]);
        int size2 = Integer.parseInt(sArray[1]);
        Map<Integer, List<Integer>> pathMap = new HashMap<>();
        Map<String, Integer> costMap = new HashMap<>();
        for (int i = 0; i < size2; i++) {
            sArray = bf.readLine().split(" ");
            int n1 = Integer.parseInt(sArray[0]);
            int n2 = Integer.parseInt(sArray[1]);
            int cost = Integer.parseInt(sArray[2]);
            List<Integer> list = new ArrayList<>();
            if(pathMap.get(n1) != null){
                list = pathMap.get(n1);
            }
            list.add(n2);
            pathMap.put(n1, list);
            list = new ArrayList<>();
            if(pathMap.get(n2) != null){
                list = pathMap.get(n2);
            }
            list.add(n1);
            pathMap.put(n2, list);
            costMap.put(n1 + " " + n2, cost);
            costMap.put(n2 + " " + n1, cost);
        }

        System.out.println(pathMap);
        System.out.println(costMap);

        bw.flush();
        bw.close();
    }

}
