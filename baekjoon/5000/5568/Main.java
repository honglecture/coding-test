// https://www.acmicpc.net/problem/5568
// 결혼식
import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.util.HashSet;
import java.util.Set;

public class Main {

    private static String[] array;
    private static int[] answerArray;
    private static boolean[] visitArray;
    private static int k;
    private static Set<Integer> answerSet = new HashSet<>();

    public static void main(String[] args) throws IOException {
        BufferedReader bf = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        int n = Integer.parseInt(bf.readLine());
        k = Integer.parseInt(bf.readLine());
        array = new String[n];
        visitArray = new boolean[n];
        for (int i = 0; i < array.length; i++) {
            array[i] = bf.readLine();
        }
        answerArray = new int[k];
        getAnswer(0, 0);
        System.out.println(answerSet.size());
        bw.flush();
        bw.close();
    }

    private static void getAnswer(int count, int index){
        if(count == k){
            StringBuilder sb = new StringBuilder();
            for (int i = 0; i < answerArray.length; i++) {
                sb.append(String.valueOf(array[answerArray[i]]));
            }
            answerSet.add(Integer.parseInt(sb.toString()));
            return;
        }
        for (int i = 0; i < visitArray.length; i++) {
            if(!visitArray[i]){
                answerArray[index] = i;
                visitArray[i] = true;
                getAnswer(count + 1, index + 1);
                visitArray[i] = false;
            }
        }
    }


}