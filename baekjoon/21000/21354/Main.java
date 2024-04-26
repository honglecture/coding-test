// https://www.acmicpc.net/problem/21354
// Äpplen och päron
import java.io.*;

public class Main {

    public static void main(String[] args) throws IOException {
        BufferedReader bf = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        String[] sArray = bf.readLine().split(" ");
        int n1 = Integer.parseInt(sArray[0]) * 7;
        int n2 = Integer.parseInt(sArray[1]) * 13;
        if(n1 > n2){
            System.out.println("Axel");
        } else if(n1 < n2){
            System.out.println("Petra");
        } else {
            System.out.println("lika");
        }
        bw.flush();
        bw.close();
    }

}
