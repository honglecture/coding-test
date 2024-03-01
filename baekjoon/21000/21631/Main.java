// https://www.acmicpc.net/problem/21631
// Checkers
import java.io.*;

public class Main {

    public static void main(String[] args) throws IOException {
        BufferedReader bf = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        String[] sArray = bf.readLine().split(" ");
        long n1 = Long.parseLong(sArray[0]);
        long n2 = Long.parseLong(sArray[1]);
        if(n1 >= n2){
            System.out.println(n2);
        } else {
            System.out.println(n1 + 1);
        }
        bw.flush();
        bw.close();
    }

}
