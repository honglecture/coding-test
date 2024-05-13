// https://www.acmicpc.net/problem/27566
// Blueberry Waffle
import java.io.*;

public class Main {

    public static void main(String[] args) throws IOException {
        BufferedReader bf = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        String[] sArray = bf.readLine().split(" ");
        int n1 = Integer.parseInt(sArray[0]);
        int n2 = Integer.parseInt(sArray[1]);
        int result1 = n2 / n1;
        int result2 = n2 % n1;
        int answer = result1;
        System.out.println(result1 + " " + result2);
        if(result2 != 0){
            answer++;
        }
        if(answer % 2 == 0){
            System.out.println("up");
        } else {
            System.out.println("down");
        }
        bw.flush();
        bw.close();
    }

    

}
