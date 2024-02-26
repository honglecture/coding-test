// https://www.acmicpc.net/problem/25642
// 젓가락 게임
import java.io.*;

public class Main {

    public static void main(String[] args) throws IOException {
        BufferedReader bf = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        String[] sArray = bf.readLine().split(" ");
        int n1 = Integer.parseInt(sArray[0]);
        int n2 = Integer.parseInt(sArray[1]);
        boolean flag = true;
        while (true) {
            if(n1 >= 5 || n2 >= 5){
                break;
            }
            if(flag){
                n2 += n1;
                flag = false;
            } else {
                n1 += n2;
                flag = true;
            }
        }
        if(n2 >= 5){
            System.out.println("yt");
        } else {
            System.out.println("yj");
        }
        bw.flush();
        bw.close();
    }

}
