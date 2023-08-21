// https://www.acmicpc.net/problem/2512
// 예산
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
        int n = Integer.parseInt(bf.readLine());
        Arrays.sort(array);
        int nmg = n;
        for (int i = 0; i < array.length; i++) {
            nmg -= array[i];
        }
        if(nmg >= 0){
            bw.write(array[array.length - 1] + "\n");
        } else {
            int start = 0;
            int end = n;
            int answer = 0;
            while(true){
                if(start > end){
                    break;
                }
                int sum = 0;
                int mid = (start + end) / 2;
                for (int i = 0; i < array.length; i++) {
                    if(array[i] <= mid){
                        sum += array[i];
                    } else {
                        sum += mid;
                    }
                }
                if(sum > n){
                    end = mid - 1;
                } else {
                    start = mid + 1;
                    answer = mid;
                }
            }
            bw.write(answer + "\n");
        }
        bw.flush();
        bw.close();
    }
}