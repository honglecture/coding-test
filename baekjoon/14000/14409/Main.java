// https://www.acmicpc.net/problem/14409
// Tuna
import java.io.*;
public class Main {

    public static void main(String[] args) throws IOException {
        BufferedReader bf = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        int size = Integer.parseInt(bf.readLine());
        int x = Integer.parseInt(bf.readLine());
        int answer = 0;
        for (int i = 0; i < size; i++) {
            String[] sArray = bf.readLine().split(" ");
            int n1 = Integer.parseInt(sArray[0]);
            int n2 = Integer.parseInt(sArray[1]);
            if(Math.abs(n1 - n2) >  x){
                answer += Integer.parseInt(bf.readLine());
            } else {
                answer += Integer.max(n1, n2);
            }
        }
        System.out.println(answer);
        bw.flush();
        bw.close();
    }


}