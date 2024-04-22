// https://www.acmicpc.net/problem/18398
// HOMWRK
import java.io.*;

public class Main {

    public static void main(String[] args) throws IOException {
        BufferedReader bf = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        int testCase = Integer.parseInt(bf.readLine());
        for (int i = 0; i < testCase; i++) {
            int size = Integer.parseInt(bf.readLine());
            for (int j = 0; j < size; j++) {
                String[] sArray = bf.readLine().split(" ");
                int n1 = Integer.parseInt(sArray[0]);
                int n2 = Integer.parseInt(sArray[1]);
                int answer1 = n1 + n2;
                int answer2 = n1 * n2;
                bw.write(answer1 + " " + answer2 + "\n");
            }
        }
        bw.flush();
        bw.close();
    }

}
