// https://www.acmicpc.net/problem/30067
// Paslėpta suma
import java.io.*;

public class Main {

    public static void main(String[] args) throws IOException {
        BufferedReader bf = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        int[] array = new int[10];
        int sum = 0;
        int answer = 0;
        for (int i = 0; i < array.length; i++) {
            array[i] = Integer.parseInt(bf.readLine());
            sum += array[i];
        }
        for (int i = 0; i < array.length; i++) {
            int n = array[i];
            if(sum - n == n){
                answer = n;
                break;
            }
        }
        System.out.println(answer);
        bw.flush();
        bw.close();
    }

    

}
