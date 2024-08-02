// https://www.acmicpc.net/problem/23895
// Allocation
import java.io.*;
import java.util.Arrays;

public class Main {

    public static void main(String[] args) throws IOException {
        BufferedReader bf = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        int size = Integer.parseInt(bf.readLine());
        for (int i = 0; i < size; i++) {
            String[] sArray = bf.readLine().split(" ");
            int n1 = Integer.parseInt(sArray[0]);
            int n2 = Integer.parseInt(sArray[1]);
            sArray = bf.readLine().split(" ");
            int[] array = new int[n1];
            for (int j = 0; j < array.length; j++) {
                array[j] = Integer.parseInt(sArray[j]);
            }
            Arrays.sort(array);
            int sum = 0;
            int answer = 0;
            for (int j = 0; j < array.length; j++) {
                sum += array[j];
                if(sum > n2){
                    break;
                }
                answer++;
            }
            bw.write("Case #"+(i + 1)+": " + answer + "\n");
        }
        bw.flush();
        bw.close();
    }

}
