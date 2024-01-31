// https://www.acmicpc.net/problem/11109
// 괴짜 교수
import java.io.*;
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
            int count1 = n1 + (n2 * n4);
            int count2 = n2 * n3;
            if(count1 > count2){
                bw.write("do not parallelize\n");
            } else if(count1 < count2){
                bw.write("parallelize\n");
            } else {
                bw.write("does not matter\n");
            }
        }
        bw.flush();
        bw.close();
    }

    
}