// https://www.acmicpc.net/problem/26209
// Intercepting Information
import java.io.*;

public class Main {

    public static void main(String[] args) throws IOException {
        BufferedReader bf = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        String[] sArray = bf.readLine().split(" ");
        boolean flag = true;
        for (int i = 0; i < sArray.length; i++) {
            int n = Integer.parseInt(sArray[i]);
            if(n == 9){
                flag = false;
                break;
            }
        }
        if(flag){
            System.out.println("S");
        } else {
            System.out.println("F");
        }
        bw.flush();
        bw.close();
    }

}
