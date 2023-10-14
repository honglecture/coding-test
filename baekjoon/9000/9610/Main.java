// https://www.acmicpc.net/problem/9610
// 사분면
import java.io.*;
public class Main {

    public static void main(String[] args) throws IOException {
        BufferedReader bf = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        int size = Integer.parseInt(bf.readLine());
        int[] array = new int[5];
        for (int i = 0; i < size; i++) {
            String[] sArray = bf.readLine().split(" ");
            int n1 = Integer.parseInt(sArray[0]);
            int n2 = Integer.parseInt(sArray[1]);
            if(n1 == 0 || n2 == 0){
                array[0]++;
            } else {
                if(n1 > 0 && n2 > 0){
                    array[1]++;
                } else if(n1 > 0 && n2 < 0){
                    array[4]++;
                } else if(n1 < 0 && n2 > 0){
                    array[2]++;
                } else {
                    array[3]++;
                }
            }
        }
        bw.write("Q1: " + array[1] + "\n");
        bw.write("Q2: " + array[2] + "\n");
        bw.write("Q3: " + array[3] + "\n");
        bw.write("Q4: " + array[4] + "\n");
        bw.write("AXIS: " + array[0] + "\n");

        bw.flush();
        bw.close();
    }
   

}