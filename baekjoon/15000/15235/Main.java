// https://www.acmicpc.net/problem/15235
// Olympiad Pizza
import java.io.*;
import java.util.ArrayDeque;
import java.util.Queue;

public class Main {

    public static void main(String[] args) throws IOException {
        BufferedReader bf = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        int size = Integer.parseInt(bf.readLine());
        int[] array = new int[size];
        String[] sArray = bf.readLine().split(" ");
        for (int i = 0; i < array.length; i++) {
            array[i] = Integer.parseInt(sArray[i]);
        }
        int[] answerArray = new int[size];
        int count = 1;
        while (true) {
            boolean flag = false;
            for (int i = 0; i < array.length; i++) {
                if(array[i] != 0){
                    array[i]--;
                    if(array[i] == 0){
                        answerArray[i] = count;
                    }
                    count++;
                    flag = true;
                }
            }
            if(!flag){
                break;
            }
        }
        for (int i = 0; i < answerArray.length; i++) {
            bw.write(answerArray[i] + " ");
        }
        bw.write("\n");
        bw.flush();
        bw.close();
    }

    
}
