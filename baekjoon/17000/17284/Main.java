// https://www.acmicpc.net/problem/17284
// Vending Machine
import java.io.*;

public class Main {

    public static void main(String[] args) throws IOException {
        BufferedReader bf = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        String[] sArray = bf.readLine().split(" ");
        int answer = 5000;
        for (int i = 0; i < sArray.length; i++) {
            int n = Integer.parseInt(sArray[i]);
            if(n == 1){
                answer -= 500;
            } else if(n == 2){
                answer -= 800;
            } else {
                answer -= 1000;
            }
        }
        System.out.println(answer);
        bw.flush();
        bw.close();
    }

}
