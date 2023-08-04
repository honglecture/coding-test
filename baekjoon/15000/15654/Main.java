// https://www.acmicpc.net/problem/15654
// N과 M (5)
import java.io.*;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class Main {

    private static List<String> answerList = new ArrayList<>();
    private static boolean[] visitArray;
    private static String[] strArray;
    private static int[] array;
    private static int n;
    private static int m;

    public static void main(String[] args) throws IOException {
        BufferedReader bf = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        String[] sArray = bf.readLine().split(" ");
        n = Integer.parseInt(sArray[0]);
        m = Integer.parseInt(sArray[1]);
        visitArray = new boolean[n];
        strArray = new String[n];
        array = new int[n];
        sArray = bf.readLine().split(" ");
        for (int i = 0; i < array.length; i++) {
            array[i] = Integer.parseInt(sArray[i]);
        }
        getAnswer(0, 0);
        Collections.sort(answerList);
        for (int i = 0; i < answerList.size(); i++) {
            bw.write(answerList.get(i) + "\n");
        }
        bw.flush();
        bw.close();
    }

    private static void getAnswer(int index, int count){
        if(count == m){
            String result = "";
            for (int i = 0; i < strArray.length; i++) {
                if(strArray[i] != null){
                    result += strArray[i] + " ";
                }
            }
            result = result.substring(0, result.length() - 1);
            answerList.add(result);
            return;
        }
        for (int i = index; i < array.length; i++) {
            if(!visitArray[i]){
                strArray[count] = array[i] + "";
                visitArray[i] = true;
                int nextIndex;
                if(i + 1 == array.length){
                    nextIndex = 0;
                } else {
                    nextIndex = i + 1;
                }
                getAnswer(nextIndex, count + 1);
                visitArray[i] = false;
                strArray[count] = null;
            }
        }
    }

    
}