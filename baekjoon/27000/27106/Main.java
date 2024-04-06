// https://www.acmicpc.net/problem/27106
// Making Change
import java.io.*;

public class Main {

    public static void main(String[] args) throws IOException {
        BufferedReader bf = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        int n = 100 - Integer.parseInt(bf.readLine());
        int[] array = {25, 10, 5, 1};
        for (int i = 0; i < array.length; i++) {
            int d = array[i];
            if(n >= d){
                int result1 = n / d;
                int result2 = (n / d) * d;;
                bw.write(result1 + " ");
                n -= result2;
            } else {
                bw.write("0 ");
            }
        }
        bw.write("\n");
        bw.flush();
        bw.close();
    }

}
