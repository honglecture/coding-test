// https://www.acmicpc.net/problem/14655
// 욱제는 도박쟁이야!!
import java.io.*;
public class Main {

    public static void main(String[] args) throws IOException {
        BufferedReader bf = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        int size = Integer.parseInt(bf.readLine());
        int sum = 0;
        String[] sArray1 = bf.readLine().split(" ");
        String[] sArray2 = bf.readLine().split(" ");
        for (int i = 0; i < size; i++) {
            int n1 = Math.abs(Integer.parseInt(sArray1[i]));
            int n2 = Math.abs(Integer.parseInt(sArray2[i]));
            sum += n1 + n2;
        }
        System.out.println(sum);
        bw.flush();
        bw.close();
    }

    
}