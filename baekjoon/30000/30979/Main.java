// https://www.acmicpc.net/problem/30979
// 유치원생 파댕이 돌보기
import java.io.*;

public class Main {

    public static void main(String[] args) throws IOException {
        BufferedReader bf = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        int n = Integer.parseInt(bf.readLine());
        bf.readLine();
        String[] sArray = bf.readLine().split(" ");
        int sum = 0;
        for (int i = 0; i < sArray.length; i++) {
            sum += Integer.parseInt(sArray[i]);
        }
        if(n > sum){
            System.out.println("Padaeng_i Cry");
        } else {
            System.out.println("Padaeng_i Happy");
        }
        bw.flush();
        bw.close();
    }

    

}
