// https://www.acmicpc.net/problem/15035
// I Work All Day
import java.io.*;

public class Main {

    public static void main(String[] args) throws IOException {
        BufferedReader bf = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        int size = Integer.parseInt(bf.readLine());
        String[] sArray = bf.readLine().split(" ");
        int[] array = new int[size];
        for (int i = 0; i < array.length; i++) {
            array[i] = Integer.parseInt(sArray[i]);
        }
        int key = Integer.parseInt(bf.readLine());
        int answer = 0;
        int sum = Integer.MAX_VALUE;
        for (int i = 0; i < array.length; i++) {
            int n = array[i];
            int result = key % n;
            if(result < sum){
                answer = n;
                sum = result;
            }
        }
        System.out.println(answer);
        bw.flush();
        bw.close();
    }

    
}
