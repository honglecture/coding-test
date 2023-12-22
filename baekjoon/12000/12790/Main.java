// https://www.acmicpc.net/problem/12790
// Mini Fantasy War
import java.io.*;
import java.util.Stack;
public class Main {
    
    public static void main(String[] args) throws IOException {
        BufferedReader bf = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        int size = Integer.parseInt(bf.readLine());
        for (int i = 0; i < size; i++) {
            String[] sArray = bf.readLine().split(" ");
            int n1 = Integer.parseInt(sArray[0]);
            int n2 = Integer.parseInt(sArray[1]);
            int n3 = Integer.parseInt(sArray[2]);
            int n4 = Integer.parseInt(sArray[3]);
            int n5 = Integer.parseInt(sArray[4]);
            int n6 = Integer.parseInt(sArray[5]);
            int n7 = Integer.parseInt(sArray[6]);
            int n8 = Integer.parseInt(sArray[7]);
            int result1 = n1 + n5;
            int result2 = n2 + n6;
            int result3 = n3 + n7;
            int result4 = n4 + n8;
            if(result1 <= 1){
                result1 = 1;
            }
            if(result2 <= 1){
                result2 = 1;
            }
            if(result3 <= 0){
                result3 = 0;
            }
            int answer = result1 + (result2 * 5) +  (result3 * 2) + (result4 * 2);
            bw.write(answer + "\n");
        }
        bw.flush();
        bw.close();
    }

}
