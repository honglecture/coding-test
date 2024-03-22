// https://www.acmicpc.net/problem/9848
// Gift
import java.io.*;
public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader bf = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        String[] sArray = bf.readLine().split(" ");
        int n1 = Integer.parseInt(sArray[0]);
        int n2 = Integer.parseInt(sArray[1]);
        int[] array = new int[n1];
        int answer = 0;
        for (int i = 0; i < n1; i++) {
            array[i] = Integer.parseInt(bf.readLine());
        }
        for (int i = 0; i < array.length - 1; i++) {
            int num1 = array[i];
            int num2 = array[i + 1];
            if(num1 - num2 >= n2){
                answer++;
            }
        }
        System.out.println(answer);
        bw.flush();
        bw.close();
    }
}