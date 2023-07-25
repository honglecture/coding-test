// https://www.acmicpc.net/problem/1182
// 부분수열의 합
import java.io.*;
import java.util.Arrays;
public class Main {

    private static int[] array;
    private static boolean[] selectArray;
    private static int n;
    private static int answer = 0;

    public static void main(String[] args) throws IOException {
        BufferedReader bf = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        String[] sArray = bf.readLine().split(" ");
        int size = Integer.parseInt(sArray[0]);
        n = Integer.parseInt(sArray[1]);
        sArray = bf.readLine().split(" ");
        array = new int[size];
        selectArray = new boolean[size];
        for (int i = 0; i < sArray.length; i++) {
            array[i] = Integer.parseInt(sArray[i]);
        }
        Arrays.sort(array);
        getAnswer(0);
        bw.write(answer + "\n");
        bw.flush();
        bw.close();
    }

    private static void getAnswer(int index){
        int sum = 0;
        for (int i = 0; i < selectArray.length; i++) {
            if(selectArray[i]){
                sum += array[i];
            }
        }
        if(index != 0 && sum == n){
            answer++;
        }
       
        for (int i = index; i < array.length; i++) {
            selectArray[i] = true;
            getAnswer(i + 1);
            selectArray[i] = false;
        }
    }
}
