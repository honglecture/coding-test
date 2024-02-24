// https://www.acmicpc.net/problem/30008
// 준영이의 등급
import java.io.*;

public class Main {

    public static void main(String[] args) throws IOException {
        BufferedReader bf = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        String[] sArray = bf.readLine().split(" ");
        int n1 = Integer.parseInt(sArray[0]);
        int n2 = Integer.parseInt(sArray[1]);
        sArray = bf.readLine().split(" ");
        int[] array = new int[n2];
        for (int i = 0; i < array.length; i++) {
            array[i] = Integer.parseInt(sArray[i]);
        }
        for (int i = 0; i < array.length; i++) {
            int n = array[i] * 100;
            int result = n / n1;
            if(result > 96){
                bw.write("9 ");
            } else if(result > 89){
                bw.write("8 ");
            } else if(result > 77){
                bw.write("7 ");
            } else if(result > 60){
                bw.write("6 ");
            } else if(result > 40){
                bw.write("5 ");
            } else if(result > 23){
                bw.write("4 ");
            } else if(result > 11){
                bw.write("3 ");
            } else if(result > 4){
                bw.write("2 ");
            } else {
                bw.write("1 ");
            }
        }
        bw.write("\n");
        bw.flush();
        bw.close();
    }

    

}
