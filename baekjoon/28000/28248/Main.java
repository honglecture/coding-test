// https://www.acmicpc.net/problem/28248
// Deliv-e-droid
import java.io.*;

public class Main {

    public static void main(String[] args) throws IOException {
        BufferedReader bf = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        int n1 = Integer.parseInt(bf.readLine());
        int n2 = Integer.parseInt(bf.readLine());
        int answer = n1 * 50;
        answer -= n2 * 10;
        if(n1 > n2){
            answer += 500;
        }
        System.out.println(answer);
        bw.flush();
        bw.close();
    }

  
}
