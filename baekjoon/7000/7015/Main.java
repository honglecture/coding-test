// https://www.acmicpc.net/problem/7015
// Millennium
import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;

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
            int sum = 1;
            if(n1 + 1 < 1000){
                for (int j = n1 + 1; j <= 999; j++) {
                    if(j % 3 == 0){
                        sum += 200;
                    } else {
                        sum += 195;
                    }
                }
            }
            if(n2 + 1 <= 10){
                for (int j = n2 + 1; j <= 10; j++) {
                    if(n1 % 3 == 0){
                        sum += 20;
                    } else {
                        if(j % 2 == 0){
                            sum += 19;
                        } else {
                            sum += 20;
                        }
                    }
                }
            }
            if(n1 % 3 == 0){
                sum += (20 - n3);
            } else {
                if(n2 % 2 == 0){
                    sum += (19 - n3);
                } else {
                    sum += (20 - n3);
                }
            }
            bw.write(sum + "\n");
        }
        bw.flush();
        bw.close();
    }
}