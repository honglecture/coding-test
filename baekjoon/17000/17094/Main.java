// https://www.acmicpc.net/problem/17094
// Serious Problem
import java.io.*;
import java.util.Arrays;

public class Main {

    public static void main(String[] args) throws IOException {
        BufferedReader bf = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        int size = Integer.parseInt(bf.readLine());
        String str = bf.readLine();
        int sum1 = 0;
        int sum2 = 0;
        for (int i = 0; i < str.length(); i++) {
            char c = str.charAt(i);
            if(c == '2'){
                sum2++;
            } else {
                sum1++;
            }
        }
        if(sum1 > sum2){
            System.out.println("e");
        } else if(sum1 < sum2) {
            System.out.println("2");
        } else {
            System.out.println("yee");
        }
        bw.flush();
        bw.close();
    }

}
