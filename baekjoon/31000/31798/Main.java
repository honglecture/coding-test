// https://www.acmicpc.net/problem/31798
// 단원평가
import java.io.*;

public class Main {

    public static void main(String[] args) throws IOException {
        BufferedReader bf = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        String[] sArray = bf.readLine().split(" ");
        int n1 = Integer.parseInt(sArray[0]);
        int n2 = Integer.parseInt(sArray[1]);
        int n3 = Integer.parseInt(sArray[2]);
        int answer = 0;
        if(n1 == 0){
            answer = (n3 * n3) - n2;
        } else if(n2 == 0){
            answer = (n3 * n3) - n1;
        } else if(n3 == 0){
            answer = (int) Math.sqrt(n1 + n2);
        }
        System.out.println(answer);
        bw.flush();
        bw.close();
    }

    

}
