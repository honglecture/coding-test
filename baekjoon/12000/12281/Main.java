// https://www.acmicpc.net/problem/12281
// Sorting (Large)
import java.io.*;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
public class Main {
    
    public static void main(String[] args) throws IOException {
        BufferedReader bf = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        int size = Integer.parseInt(bf.readLine());
        for (int i = 0; i < size; i++) {
            bf.readLine();
            String[] sArray = bf.readLine().split(" ");
            int[] array = new int[sArray.length];
            for (int j = 0; j < array.length; j++) {
                array[j] = Integer.parseInt(sArray[j]);
            }
            int[] answerArray = getAnswer(array);
            StringBuilder answer = new StringBuilder("Case #"+(i + 1)+": ");
            for (int k = 0; k < answerArray.length; k++) {
                answer.append(answerArray[k]+ " ");
            }
            answer.deleteCharAt(answer.length() - 1);
            bw.write(answer.toString() + "\n");
        }
        bw.flush();
        bw.close();
    }


    private static int[] getAnswer(int[] array){
        int[] answerArray = new int[array.length];
        List<Integer> list1 = new ArrayList<>();
        List<Integer> list2 = new ArrayList<>();
        for (int i = 0; i < array.length; i++) {
            if(array[i] % 2 == 0){
                list2.add(array[i]);
            } else {
                list1.add(array[i]);
            }
        }
        Collections.sort(list1);
        Collections.sort(list2, Collections.reverseOrder());
        int index1 = 0;
        int index2 = 0;
        for (int i = 0; i < answerArray.length; i++) {
            int n = array[i];
            if(n % 2 == 0){
                answerArray[i] = list2.get(index2++);
            } else {
                answerArray[i] = list1.get(index1++);
            }
        }
        return answerArray;
    }

}
