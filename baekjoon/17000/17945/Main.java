// https://www.acmicpc.net/problem/17945
// 통학의 신
import java.io.*;

public class Main {

    public static void main(String[] args) throws IOException {
        BufferedReader bf = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        String[] sArray = bf.readLine().split(" ");
        int n1 = Integer.parseInt(sArray[0]);
        int n2 = Integer.parseInt(sArray[1]);
        int result = (int) Math.sqrt((n1 * n1) - n2);
        int answer1 = -n1 + result;
        int answer2 = -n1 - result;
        if(answer1 == answer2){
            System.out.println(answer1);
        } else {
            System.out.println(Integer.min(answer1, answer2) + " " + Integer.max(answer1, answer2));
        }
        bw.flush();
        bw.close();
    }

   
}