// https://www.acmicpc.net/problem/2467
// 용액
import java.io.*;
import java.util.Arrays;
public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader bf = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        int size = Integer.parseInt(bf.readLine());
        int[] array = new int[size];
        String[] sArray = bf.readLine().split(" ");
        for (int i = 0; i < size; i++) {
            array[i] = Integer.parseInt(sArray[i]);
        }
        Arrays.sort(array);
        int start = 0;
        int end = size - 1;
        int min =  Math.abs(array[start] + array[end]);
        int answer1 = array[0];
        int answer2 = array[size - 1];
        while(true){
            if(start == end){
                break;
            }
            int result1 = array[start] + array[end];
            int result2 = Math.abs(array[start] + array[end]);
            if(min > result2){
                answer1 = array[start];
                answer2 = array[end];
                min = result2;
            }
            if(result1 == 0){
                answer1 = array[start];
                answer2 = array[end];
                break;
            } else if(result1 > 0){
                end--;
            } else if(result1 < 0){
                start++;
            }
        }
        bw.write(answer1 + " " + answer2 + "\n");
        bw.flush();
        bw.close();
    }
}
