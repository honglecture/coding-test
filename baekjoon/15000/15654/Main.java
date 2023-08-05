// https://www.acmicpc.net/problem/15654
// N과 M (5)
import java.io.*;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.Comparator;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

public class Main {

    private static List<int[]> answerList = new ArrayList<>();
    private static int[] visitArray;
    private static int[] array;
    private static int n;
    private static int m;

    public static void main(String[] args) throws IOException {
        BufferedReader bf = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        String[] sArray = bf.readLine().split(" ");
        n = Integer.parseInt(sArray[0]);
        m = Integer.parseInt(sArray[1]);
        array = new int[n];
        sArray = bf.readLine().split(" ");
        for (int i = 0; i < array.length; i++) {
            array[i] = Integer.parseInt(sArray[i]);
        }
        visitArray = new int[m];
        for (int i = 0; i < visitArray.length; i++) {
            visitArray[i] = -1;
        }
        getAnswer(0, 0);
        Collections.sort(answerList, new Comparator<int[]>() {
            @Override
            public int compare(int[] o1, int[] o2) {
                for (int i = 0; i < o1.length; i++) {
                    if(o1[i] != o2[i]){
                        return o1[i] - o2[i];
                    }
                }
                return 0;
            }
        });
        for (int i = 0; i < answerList.size(); i++) {
            int[] answer = answerList.get(i);
            String result = "";
            for (int j = 0; j < answer.length; j++) {
                result += answer[j] + " ";
            }
            result = result.substring(0, result.length() - 1);
            bw.write(result + "\n");
        }
        bw.flush();
        bw.close();
    }

    private static void getAnswer(int index, int count){
        if(count == m){
            Set<Integer> set = new HashSet<>();
            for (int i = 0; i < visitArray.length; i++) {
                set.add(visitArray[i]);
            }
            int[] answer = new int[visitArray.length];
            if(set.size() == m){
                for (int i = 0; i < visitArray.length; i++) {
                    answer[i] = array[visitArray[i]];
                }
                answerList.add(answer);
            }
            return;
        }
        for (int i = 0; i < array.length; i++) {
            if(visitArray[count] != i){
                visitArray[count] = i;
                getAnswer(0, count + 1);
                visitArray[count] = -1;
            }
        }
    }
}
