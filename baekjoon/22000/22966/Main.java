// https://www.acmicpc.net/problem/22966
// 가장 쉬운 문제를 찾는 문제
import java.io.*;

public class Main {

    public static void main(String[] args) throws IOException {
        BufferedReader bf = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        int size = Integer.parseInt(bf.readLine());
        int minNum = Integer.MAX_VALUE;
        String answer = "";
        for (int i = 0; i < size; i++) {
            String[] sArray = bf.readLine().split(" ");
            String name = sArray[0];
            int n = Integer.parseInt(sArray[1]);
            if(minNum > n){
                minNum = n;
                answer = name;
            }
        }
        System.out.println(answer);
        bw.flush();
        bw.close();
    }

}
