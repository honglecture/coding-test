// https://www.acmicpc.net/problem/30204
// 병영외 급식
import java.io.*;
import java.util.HashMap;
import java.util.Map;

public class Main {

    public static void main(String[] args) throws IOException {
        BufferedReader bf = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        String[] sArray = bf.readLine().split(" ");
        int n1 = Integer.parseInt(sArray[0]);
        int n2 = Integer.parseInt(sArray[1]);
        sArray = bf.readLine().split(" ");
        int sum = 0;
        for (int i = 0; i < sArray.length; i++) {
            sum += Integer.parseInt(sArray[i]);
        }
        if(sum % n2 == 0){
            System.out.println("1");
        } else {
            System.out.println("0");
        }
        bw.flush();
        bw.close();
    }

    

}
