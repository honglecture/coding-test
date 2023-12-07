// https://www.acmicpc.net/problem/14467
// 소가 길을 건너간 이유 1
import java.io.*;
public class Main {
    private static int[][] array;
    public static void main(String[] args) throws IOException {
        BufferedReader bf = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        int size = Integer.parseInt(bf.readLine());
        int[] array = new int[11];
        int answer = 0;
        for (int i = 0; i < array.length; i++) {
            array[i] = -1;
        }
        for (int i = 0; i < size; i++) {
            String[] sArray = bf.readLine().split(" ");
            int n1 = Integer.parseInt(sArray[0]);
            int n2 = Integer.parseInt(sArray[1]);
            if(array[n1] == -1){
                array[n1] = n2;
            } else {
                if(array[n1] != n2){
                    answer++;
                    array[n1] = n2;
                }
            }
        }
        bw.write(answer + "\n");
        bw.flush();
        bw.close();
    }
}