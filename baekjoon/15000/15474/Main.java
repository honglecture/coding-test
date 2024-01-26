// https://www.acmicpc.net/problem/15474
// 鉛筆 (Pencils)
import java.io.*;

public class Main {

    public static void main(String[] args) throws IOException {
        BufferedReader bf = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        String[] sArray = bf.readLine().split(" ");
        int n = Integer.parseInt(sArray[0]);
        int n1 = Integer.parseInt(sArray[1]);
        int n2 = Integer.parseInt(sArray[2]);
        int n3 = Integer.parseInt(sArray[3]);
        int n4 = Integer.parseInt(sArray[4]);
        int answer1 = 0;
        int answer2 = 0;
        if(n % n1 == 0){
            answer1 = (n / n1) * n2;
        } else {
            answer1 = (n / n1 + 1) * n2;
        }
        if(n % n3 == 0){
            answer2 = (n / n3) * n4;
        } else {
            answer2 = (n / n3 + 1) * n4;
        }
        System.out.println(Integer.min(answer1, answer2));
        bw.flush();
        bw.close();
    }

    
}
