// https://www.acmicpc.net/problem/11054
// 가장 긴 바이토닉 부분 수열
import java.io.*;
public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader bf = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        int size = Integer.parseInt(bf.readLine());
        String[] sArray = bf.readLine().split(" ");
        int[] array = new int[size];
        int answer = 0;
        for (int i = 0; i < sArray.length; i++) {
            array[i] = Integer.parseInt(sArray[i]);
        }
        int[] ldp = new int[size];
        int[] rdp = new int[size];
        for (int i = 0; i < ldp.length; i++) {
            ldp[i] = 1;
            for (int j = 0; j < i; j++) {
                if(array[i] > array[j]){
                    ldp[i] = Math.max(ldp[j] + 1, ldp[i]);
                }
            }
        }
        for (int i = rdp.length - 1; i >= 0; i--) {
            rdp[i] = 1;
            for (int j = rdp.length - 1; i < j; j--) {
                if(array[i] > array[j]){
                    rdp[i] = Math.max(rdp[j] + 1, rdp[i]);
                }
            }
        }
        for (int i = 0; i < rdp.length; i++) {
            int sum = rdp[i] + ldp[i];
            if(sum > answer){
                answer = sum;
            }
        }
        bw.write(answer - 1 + "\n");
        bw.flush();
        bw.close();
    }
}
