// https://www.acmicpc.net/problem/21212
// Cakes
import java.io.*;

public class Main {

    public static void main(String[] args) throws IOException {
        BufferedReader bf = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        int size = Integer.parseInt(bf.readLine());
        int answer = Integer.MAX_VALUE;
        for (int i = 0; i < size; i++) {
            String[] sArray = bf.readLine().split(" ");
            int n1 = Integer.parseInt(sArray[0]);
            int n2 = Integer.parseInt(sArray[1]);
            int result = n2 / n1;
            answer = Integer.min(answer, result);
        }
        System.out.println(answer);
        bw.flush();
        bw.close();
    }

}
