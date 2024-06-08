// https://www.acmicpc.net/problem/9772
// Quadrants
import java.io.*;
import java.util.ArrayList;
import java.util.List;
public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader bf = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        while (true) {
            String[] sArray = bf.readLine().split(" ");
            double n1 = Double.parseDouble(sArray[0]);
            double n2 = Double.parseDouble(sArray[1]);
            
            if(n1 > 0 && n2 > 0){
                bw.write("Q1\n");
            } else if(n1 > 0 && n2 < 0){
                bw.write("Q4\n");
            } else if(n1 < 0 && n2 > 0){
                bw.write("Q2\n");
            } else if(n1 < 0 && n2 < 0){
                bw.write("Q3\n");
            } else {
                bw.write("AXIS\n");
            }
            if(n1 == 0 && n2 == 0){
                break;
            }
        }
        bw.flush();
        bw.close();
    }
}