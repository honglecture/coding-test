// https://www.acmicpc.net/problem/8724
// Pinezki
import java.io.*;
public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader bf = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        int size = Integer.parseInt(bf.readLine());
        String[] sArray = bf.readLine().split(" ");
        int[] array = new int[size];
        int answer = 0;
        int count = 0;
        for (int i = 0; i < array.length; i++) {
            array[i] = Integer.parseInt(sArray[i]);
        }
        for (int i = 0; i < array.length; i++) {
            if(array[i] == 0){
                answer = Integer.max(answer, count);
                count = 0;
            } else {
                count++;
            }
        }
        answer = Integer.max(answer, count);
        System.out.println(answer);
        bw.flush();
        bw.close();
    }
   
}