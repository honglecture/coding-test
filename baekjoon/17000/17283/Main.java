// https://www.acmicpc.net/problem/17283
// I am Groot
import java.io.*;

public class Main {

    public static void main(String[] args) throws IOException {
        BufferedReader bf = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        int n1 = Integer.parseInt(bf.readLine());
        int n2 = Integer.parseInt(bf.readLine());
        int count = 2;
        int sum = 0;
        while (true) {
            double d1 = 0.01 * n2;
            int result = (int)(n1 * d1);
            if(result <= 5){
                break;
            }
            sum += (int) result * count;
            count *= 2;
            n1 = (int) result;
        }
        System.out.println(sum);
        bw.flush();
        bw.close();
    }

}
