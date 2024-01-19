// https://www.acmicpc.net/problem/10599
// 페르시아의 왕들
import java.io.*;
public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader bf = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        while (true) {
            String[] sArray = bf.readLine().split(" ");
            int n1 = Integer.parseInt(sArray[0]);
            int n2 = Integer.parseInt(sArray[1]);
            int n3 = Integer.parseInt(sArray[2]);
            int n4 = Integer.parseInt(sArray[3]);
            if(n1 == 0 && n2 == 0 && n3 == 0 && n4 == 0){
                break;
            }
            int result1 = Math.abs(n2 - n3);
            int result2 = Math.abs(n1 - n4);
            bw.write(result1 + " " + result2 + "\n");
        }
        bw.flush();
        bw.close();
    }


    

}