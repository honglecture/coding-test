// https://www.acmicpc.net/problem/6147
// Bookshelf
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
        String[] sArray = bf.readLine().split(" ");
        int n1 = Integer.parseInt(sArray[0]);
        int n2 = Integer.parseInt(sArray[1]);
        int[] array = new int[n1];
        for (int i = 0; i < n1; i++) {
            array[i] = Integer.parseInt(bf.readLine());
        }
        Arrays.sort(array);
        int sum = 0;
        int count = 0;
        for (int i = array.length - 1; i >= 0; i--) {
            sum += array[i];
            count++;
            if(sum >= n2){
                break;
            }
        }
        System.out.println(count);
        bw.flush();
        bw.close();
    }
   
}