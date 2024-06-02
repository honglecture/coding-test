// https://www.acmicpc.net/problem/31922
// 이 대회는 이제 제 겁니다
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
        if(n1 + n3 > n2){
            answer = n1 + n3;
        } else {
            answer = n2;
        }
        System.out.println(answer);
        bw.flush();
        bw.close();
    }

    

}
