// https://www.acmicpc.net/problem/20674
// Statistics
import java.io.*;

public class Main {

    public static void main(String[] args) throws IOException {
        BufferedReader bf = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        int size = Integer.parseInt(bf.readLine());
        int[] array = new int[size];
        int answer = 0;
        for (int i = 0; i < size; i++) {
            array[i] = Integer.parseInt(bf.readLine());
        }
        for (int i = 1; i < array.length; i++) {
            int n1 = array[i - 1];
            int n2 = array[i];
            if(n2 > n1){
                answer += n2 - n1;
                array[i] = n1;
            }
        }
        System.out.println(answer);
        bw.flush();
        bw.close();
    }

}
