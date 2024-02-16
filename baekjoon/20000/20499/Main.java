// https://www.acmicpc.net/problem/20499
// Darius님 한타 안 함?
import java.io.*;

public class Main {

    public static void main(String[] args) throws IOException {
        BufferedReader bf = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        String[] sArray = bf.readLine().split("/");
        int k = Integer.parseInt(sArray[0]);
        int d = Integer.parseInt(sArray[1]);
        int a = Integer.parseInt(sArray[2]);
        if(d == 0){
            System.out.println("hasu");
        } else {
            if(k + a < d){
                System.out.println("hasu");
            } else {
                System.out.println("gosu");
            }
        }
        bw.flush();
        bw.close();
    }

}
