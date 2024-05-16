// https://www.acmicpc.net/problem/13280
// Selection of Participants of an Experiment
import java.io.*;
import java.util.Arrays;
public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader bf = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        while (true) {
            int size = Integer.parseInt(bf.readLine());
            if(size == 0){
                break;
            }
            int[] array = new int[size];
            String[] sArray = bf.readLine().split(" ");
            for (int i = 0; i < sArray.length; i++) {
                array[i] = Integer.parseInt(sArray[i]);
            }
            Arrays.sort(array);
            int answer = Integer.MAX_VALUE;
            for (int i = 0; i < array.length - 1; i++) {
                int n1 = array[i];
                int n2 = array[i + 1];
                answer = Integer.min(answer, Math.abs(n1 - n2));
            }
            bw.write(answer + "\n");
        }
        bw.flush();
        bw.close();
    }
}