// https://www.acmicpc.net/problem/31655
// International Dates
import java.io.*;

public class Main {

    public static void main(String[] args) throws IOException {
        BufferedReader bf = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        String[] sArray = bf.readLine().split("/");
        int n1 = Integer.parseInt(sArray[0]);
        int n2 = Integer.parseInt(sArray[1]);
        int n3 = Integer.parseInt(sArray[2]);
        if(n2 <= 12 && n1 <= 12){
            System.out.println("either");
        } else {
            if(n1 > 12){
                System.out.println("EU");
            } else {
                System.out.println("US");
            }
        }
        bw.flush();
        bw.close();
    }

    

}
