// https://www.acmicpc.net/problem/19949
// 영재의 시험
import java.io.*;

public class Main {

    private static int[] array;
    private static int[] visitArray;
    private static int answer = 0;

    public static void main(String[] args) throws IOException {
        BufferedReader bf = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        String[] sArray = bf.readLine().split(" ");
        array = new int[10];
        visitArray = new int[10];
        for (int i = 0; i < sArray.length; i++) {
            array[i] = Integer.parseInt(sArray[i]);
        }
        getAnswer(0, 0);
        System.out.println(answer);
        bw.flush();
        bw.close();
    }

    private static void getAnswer(int index, int sum){
        if(index == 10){
            if(sum >= 5){
                answer++;
            }
            return;
        }
        if(index < 2){
            for (int i = 1; i <= 5; i++) {
                visitArray[index] = i;
                if(array[index] == i){
                    getAnswer(index + 1, sum + 1);
                } else {
                    getAnswer(index + 1, sum);
                }
            }
        } else {
            for (int i = 1; i <= 5; i++) {
                visitArray[index] = i;
                int n1 = visitArray[index - 1];
                int n2 = visitArray[index - 2];
                if(n1 == n2 && n2 == i){
                    continue;
                }
                if(array[index] == i){
                    getAnswer(index + 1, sum + 1);
                } else {
                    getAnswer(index + 1, sum);
                }
            }
        }
    }

    
}