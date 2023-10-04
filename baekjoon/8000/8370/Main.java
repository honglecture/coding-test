// https://www.acmicpc.net/problem/8370
// Plane
import java.io.*;
public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader bf = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        String[] sArray = bf.readLine().split(" ");
        int n1 = Integer.parseInt(sArray[0]);
        int n2 = Integer.parseInt(sArray[1]);
        int n3 = Integer.parseInt(sArray[2]);
        int n4 = Integer.parseInt(sArray[3]);
        int sum = (n1 * n2) + (n3 * n4);
        bw.write(sum + "\n");
        bw.flush();
        bw.close();
    }
   
}