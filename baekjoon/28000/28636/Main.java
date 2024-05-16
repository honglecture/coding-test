// https://www.acmicpc.net/problem/28636
// Марафонец
import java.io.*;

public class Main {

    public static void main(String[] args) throws IOException {
        BufferedReader bf = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        int size = Integer.parseInt(bf.readLine());
        int h = 0;
        int m = 0;
        int s = 0;
        for (int i = 0; i < size; i++) {
            String[] sArray = bf.readLine().split(":");
            int n1 = Integer.parseInt(sArray[0]);
            int n2 = Integer.parseInt(sArray[1]);
            m += n1;
            s += n2;
        }
        if(s >= 60){
            m += s / 60;
            s = s % 60;
        }
        if(m >= 60){
            h += m / 60;
            m = m % 60;
        }
        String result1 = String.valueOf(h);
        String restul2 = String.valueOf(m);
        String result3 = String.valueOf(s);
        if(h < 10){
            result1 = "0" + result1;
        }
        if(m < 10){
            restul2 = "0" + restul2;
        }
        if(s < 10){
            result3 = "0" + result3;
        }
        System.out.println(result1 + ":" + restul2 + ":" + result3);
        bw.flush();
        bw.close();
    }

  
}
