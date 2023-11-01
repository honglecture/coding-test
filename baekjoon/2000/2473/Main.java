// https://www.acmicpc.net/problem/2473
// 세 용액
import java.io.*;
import java.security.DrbgParameters.Reseed;
import java.util.Arrays;
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
        Arrays.sort(array);
        String answer = "";
        long answerNum = Long.MAX_VALUE;
        for (int i = 1; i < array.length -1; i++) {
            long n = array[i];
            int start = 0;
            int end = array.length - 1;
            while(true){
                if(start == i || end == i){
                    break;
                }
                long n1 = array[start];
                long n2 = array[end];
                long result = n1 + n2 + n;
                if(Math.abs(result) < answerNum){
                    answerNum = Math.abs(result);
                    answer = n1 + " " + n + " " + n2;
                }
                if(result == 0){
                    break;
                } else if(result > 0){
                    end--;
                } else {
                    start++;
                }
            }
        }
        bw.write(answer + "\n");
        bw.flush();
        bw.close();
    }

}

