// https://www.acmicpc.net/problem/14652
// 나는 행복합니다~
import java.io.*;
public class Main {

    public static void main(String[] args) throws IOException {
        BufferedReader bf = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        String[] sArray = bf.readLine().split(" ");
        int n1 = Integer.parseInt(sArray[0]);
        int n2 = Integer.parseInt(sArray[1]);
        int n3 = Integer.parseInt(sArray[2]);
        int count = 0;
        String answer = "";
        for (int i = 0; i < n1; i++) {
            for (int j = 0; j < n2; j++) {
                if(count == n3){
                    answer = i + " " + j;
                    break;
                }
                count++;
            }
            if(!answer.equals("")){
                break;
            }
        }
        bw.write(answer + "\n");
        bw.flush();
        bw.close();
    }

    
}