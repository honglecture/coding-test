// https://www.acmicpc.net/problem/6187
// Going to the Movies
import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;

public class Main {

    private static int answer = 0;
    private static int max = 0;
    private static int[] array;
    private static boolean[] visitArray;

    public static void main(String[] args) throws IOException {
        BufferedReader bf = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        String[] sArray = bf.readLine().split(" ");
        max = Integer.parseInt(sArray[0]);
        int size = Integer.parseInt(sArray[1]);
        array = new int[size];
        visitArray = new boolean[size];
        for (int i = 0; i < array.length; i++) {
            array[i] = Integer.parseInt(bf.readLine());
        }
        for (int i = 1; i <= size; i++) {
            getAnswer(array, 0, i, 0);
        }
        bw.write(answer + "\n");
        bw.flush();
        bw.close();
    }

    private static void getAnswer(int[] array, int index, int count, int sum){
        if(max < sum){
            return;
        }
        if(index == count){
            answer = Integer.max(sum, answer);
            return;
        }

        for (int i = 0; i < array.length; i++) {
            if(!visitArray[i]){
                visitArray[i] = true;
                getAnswer(array, index + 1, count, sum + array[i]);
                visitArray[i] = false;
            }
        }



    }
   
}