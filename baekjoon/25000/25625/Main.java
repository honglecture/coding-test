// https://www.acmicpc.net/problem/25625
// 샤틀버스

import java.io.*;

public class Main {

    public static void main(String[] args) throws IOException {
        BufferedReader bf = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        String[] sArray = bf.readLine().split(" ");
        int n1 = Integer.parseInt(sArray[0]);
        int n2 = Integer.parseInt(sArray[1]);
        if(n1 <= n2){
            System.out.println(n2 - n1);
        } else {
            System.out.println(n1 + n2);
        }
        bw.flush();
        bw.close();
    }

}
