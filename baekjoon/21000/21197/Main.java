// https://www.acmicpc.net/problem/21197
// Stopwatch
import java.io.*;

public class Main {

    public static void main(String[] args) throws IOException {
        BufferedReader bf = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        int size = Integer.parseInt(bf.readLine());
        if(size % 2 != 0){
            System.out.println("still running");
        } else {
            int sum = 0;
            int[] array = new int[size];
            for (int i = 0; i < array.length; i++) {
                array[i] = Integer.parseInt(bf.readLine());
            }
            for (int i = 0; i < array.length; i += 2) {
                int n1 = array[i];
                int n2 = array[i + 1];
                sum += n2 - n1;
            }
            System.out.println(sum);
        }
        bw.flush();
        bw.close();
    }

}
