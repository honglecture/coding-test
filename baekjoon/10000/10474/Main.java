// https://www.acmicpc.net/problem/10474
// 분수좋아해?
import java.io.*;
public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader bf = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        while (true) {
            String[] sArray = bf.readLine().split(" ");
            int n1 = Integer.parseInt(sArray[0]);
            int n2 = Integer.parseInt(sArray[1]);
            if(n1 == 0 && n2 == 0){
                break;
            }
            int result1 = n1 / n2;
            int result2 = n1 % n2;
            int result3 = n2;
            bw.write(result1 + " " + result2 + " " + "/" + " " + result3 + "\n");
        }
        bw.flush();
        bw.close();
    }


    

}