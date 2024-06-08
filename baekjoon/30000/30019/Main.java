// https://www.acmicpc.net/problem/30019
// 강의실 예약 시스템
import java.io.*;

public class Main {

    public static void main(String[] args) throws IOException {
        BufferedReader bf = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        String[] sArray = bf.readLine().split(" ");
        int n = Integer.parseInt(sArray[0]);
        int size = Integer.parseInt(sArray[1]);
        int[] array = new int[n + 1];

        for (int i = 0; i < size; i++) {
            sArray = bf.readLine().split(" ");
            int n1 = Integer.parseInt(sArray[0]);
            int n2 = Integer.parseInt(sArray[1]);
            int n3 = Integer.parseInt(sArray[2]);
            if(array[n1] <= n2){
                bw.write("YES\n");
                array[n1] = n3;
            } else {
                bw.write("NO\n");
            }
        }
        bw.flush();
        bw.close();
    }

    

}
