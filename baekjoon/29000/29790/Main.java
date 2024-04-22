// https://www.acmicpc.net/problem/29790
// 임스의 메이플컵
import java.io.*;

public class Main {

    public static void main(String[] args) throws IOException {
        BufferedReader bf = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        String[] sArray = bf.readLine().split(" ");
        int n1 = Integer.parseInt(sArray[0]);
        int n2 = Integer.parseInt(sArray[1]);
        int n3 = Integer.parseInt(sArray[2]);
        if(n1 >= 1000){
            if(n2 >= 8000 || n3 >= 260){
                System.out.println("Very Good");
            } else {
                System.out.println("Good");
            }
        } else {
            System.out.println("Bad");
        }
        bw.flush();
        bw.close();
    }

    

}
