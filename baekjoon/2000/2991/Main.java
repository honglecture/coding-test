// https://www.acmicpc.net/problem/2991
// 사나운 개
import java.io.*;
public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader bf = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        String[] sArray = bf.readLine().split(" ");
        int n1 = Integer.parseInt(sArray[0]);
        int n2 = Integer.parseInt(sArray[1]);
        int n3 = Integer.parseInt(sArray[2]);
        int n4 = Integer.parseInt(sArray[3]);
        sArray = bf.readLine().split(" ");
        int h1 = Integer.parseInt(sArray[0]);
        int h2 = Integer.parseInt(sArray[1]);
        int h3 = Integer.parseInt(sArray[2]);
        int[] array = {h1, h2, h3};

        for (int i = 0; i < array.length; i++) {
            int n = array[i];
            int count = 0;
            int sum = n1 + n2;
            if(n % sum != 0){
                int num = n % sum;
                if(num <= n1){
                    count++;
                }
            } else {
                int num = sum;
                if(num <= n1){
                    count++;
                }
            }
            sum = n3 + n4;
            if(n % sum != 0){
                int num = n % sum;
                if(num <= n3){
                    count++;
                }
            } else {
                int num = sum;
                if(num <= n3){
                    count++;
                }
            }
            bw.write(count + "\n");
        }
        
        bw.flush();
        bw.close();
    }
}