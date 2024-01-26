// https://www.acmicpc.net/problem/15025
// Judging Moose
import java.io.*;

public class Main {

    public static void main(String[] args) throws IOException {
        BufferedReader bf = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        String[] sArray = bf.readLine().split(" ");
        int n1 = Integer.parseInt(sArray[0]);
        int n2 = Integer.parseInt(sArray[1]);
        if(n1 == n2){
            if(n1 == 0){
                System.out.println("Not a moose");
            } else {
                int sum = n1 + n2;
                System.out.println("Even " + sum);
            }
        } else {
            int max = Integer.max(n1, n2) * 2;
            System.out.println("Odd " + max);
        }
        bw.flush();
        bw.close();
    }

    
}
