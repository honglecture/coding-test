// https://www.acmicpc.net/problem/2309
// 일곱 난쟁이
import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.util.Arrays;
import java.util.HashSet;
import java.util.Set;

public class Main {

    private static int[] answerArray = new int[7];
    
    public static void main(String[] args) throws IOException {
        BufferedReader bf = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        int[] array = new int[9];
        Set<Integer> set = new HashSet<>();
        for (int i = 0; i < array.length; i++) {
            array[i] = Integer.parseInt(bf.readLine());
            set.add(array[i]);
        }
        getAnswer(array, set, new int[7], 0, 0);
        Arrays.sort(answerArray);
        for (int i = 0; i < answerArray.length; i++) {
            bw.write(answerArray[i] + "\n");
        }
        bw.flush();
        bw.close();
    }

    private static void getAnswer(int[] array, Set<Integer> set, int[] tempArray, int index, int sum){
        if(index == 7){
            if(sum == 100){
                for (int i = 0; i < tempArray.length; i++) {
                    answerArray[i] = tempArray[i];
                }
            }
            return;
        }
        if(answerArray[0] != 0){
            return;
        }
        for (int i = 0; i < array.length; i++) {
            int n = array[i];
            if(set.contains(n)){
                tempArray[index] = n;
                set.remove(n);
                getAnswer(array, set, tempArray, index + 1, sum + n);
                tempArray[index] = 0;
                set.add(n);
            }
        }
    }
}