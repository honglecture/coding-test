// https://www.acmicpc.net/problem/21180
// Reconstruct Sum
import java.io.*;

public class Main {

    public static void main(String[] args) throws IOException {
        BufferedReader bf = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        int size = Integer.parseInt(bf.readLine());
        int[] array = new int[size];
        int sum = 0;
        String answer = "";
        boolean flag = false;
        for (int i = 0; i < array.length; i++) {
            array[i] = Integer.parseInt(bf.readLine());
            sum += array[i];
        }
        for (int i = 0; i < array.length; i++) {
            int n = array[i];
            if(sum - n == n){
                answer = String.valueOf(n);
                flag = true;
                break;
            }
        }
        if(flag){
            System.out.println(answer);
        } else {
            System.out.println("BAD");
        }
        bw.flush();
        bw.close();
    }

}
