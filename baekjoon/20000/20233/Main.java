// https://www.acmicpc.net/problem/20233
// Bicycle
import java.io.*;

public class Main {

    public static void main(String[] args) throws IOException {
        BufferedReader bf = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        int n1 = Integer.parseInt(bf.readLine());
        int n2 = Integer.parseInt(bf.readLine());
        int n3 = Integer.parseInt(bf.readLine());
        int n4 = Integer.parseInt(bf.readLine());
        int t = Integer.parseInt(bf.readLine());
        int answer1 = n1;
        int answer2 = n3;
        int result1 = t - 30;
        int result2 = t - 45;
        if(result1 > 0){
            answer1 += (result1 * n2)  * 21;
        }
        if(result2 > 0){
            answer2 += (result2 * n4)  * 21;
        }
        System.out.println(answer1 + " " + answer2);
        bw.flush();
        bw.close();
    }

}
