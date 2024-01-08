// https://www.acmicpc.net/problem/2511
// 카드놀이
import java.io.*;
public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader bf = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        String[] sArray1 = bf.readLine().split(" ");
        String[] sArray2 = bf.readLine().split(" ");
        int finalWinner = 0;
        int answer1 = 0;
        int answer2 = 0;
        for (int i = 0; i < sArray1.length; i++) {
            int n1 = Integer.parseInt(sArray1[i]);
            int n2 = Integer.parseInt(sArray2[i]);
            if(n1 > n2){
                finalWinner = 1;
                answer1 += 3;
            } else if(n1 < n2){
                finalWinner = 2;
                answer2 += 3;
            } else {
                answer1 += 1;
                answer2 += 1;
            }
        }
        System.out.println(answer1 + " " + answer2);
        if(answer1 > answer2){
            System.out.println("A");
        } else if(answer1 < answer2){
            System.out.println("B");
        } else {
            if(finalWinner == 0){
                System.out.println("D");
            } else {
                if(finalWinner == 1){
                    System.out.println("A");
                } else {
                    System.out.println("B");
                }
            }
        }
        bw.flush();
        bw.close();
    }

    
}