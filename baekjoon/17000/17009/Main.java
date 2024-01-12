// https://www.acmicpc.net/problem/17009
// Winning Score
import java.io.*;

public class Main {

    public static void main(String[] args) throws IOException {
        BufferedReader bf = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        int n1 = Integer.parseInt(bf.readLine()) * 3;
        int n2 = Integer.parseInt(bf.readLine()) * 2;
        int n3 = Integer.parseInt(bf.readLine());
        int n4 = Integer.parseInt(bf.readLine()) * 3;
        int n5 = Integer.parseInt(bf.readLine()) * 2;
        int n6 = Integer.parseInt(bf.readLine());
        int sum1 = n1 + n2 + n3;
        int sum2 = n4 + n5 + n6;
        if(sum1 > sum2){
            System.out.println("A");
        } else if(sum1 < sum2){
            System.out.println("B");
        } else {
            System.out.println("T");
        }
        bw.flush();
        bw.close();
    }

}
