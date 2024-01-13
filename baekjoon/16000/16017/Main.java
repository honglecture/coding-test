// https://www.acmicpc.net/problem/16017
// Telemarketer or not?
import java.io.*;

public class Main {

    public static void main(String[] args) throws IOException {
        BufferedReader bf = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        int n1 = Integer.parseInt(bf.readLine());
        int n2 = Integer.parseInt(bf.readLine());
        int n3 = Integer.parseInt(bf.readLine());
        int n4 = Integer.parseInt(bf.readLine());
        if(n1 == 8 || n1 == 9){
            if(n4 == 8 || n4 == 9){
                if(n2 == n3){
                    System.out.println("ignore");
                } else {
                    System.out.println("answer");
                }
            } else {
                System.out.println("answer");
            }
        } else {
            System.out.println("answer");
        }
        bw.flush();
        bw.close();
    }

}
