// https://www.acmicpc.net/problem/2805
// 나무 자르기
import java.io.*;
import java.util.Arrays;
public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader bf = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        String[] sArray = bf.readLine().split(" ");
        int n = Integer.parseInt(sArray[1]);
        sArray = bf.readLine().split(" ");
        int[] array = new int[sArray.length];
        for (int i = 0; i < sArray.length; i++) {
            array[i] = Integer.parseInt(sArray[i]);
        }
        Arrays.sort(array);
        int start = array[array.length - 1];
        int end = 0;
        int result = 0;
        while(true){
            if(end + 1 >= start){
                break;
            }
            int mid = (start + end) / 2;
            long sum = 0;
            for (int i = array.length - 1; i >= 0; i--) {
                if(array[i] > mid){
                    sum += array[i] - mid;
                } else if(array[i] <= mid){
                    break;
                }
            }
            if(sum < n){
                start = mid;
            } else {
                end = mid;
                result = mid;
            }
        }
        bw.write(result + "\n");
        bw.flush();
        bw.close();
    }
}