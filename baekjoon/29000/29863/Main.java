// https://www.acmicpc.net/problem/29863
// Arno's Sleep Schedule
import java.io.*;

public class Main {

    public static void main(String[] args) throws IOException {
        BufferedReader bf = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        int n1 = Integer.parseInt(bf.readLine());
        int n2 = Integer.parseInt(bf.readLine());
        int answer = 0;
        if(n1 <= n2){
            answer = n2 - n1;
        } else {
            answer = (24 - n1) + n2;
        }
        System.out.println(answer);
        bw.flush();
        bw.close();
    }

    

}
