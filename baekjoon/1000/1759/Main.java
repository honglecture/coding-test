// https://www.acmicpc.net/problem/1759
// 암호 만들기

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;

public class Main {

    private static String[] array;

    private static List<String> answerList = new ArrayList<>();

    private static int size;
    
    private static boolean[] checkArray;
    public static void main(String[] args) throws IOException {
        BufferedReader bf = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        String[] sArray = bf.readLine().split(" ");
        size = Integer.parseInt(sArray[0]);
        int n2 = Integer.parseInt(sArray[1]);
        array = new String[n2];
        checkArray = new boolean[n2];
        sArray = bf.readLine().split(" ");
        for (int i = 0; i < sArray.length; i++) {
            array[i] = sArray[i];
        }
        Arrays.sort(array);
        getAnswer(0, 0);
        Collections.sort(answerList);
        for (int i = 0; i < answerList.size(); i++) {
            bw.write(answerList.get(i) + "\n");
        }
        bw.flush();
        bw.close();
    }

    private static void getAnswer(int index, int count){
        if(size == count){
            String result = "";
            for (int i = 0; i < checkArray.length; i++) {
                if(checkArray[i]){
                    result += array[i];
                }
            }
            int count1 = 0;
            int count2 = 0;
            for (int i = 0; i < result.length(); i++) {
                char c = result.charAt(i);
                if(c == 'a' || c == 'e' || c == 'i' || c == 'o' || c == 'u'){
                    count1++;
                } else {
                    count2++;
                }
            }
            if(count1 > 0 && count2 > 1){
                answerList.add(result);
            }
            return;
        }
        for (int i = index; i < array.length; i++) {
            if(!checkArray[i]){
                checkArray[i] = true;
                getAnswer(i + 1, count + 1);
                checkArray[i] = false;
            }
        }
    }

   
}

