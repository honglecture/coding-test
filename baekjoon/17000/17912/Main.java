// https://www.acmicpc.net/problem/17912
// License to Launch
import java.io.*;

public class Main {

    public static void main(String[] args) throws IOException {
        BufferedReader bf = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        int size = Integer.parseInt(bf.readLine());
        String[] sArray = bf.readLine().split(" ");
        int minNum = Integer.MAX_VALUE;
        int minIndex = 0;
        for (int i = 0; i < sArray.length; i++) {
            int n = Integer.parseInt(sArray[i]);
            if(minNum > n){
                minIndex = i;
                minNum = n;
            }
        }
        System.out.println(minIndex);
        bw.flush();
        bw.close();
    }

   
}