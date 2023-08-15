// https://www.acmicpc.net/problem/15686
// N과 M (12)
import java.io.*;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

public class Main {

    private static int[] array;
    private static int select;
    private static int[] selectArray;
    private static Set<String> answerSet;
    private static BufferedWriter bw;

    public static void main(String[] args) throws IOException {
        BufferedReader bf = new BufferedReader(new InputStreamReader(System.in));
        bw = new BufferedWriter(new OutputStreamWriter(System.out));
        String[] sArray = bf.readLine().split(" ");
        int size = Integer.parseInt(sArray[0]);
        select = Integer.parseInt(sArray[1]);
        selectArray = new int[select];
        sArray = bf.readLine().split(" ");
        array = new int[size];
        for (int i = 0; i < array.length; i++) {
            array[i] = Integer.parseInt(sArray[i]);
        }
        Arrays.sort(array);
        answerSet = new HashSet<>();
        getAnswer(0, 0);
        bw.flush();
        bw.close();
    }

    private static void getAnswer(int index, int count) throws IOException {
        if(count == select){
            String result = "";
            int[] copyArray = selectArray.clone();
            Arrays.sort(copyArray);
            for (int i = 0; i < copyArray.length; i++) {
                result += copyArray[i] + " ";
            }
            result = result.substring(0, result.length() - 1);
            if(!answerSet.contains(result)){
                answerSet.add(result);
                bw.write(result + "\n");
            }
            return;
        }
        for (int i = 0; i < array.length; i++) {
            int n = array[i];
            selectArray[index] = n;
            getAnswer(index + 1, count + 1);
        }
    }

}