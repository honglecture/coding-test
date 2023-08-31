// https://www.acmicpc.net/problem/2470
// 두 용액
import java.io.*;
import java.util.Arrays;
public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader bf = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        int size = Integer.parseInt(bf.readLine());
        int[] array = new int[size];
        String[] sArray = bf.readLine().split(" ");
        for (int i = 0; i < sArray.length; i++) {
            array[i] = Integer.parseInt(sArray[i]);
        }
        Arrays.sort(array);
        int start = 0;
        int end = array.length - 1;
        int[] answerArray = new int[2];
        int result = Integer.MAX_VALUE;
        while(true){
            if(start == end){
                break;
            }
            int sum = array[start] + array[end];
            int absSum = Math.abs(array[start] + array[end]);
            if(absSum < result){
                result = absSum;
                answerArray[0] = array[start];
                answerArray[1] = array[end];
            }
            if(sum == 0){
                break;
            } else if(sum > 0){
                end--;
            } else if (sum < 0){
                start++;
            }
        }
        Arrays.sort(answerArray);
        bw.write(answerArray[0] + " " + answerArray[1] + "\n");
        bw.flush();
        bw.close();
    }

}
