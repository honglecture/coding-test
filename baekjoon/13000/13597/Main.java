// https://www.acmicpc.net/problem/13597
// Tri-du
import java.io.*;
public class Main {
    
    public static void main(String[] args) throws IOException {
        BufferedReader bf = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        String[] sArray = bf.readLine().split(" ");
        int n1 = Integer.parseInt(sArray[0]);
        int n2 = Integer.parseInt(sArray[1]);
        if(n1 == n2){
            System.out.println(n1);
        } else {
            int max = Integer.max(n1, n2);
            System.out.println(max);
        }
        bw.flush();
        bw.close();
    }

}