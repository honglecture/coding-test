// https://www.acmicpc.net/problem/15751
// Teleportation
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
        int answer = Math.abs(n1 - n2);
        int result1 = Math.abs(n1 - n3) + Math.abs(n2 - n4);
        int result2 = Math.abs(n1 - n4) + Math.abs(n2 - n3);
        answer = Integer.min(answer, Integer.min(result1, result2));
        System.out.println(answer);
        bw.flush();
        bw.close();
    }

    
}