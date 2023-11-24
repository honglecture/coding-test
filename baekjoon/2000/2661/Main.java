// https://www.acmicpc.net/problem/2661
// 좋은수열
import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;

public class Main {
    
    private static int[] array;
    private static int[] visitArray;
    private static int[] answerArray;
    private static boolean flag = false;

    public static void main(String[] args) throws IOException {
        BufferedReader bf = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        int size = Integer.parseInt(bf.readLine());
        array = new int[3];
        array[0] = 1;
        array[1] = 2;
        array[2] = 3;
        visitArray = new int[size];
        answerArray = new int[size];
        for (int i = 0; i < visitArray.length; i++) {
            visitArray[i] = 1;
        }
        getAnswer(0, 0);
        String answer = "";
        for (int i = 0; i < answerArray.length; i++) {
            answer += answerArray[i];
        }
        bw.write(answer + "\n");
        bw.flush();
        bw.close();
    }


    private static void getAnswer(int index, int count){
        if(flag){
            return;
        }
        if(!checkAnswer(count)){
            return;
        }
        if(count == visitArray.length){
            if(checkAnswer(count)){
                for (int i = 0; i < answerArray.length; i++) {
                    answerArray[i] = visitArray[i];
                }
                flag = true;
            }
            return;
        }
        for (int i = 0; i < array.length; i++) {
            visitArray[index] = array[i];
            getAnswer(index + 1, count + 1);
            
        }
    }
    private static boolean checkAnswer(int count){
        boolean result = true;
        String str = "";
        for (int i = 0; i < count; i++) {
            str += visitArray[i];
        }
        for (int i = 0; i < str.length(); i++) {
            for (int j = 0; j < str.length(); j++) {
                if(j + i + 1 > str.length() || j + i + 2 + i > str.length()){
                    break;
                }
                String str1 = str.substring(j, j + i + 1);
                String str2 = str.substring(j + i + 1, j + i + 2 + i);
                if(str1.equals(str2)){
                    result = false;
                    break;
                }
            }
            if(!result){
                break;
            }
        }
        return result;
    }
   
}