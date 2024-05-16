// https://www.acmicpc.net/problem/6752
// Time on task
import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.util.Arrays;

public class Main {

    public static void main(String[] args) throws IOException {
        BufferedReader bf = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        int key = Integer.parseInt(bf.readLine());
        int size = Integer.parseInt(bf.readLine());
        int sum = 0;
        int[] array = new int[size];
        int answer = 0;
        for (int i = 0; i < size; i++) {
            array[i] = Integer.parseInt(bf.readLine());
        }
        Arrays.sort(array);
        for (int i = 0; i < array.length; i++) {
            int n = array[i];
            sum += n;
            if(key >= sum){
                answer++;
            }
        }
        System.out.println(answer);
        bw.flush();
        bw.close();
    }

    
}