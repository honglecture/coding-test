// https://www.acmicpc.net/problem/18884
// New Year and Naming
import java.io.*;

public class Main {

    public static void main(String[] args) throws IOException {
        BufferedReader bf = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        String[] sArray = bf.readLine().split(" ");
        int size1 = Integer.parseInt(sArray[0]);
        int size2 = Integer.parseInt(sArray[1]);
        String[] array1 = bf.readLine().split(" ");
        String[] array2 = bf.readLine().split(" ");
        int size = Integer.parseInt(bf.readLine());
        for (int i = 0; i < size; i++) {
            int n = Integer.parseInt(bf.readLine()) - 1;
            String answer = array1[n % size1] + array2[n % size2];
            bw.write(answer + "\n");
        }
        bw.flush();
        bw.close();
    }

}
