// https://www.acmicpc.net/problem/17203
// ∑|ΔEasyMAX|
import java.io.*;

public class Main {

    public static void main(String[] args) throws IOException {
        BufferedReader bf = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        String[] sArray = bf.readLine().split(" ");
        int n1 = Integer.parseInt(sArray[0]);
        int n2 = Integer.parseInt(sArray[1]);
        int[] array = new int[n1];
        sArray = bf.readLine().split(" ");
        for (int i = 0; i < array.length; i++) {
            array[i] = Integer.parseInt(sArray[i]);
        }
        for (int i = 0; i < n2; i++) {
            sArray = bf.readLine().split(" ");
            int start = Integer.parseInt(sArray[0]) - 1;
            int end = Integer.parseInt(sArray[1]) - 1;
            int answer = 0;
            if(start == end){
                bw.write(answer + "\n");
                continue;
            }
            for (int j = start; j < end; j++) {
                answer += Math.abs(array[j] - array[j + 1]);
            }
            bw.write(answer + "\n");
        }
        bw.flush();
        bw.close();
    }

   
}
