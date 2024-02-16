// https://www.acmicpc.net/problem/30214
// An Easy-Peasy Problem
import java.io.*;

public class Main {

    public static void main(String[] args) throws IOException {
        BufferedReader bf = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        String[] sArray = bf.readLine().split(" ");
        int n1 = Integer.parseInt(sArray[0]);
        double n2 = Double.parseDouble(sArray[1]) / 2;
        if(n1 >= n2){
            System.out.println("E");
        } else {
            System.out.println("H");
        }
        bw.flush();
        bw.close();
    }

    

}
