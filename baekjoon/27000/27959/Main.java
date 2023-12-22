// https://www.acmicpc.net/problem/27959
// 초코바
import java.io.*;

public class Main {

    public static void main(String[] args) throws IOException {
        BufferedReader bf = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        String[] sArray = bf.readLine().split(" ");
        int n1 = Integer.parseInt(sArray[0]) * 100;
        int n2 = Integer.parseInt(sArray[1]);
        if(n1 >= n2){
            System.out.println("Yes");
        } else {
            System.out.println("No");
        }
        bw.flush();
        bw.close();
    }

    

}
