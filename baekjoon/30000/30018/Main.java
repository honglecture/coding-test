// https://www.acmicpc.net/problem/30018
// 타슈
import java.io.*;

public class Main {

    public static void main(String[] args) throws IOException {
        BufferedReader bf = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        int size = Integer.parseInt(bf.readLine());
        String[] sArray1 = bf.readLine().split(" ");
        String[] sArray2 = bf.readLine().split(" ");
        int answer = 0;
        for (int i = 0; i < sArray2.length; i++) {
            int n1 = Integer.parseInt(sArray1[i]);
            int n2 = Integer.parseInt(sArray2[i]);
            if(n1 > n2){
                answer += n1 - n2;
            }
        }
        System.out.println(answer);
        bw.flush();
        bw.close();
    }

    

}
