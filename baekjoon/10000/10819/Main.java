// https://www.acmicpc.net/problem/10819
// 차이를 최대로
import java.io.*;
public class Main {

    private static int answer = Integer.MIN_VALUE;
    private static int[] array;
    private static int[] answerArray;
    private static boolean[] visitArray;


    public static void main(String[] args) throws IOException {
        BufferedReader bf = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        int size = Integer.parseInt(bf.readLine());
        String[] sArray = bf.readLine().split(" ");
        array = new int[size];
        answerArray = new int[size];
        visitArray = new boolean[size];
        for (int i = 0; i < sArray.length; i++) {
            array[i] = Integer.parseInt(sArray[i]);
            answerArray[i] = Integer.MAX_VALUE;
        }
        getAnswer(0, 0);
        bw.write(answer + "\n");
        bw.flush();
        bw.close();
    }


    private static void getAnswer(int index, int count){
        if(count == array.length){

            int sum = 0;
            for (int i = 0; i < answerArray.length - 1; i++) {
                sum += Math.abs(answerArray[i] - answerArray[i + 1]);
            }
            if(answer < sum){
                answer = sum;
            }
            return;
        }
        
        for (int i = 0; i < visitArray.length; i++) {
            if(!visitArray[i]){
                visitArray[i] = true;
                answerArray[index] = array[i];
                getAnswer(index + 1, count + 1);
                visitArray[i] = false;
            }
        }

    }
}