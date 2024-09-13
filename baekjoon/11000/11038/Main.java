// https://www.acmicpc.net/problem/11038
// Entrance Examination
import java.io.*;
public class Main {

    public static void main(String[] args) throws IOException {
        BufferedReader bf = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        while (true) {
            String[] sArray = bf.readLine().split(" ");
            int size = Integer.parseInt(sArray[0]);
            int start = Integer.parseInt(sArray[1]) - 1;
            int end = Integer.parseInt(sArray[2]) - 1;
            if(size == 0){
                break;
            }
            int[] array = new int[size];
            for (int i = 0; i < array.length; i++) {
                array[i] = Integer.parseInt(bf.readLine());
            }
            int answer = 0;
            int gap = 0;
            for (int i = start; i <= end; i++) {
                int result = Math.abs(array[i] - array[i + 1]);
                if(gap <= result){
                    gap = result;
                    answer = i + 1;
                }
            }
            bw.write(answer + "\n");
        }
        bw.flush();
        bw.close();
    }
}
