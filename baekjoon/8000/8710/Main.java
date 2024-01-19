// https://www.acmicpc.net/problem/8710
// Koszykarz
import java.io.*;
public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader bf = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        String[] sArray = bf.readLine().split(" ");
        int n1 = Integer.parseInt(sArray[0]);
        int n2 = Integer.parseInt(sArray[1]);
        int n3 = Integer.parseInt(sArray[2]);
        int result = n2 - n1;
        if(n1 >= n2){
            System.out.println("0");
        } else {
            if(result % n3 == 0){
                System.out.println(result / n3);
            } else {
                System.out.println((result / n3) + 1);
            }
        }
        bw.flush();
        bw.close();
    }
   
}