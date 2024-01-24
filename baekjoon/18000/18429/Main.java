// https://www.acmicpc.net/problem/18429
// 근손실
import java.io.*;

public class Main {

    private static boolean[] visitArray;
    private static int[] array;
    private static int k;
    private static int n;
    private static int answer = 0;

    public static void main(String[] args) throws IOException {
        BufferedReader bf = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        String[] sArray = bf.readLine().split(" ");
        n = Integer.parseInt(sArray[0]);
        k = Integer.parseInt(sArray[1]);
        sArray = bf.readLine().split(" ");
        array = new int[n];
        visitArray = new boolean[n];
        for (int i = 0; i < array.length; i++) {
            array[i] = Integer.parseInt(sArray[i]);
        }
        getAnswer(0, 500);
        System.out.println(answer);
        bw.flush();
        bw.close();
    }

    private static void getAnswer(int count, int sum){
        if(sum < 500){
            return;
        }
        if(count == n){
            answer++;
        }
        for (int i = 0; i < array.length; i++) {
            if(!visitArray[i]){
                visitArray[i] = true;
                getAnswer(count + 1, sum - k + array[i]);
                visitArray[i] = false;
            }
        }
    }

}
