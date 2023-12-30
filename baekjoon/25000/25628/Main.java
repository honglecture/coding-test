// https://www.acmicpc.net/problem/25628
// 햄버거 만들기
import java.io.*;

public class Main {

    public static void main(String[] args) throws IOException {
        BufferedReader bf = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        String[] sArray = bf.readLine().split(" ");
        int n1 = Integer.parseInt(sArray[0]) / 2;
        int n2 = Integer.parseInt(sArray[1]);
        if(n1 > n2){
            System.out.println(n2);
        } else if(n1 < n2){
            System.out.println(n1);
        } else {
            System.out.println(n1);
        }
        bw.flush();
        bw.close();
    }

}
