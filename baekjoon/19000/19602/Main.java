// https://www.acmicpc.net/problem/19602
// Dog Treats
import java.io.*;

public class Main {

    public static void main(String[] args) throws IOException {
        BufferedReader bf = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        int n1 = Integer.parseInt(bf.readLine()) *1;
        int n2 = Integer.parseInt(bf.readLine()) *2;
        int n3 = Integer.parseInt(bf.readLine()) *3;
        int sum = n1 + n2 + n3;
        if(sum >= 10){
            System.out.println("happy");
        } else {
            System.out.println("sad");
        }
        bw.flush();
        bw.close();
    }
}