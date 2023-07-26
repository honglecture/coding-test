// https://www.acmicpc.net/problem/6603
// 로또
import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.util.ArrayList;
import java.util.List;

public class Main {

    private static int[] array;
    private static List<String> answerList;
    private static boolean[] checkArray;
    private static int size;

    public static void main(String[] args) throws IOException {
        BufferedReader bf = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        while(true){
            String[] sArray = bf.readLine().split(" ");
            size = Integer.parseInt(sArray[0]);
            if(size == 0){
                break;
            }
            array = new int[size];
            answerList = new ArrayList<>();
            checkArray = new boolean[size];
            for (int i = 0; i < array.length; i++) {
                array[i] = Integer.parseInt(sArray[i + 1]);
            }
            getAnswer(0, 0);
            for (int i = 0; i < answerList.size(); i++) {
                bw.write(answerList.get(i) + "\n");
            }
            bw.write("\n");
        }
        bw.flush();
        bw.close();
    }

    private static void getAnswer(int index, int count){
        if(count == 6){
            String result = "";
            for (int i = 0; i < checkArray.length; i++) {
                if(checkArray[i]){
                    result += array[i] + " ";
                }
            }
            answerList.add(result);
            return;
        }
        for (int i = index; i < array.length; i++) {
            checkArray[i] = true;
            getAnswer(i + 1, count + 1);
            checkArray[i] = false;
        }
    }
}