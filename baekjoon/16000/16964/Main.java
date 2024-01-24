// https://www.acmicpc.net/problem/16964
// DFS 스페셜 저지
import java.io.*;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Map;
import java.util.Set;

public class Main {

    private static int[] array;
    private static Map<Integer, Set<Integer>> pathMap;
    private static boolean answer = true;
    private static int index = 1;

    public static void main(String[] args) throws IOException {
        BufferedReader bf = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        int size = Integer.parseInt(bf.readLine());
        pathMap = new HashMap<>();
        for (int i = 1; i <= size; i++) {
            pathMap.put(i, new HashSet<>());
        }
        for (int i = 0; i < size; i++) {
            String[] sArray = bf.readLine().split(" ");
            int n1 = Integer.parseInt(sArray[0]);
            int n2 = Integer.parseInt(sArray[1]);
            pathMap.get(n1).add(n2);
            pathMap.get(n2).add(n1);
        }
        String[] sArray = bf.readLine().split(" ");
        array = new int[sArray.length];
        for (int i = 0; i < sArray.length; i++) {
            array[i] = Integer.parseInt(sArray[i]);
        }
        getAnswer(1);
        bw.flush();
        bw.close();
    }

    private static void getAnswer(int n){
        if(!answer){
            return;
        }
        if(index >= array.length){
            return;
        }
        int currentNum = array[index++];
        Set<Integer> set = pathMap.get(n);
        if(!set.contains(currentNum)){
            answer = false;
            return;
        }
        for (int nextNum : set) {
            
        }
    }

}
