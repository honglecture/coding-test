// https://www.acmicpc.net/problem/8714
// Monety
import java.io.*;
public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader bf = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        int size = Integer.parseInt(bf.readLine());
        String[] sArray = bf.readLine().split(" ");
        int answer1 = 0;
        int answer2 = 0;
        for (int i = 0; i < sArray.length; i++) {
            int n = Integer.parseInt(sArray[i]);
            if(n == 0){
                answer1++;
            } else {
                answer2++;
            }
        }
        System.out.println(Integer.min(answer1, answer2));
        bw.flush();
        bw.close();
    }
   
}