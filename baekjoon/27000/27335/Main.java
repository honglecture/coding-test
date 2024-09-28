// https://www.acmicpc.net/problem/27335
// 年齢の差 (Age Difference)
import java.io.*;

public class Main {

    public static void main(String[] args) throws IOException {
        BufferedReader bf = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        int size = Integer.parseInt(bf.readLine());
        String[] sArray = bf.readLine().split(" ");
        int[] array = new int[size];
        int max = Integer.MIN_VALUE;
        int min = Integer.MAX_VALUE;
        for (int i = 0; i < array.length; i++) {
            array[i] = Integer.parseInt(sArray[i]);
            max = Integer.max(max, array[i]);
            min = Integer.min(min, array[i]);
        }
        
        for (int i = 0; i < array.length; i++) {
            int n = array[i];
            int answer = Math.abs(n - max);
            answer = Integer.max(answer, Math.abs(n - min));
            bw.write(answer + "\n");
        }
        bw.flush();
        bw.close();
    }

    

}
