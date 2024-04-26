// https://www.acmicpc.net/problem/30794
// 가희와 클럽 오디션 1
import java.io.*;

public class Main {

    public static void main(String[] args) throws IOException {
        BufferedReader bf = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        String[] sArray = bf.readLine().split(" ");
        int n = Integer.parseInt(sArray[0]);
        String str = sArray[1];
        int answer = 0;
        if(str.equals("miss")){
            answer = 0;
        } else if(str.equals("bad")){
            answer = n * 200;
        } else if(str.equals("cool")){
            answer = n * 400;
        } else if(str.equals("great")){
            answer = n * 600;
        } else if(str.equals("perfect")){
            answer = n * 1000;
        }
        System.out.println(answer);
        bw.flush();
        bw.close();
    }

    

}
