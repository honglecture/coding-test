// https://www.acmicpc.net/problem/21420
// Монетки
import java.io.*;

public class Main {

    public static void main(String[] args) throws IOException {
        BufferedReader bf = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        int size = Integer.parseInt(bf.readLine());
        int count1 = 0;
        int count2 = 0;
        for (int i = 0; i < size; i++) {
            int n = Integer.parseInt(bf.readLine());
            if(n == 0){
                count1++;
            } else {
                count2++;
            }
        }
        System.out.println(Integer.min(count1, count2));
        bw.flush();
        bw.close();
    }

}
