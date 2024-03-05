// https://www.acmicpc.net/problem/13610
// Volta
import java.io.*;
public class Main {
    
    public static void main(String[] args) throws IOException {
        BufferedReader bf = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        String[] sArray = bf.readLine().split(" ");
        int n1 = Integer.parseInt(sArray[0]);
        int n2 = Integer.parseInt(sArray[1]);
        int result = n2 - n1;
        int answer = 0;
        if(n2 % result == 0){
            answer = n2 / result;
        } else {
            answer = n2 / result + 1;
        }
        System.out.println(answer);
        bw.flush();
        bw.close();
    }

}