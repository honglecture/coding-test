// https://www.acmicpc.net/problem/16964
// DFS 스페셜 저지
import java.io.*;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class Main {

    private static List<Integer> answerList = new ArrayList<>();
    private static Map<Integer, List<Integer>> pathMap = new HashMap<>();
    private static boolean[] visitArray;

    public static void main(String[] args) throws IOException {
        BufferedReader bf = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        int size = Integer.parseInt(bf.readLine());
        visitArray = new boolean[size + 1];
        for (int i = 1; i <= size; i++) {
            pathMap.put(i, new ArrayList<>());
        }
        for (int i = 0; i < size - 1; i++) {
            String[] sArray = bf.readLine().split(" ");
            int n1 = Integer.parseInt(sArray[0]);
            int n2 = Integer.parseInt(sArray[1]);
            pathMap.get(n1).add(n2);
            pathMap.get(n2).add(n1);
        }
        String[] sArray = bf.readLine().split(" ");
        getAnswer(1);
        if(answerList.size() == sArray.length){
            boolean flag = true;
            for (int i = 0; i < sArray.length; i++) {
                if(Integer.parseInt(sArray[i]) != answerList.get(i)){
                    flag = false;
                    break;
                }
            }
            if(flag){
                System.out.println("1");
            } else {
                System.out.println("0");
            }
        } else {
            System.out.println("0");
        }
        bw.flush();
        bw.close();
    }

    private static void getAnswer(int n){
        if(visitArray[n]){
            return;
        }
        answerList.add(n);
        visitArray[n] = true;
        List<Integer> list = pathMap.get(n);
        for (int i = 0; i < list.size(); i++) {
            getAnswer(list.get(i));
        }
    }

}
