// https://www.acmicpc.net/problem/27110
// 특식 배부
import java.io.*;

public class Main {

    public static void main(String[] args) throws IOException {
        BufferedReader bf = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        int n = Integer.parseInt(bf.readLine());
        String[] sArray = bf.readLine().split(" ");
        int n1 = Integer.parseInt(sArray[0]);
        int n2 = Integer.parseInt(sArray[1]);
        int n3 = Integer.parseInt(sArray[2]);
        int answer = 0;
        if(n >= n1){
            answer += n1;
        } else {
            answer += n;
        }
        if(n >= n2){
            answer += n2;
        } else {
            answer += n;
        }
        if(n >= n3){
            answer += n3;
        } else {
            answer += n;
        }
        System.out.println(answer);
        bw.flush();
        bw.close();
    }

    

}
