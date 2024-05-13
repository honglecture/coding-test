// https://www.acmicpc.net/problem/13456
// Richard Hamming
import java.io.*;
public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader bf = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        int testCase = Integer.parseInt(bf.readLine());
        for (int i = 0; i < testCase; i++) {
            bf.readLine();
            String[] array1 = bf.readLine().split(" ");
            String[] array2 = bf.readLine().split(" ");
            int answer = 0;
            for (int j = 0; j < array2.length; j++) {
                int n1 = Integer.parseInt(array1[j]);
                int n2 = Integer.parseInt(array2[j]);
                if(n1 != n2){
                    answer++;
                }
            }
            bw.write(answer + "\n");
        }
        bw.flush();
        bw.close();
    }
}