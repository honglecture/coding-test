// https://www.acmicpc.net/problem/26532
// Acres
import java.io.*;

public class Main {

    public static void main(String[] args) throws IOException {
        BufferedReader bf = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        String[] sArray = bf.readLine().split(" ");
        int n1 = Integer.parseInt(sArray[0]);
        int n2 = Integer.parseInt(sArray[1]);
        double result1 = n1 * n2;
        double result2 = (result1 / 4840);
        int answer = 0;
        if(result2 % 5 == 0){
            answer += result2 / 5;
        } else {
            answer += result2 / 5 + 1;
        }
        System.out.println(answer);
        bw.flush();
        bw.close();
    }

}
