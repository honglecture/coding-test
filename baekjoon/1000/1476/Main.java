// https://www.acmicpc.net/problem/1476
// 날짜 계산

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;  

public class Main {
    
    public static void main(String[] args) throws IOException {
        BufferedReader bf = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        String[] sArray = bf.readLine().split(" ");
        int n1 = Integer.parseInt(sArray[0]);
        int n2 = Integer.parseInt(sArray[1]);
        int n3 = Integer.parseInt(sArray[2]);
        int start1 = 1;
        int start2 = 1;
        int start3 = 1;
        int count = 0;
        while(true){
            count++;
            if(n1 == start1 && n2 == start2 && n3 == start3){
                break;
            }
            start1++;
            start2++;
            start3++;
            if(start1 == 16){
                start1 = 1;
            }
            if(start2 == 29){
                start2 = 1;
            }
            if(start3 == 20){
                start3 = 1;
            }
        }
        bw.write(count + "\n");
        bw.flush();
        bw.close();
    }


}
