// https://www.acmicpc.net/problem/2846
// 오르막길
import java.io.*;
public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader bf = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        int size = Integer.parseInt(bf.readLine());
        String[] sArray = bf.readLine().split(" ");
        int[] array = new int[size];
        for (int i = 0; i < array.length; i++) {
            array[i] = Integer.parseInt(sArray[i]);
        }
        int start = array[0];
        int end = array[0];
        int answer = 0;
        for (int i = 1; i < array.length; i++) {
            int n = array[i];
            if(end < n){
                end = n;
            } else {
                int result = end - start;
                if(answer < result){
                    answer = result;
                }
                start = n;
                end = n;
            }
        }
        if(start != end){
            int result = end - start;
            if(answer < result){
                answer = result;
            }
        }
        bw.write(answer + "\n");
        bw.flush();
        bw.close();
    }
}