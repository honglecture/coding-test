// https://www.acmicpc.net/problem/9950
// Rectangles
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
            int answer = 0;
            String str = "";
            if(n1 == 0 && n2 == 0 && n3 == 0){
                break;
            }
            if(n1 == 0){
                answer = n3 / n2;
                str = answer + " " + n2 + " " + n3;
            } else if(n2 == 0){
                answer = n3 / n1;
                str = n1 + " " + answer + " " + n3;
            } else {
                answer = n1 * n2;
                str = n1 + " " + n2 + " " + answer;
            }
            bw.write(str + "\n");
        }
        bw.flush();
        bw.close();
    }
}