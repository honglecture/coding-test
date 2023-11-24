// https://www.acmicpc.net/problem/2491
// 수열
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
        int answer = 1;
        for (int i = 0; i < array.length - 1; i++) {
            int count = 1;
            for (int j = i; j < array.length - 1; j++) {
                int n1 = array[j];
                int n2 = array[j + 1];
                if(n1 > n2){
                    break;
                }
                count++;
            }
            if(answer < count){
                answer = count;
            }
        }
        for (int i = 0; i < array.length - 1; i++) {
            int count = 1;
            for (int j = i; j < array.length - 1; j++) {
                int n1 = array[j];
                int n2 = array[j + 1];
                if(n1 < n2){
                    break;
                }
                count++;
            }
            if(answer < count){
                answer = count;
            }
        }
        bw.write(answer + "\n");
        bw.flush();
        bw.close();
    }
}