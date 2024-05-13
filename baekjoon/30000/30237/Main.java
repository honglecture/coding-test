// https://www.acmicpc.net/problem/30237
// 합집합
import java.io.*;
import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

public class Main {

    public static void main(String[] args) throws IOException {
        BufferedReader bf = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        int testCase = Integer.parseInt(bf.readLine());
        for (int i = 0; i < testCase; i++) {
            int size = Integer.parseInt(bf.readLine());
            List<Set<Integer>> list = new ArrayList<>();
            for (int j = 0; j < size; j++) {
                String[] sArray = bf.readLine().split(" ");
                Set<Integer> set = new HashSet<>();
                for (int k = 1; k < sArray.length; k++) {
                    set.add(Integer.parseInt(sArray[k]));
                }
                list.add(set);
            }
            bw.write(list.toString() + "\n");
            int answer = getAnswer(list);
            bw.write(answer +"\n");
        }
        bw.flush();
        bw.close();
    }

    private static int getAnswer(List<Set<Integer>> list){
        int answer = 0;
        if(list.size() == 1){
            return answer;
        }
        for (int i = 0; i < list.size() - 1; i++) {
            Set<Integer> set1 = list.get(i);
            for (int j = i + 1; j < list.size(); j++) {
                Set<Integer> set2 = list.get(j);
                set2.addAll(set1);
                answer = Integer.max(answer, set2.size());
            }
        }
        return answer;
    }

    

}
