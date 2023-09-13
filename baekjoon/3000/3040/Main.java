// https://www.acmicpc.net/problem/3040
// 백설 공주와 일곱 난쟁이
import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.util.Arrays;

public class Main {


    private static boolean[] visitArray;
    private static int[] array;
    private static boolean flag = false;

    public static void main(String[] args) throws IOException {
        BufferedReader bf = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        array = new int[9];
        for (int i = 0; i < array.length; i++) {
            array[i] = Integer.parseInt(bf.readLine());
        }
        Arrays.sort(array);
        visitArray = new boolean[9];
        getAnswer(0, 0);
        bw.flush();
        bw.close();
    }
    private static void getAnswer(int count, int index){
        if(flag){
            return;
        }
        if(count == 7){
            int sum = 0;
            for (int i = 0; i < visitArray.length; i++) {
                if(visitArray[i]){
                    sum += array[i];
                }
            }
            if(sum == 100){
                for (int i = 0; i < visitArray.length; i++) {
                if(visitArray[i]){
                    System.out.println(array[i]);
                }
            }
                flag = true;
            }
            return;
        }
        for (int i = 0; i < visitArray.length; i++) {
            if(!visitArray[i]){
                visitArray[i] = true;
                getAnswer(count + 1, index + 1);
                visitArray[i] = false;
            }
        }
    }
}