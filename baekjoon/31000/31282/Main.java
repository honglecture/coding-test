// https://www.acmicpc.net/problem/31282
// ЛОВНО КУЧЕ
import java.io.*;

public class Main {

    public static void main(String[] args) throws IOException {
        BufferedReader bf = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        String[] sArray = bf.readLine().split(" ");
        int n1 = Integer.parseInt(sArray[0]);
        int n2 = Integer.parseInt(sArray[2]) - Integer.parseInt(sArray[1]);
        int answer = 0;
        if(n1 % n2 == 0){
            answer = n1 / n2;
        } else {
            answer = n1 / n2 + 1;
        }
        System.out.println(answer);
        bw.flush();
        bw.close();
    }

    

}
