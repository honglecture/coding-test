// https://www.acmicpc.net/problem/6211
// The Eating Puzzle
import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;

public class Main {

    private static int[] array;
    private static boolean[] visitArray;
    private static int key;
    private static int answer = 0;

    public static void main(String[] args) throws IOException {
        BufferedReader bf = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        String[] sArray = bf.readLine().split(" ");
        key = Integer.parseInt(sArray[0]);
        int size = Integer.parseInt(sArray[1]);
        array = new int[size];
        visitArray = new boolean[size];
        sArray = bf.readLine().split(" ");
        for (int i = 0; i < array.length; i++) {
            array[i] = Integer.parseInt(sArray[i]);
        }
        getAnswer(0, 0, 0);
        System.out.println(answer);
        bw.flush();
        bw.close();
    }

    private static void getAnswer(int index, int sum, int beforeNum){
        if(sum > key){
            int result = sum - beforeNum;
            answer = Integer.max(answer, result);
            return;
        }
        if(index == array.length){
            answer = Integer.max(answer, sum);
            return;
        }
        for (int i = 0; i < visitArray.length; i++) {
            if(!visitArray[i]){
                visitArray[i] = true;
                getAnswer(index + 1, sum + array[i], array[i]);
                visitArray[i] = false;
            }
        }
    }
   
}