// https://www.acmicpc.net/problem/2863
// 이게 분수?
import java.io.*;
public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader bf = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        double[][] array = new double[2][2];
        String[] sArray = bf.readLine().split(" ");
        array[0][0] = Double.parseDouble(sArray[0]);
        array[0][1] = Double.parseDouble(sArray[1]);
        sArray = bf.readLine().split(" ");
        array[1][0] = Double.parseDouble(sArray[0]);
        array[1][1] = Double.parseDouble(sArray[1]);
        double max = 0;
        int count = 0;
        for (int i = 0; i < 4; i++) {
            double result1 = array[0][0] / array[1][0];
            double result2 = array[0][1] / array[1][1];
            double result = result1 + result2;
            if(max < result){
                max = result;
                count = i;
            }
            double n1 = array[0][0];
            double n2 = array[0][1];
            double n3 = array[1][0];
            double n4 = array[1][1];
            array[0][0] = n3;
            array[0][1] = n1;
            array[1][0] = n4;
            array[1][1] = n2;
        }
        bw.write(count + "\n");
        bw.flush();
        bw.close();
    }
}