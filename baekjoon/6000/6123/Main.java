// https://www.acmicpc.net/problem/6123
// O Those Fads
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
        int answer = 0;
        String[] sArray = bf.readLine().split(" ");
        int size = Integer.parseInt(sArray[0]);
        int l = Integer.parseInt(sArray[1]);
        int k = Integer.parseInt(sArray[2]);
        int[] array = new int[size];
        for (int i = 0; i < array.length; i++) {
            array[i] = Integer.parseInt(bf.readLine());
        }
        Arrays.sort(array);
        for (int i = 0; i < array.length; i++) {
            int n = array[i];
            if(n <= l){
                answer++;
                l += k;
            } else {
                break;
            }
        }
        System.out.println(answer);
        bw.flush();
        bw.close();
    }
    
}