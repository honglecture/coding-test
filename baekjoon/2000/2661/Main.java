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
        bw.flush();
        bw.close();
    }


    private static void getAnswer(int index, int count){
        if(flag){
            return;
        }
        if(count == array.length){
            if(checkAnswer()){
                for (int i = 0; i < answerArray.length; i++) {
                    answerArray[i] = visitArray[i];
                }
                flag = true;
            }
            return;
        }
        for (int i = 0; i < array.length; i++) {
            array[index] = array[i];
            getAnswer(index + 1, count + 1);
        }
    }


    private static boolean checkAnswer(){
        boolean result = true;
        int length = 1;
        
        

        return result;
    }
   
}