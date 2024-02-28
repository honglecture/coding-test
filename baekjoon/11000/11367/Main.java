// https://www.acmicpc.net/problem/11367
// Report Card Time
import java.io.*;
public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader bf = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        int size = Integer.parseInt(bf.readLine());
        for (int i = 0; i < size; i++) {
            String[] sArray = bf.readLine().split(" ");
            String name = sArray[0];
            int n = Integer.parseInt(sArray[1]);
            String result = "";
            if(n >= 97){
                result = "A+";
            } else if(n >= 90){
                result = "A";
            } else if(n >= 87){
                result = "B+";
            } else if(n >= 80){
                result = "B";
            } else if(n >= 77){
                result = "C+";
            } else if(n >= 70){
                result = "C";
            } else if(n >= 67){
                result = "D+";
            } else if(n >= 60){
                result = "D";
            } else {
                result = "F";
            }
            bw.write(name + " " + result + "\n");
        }
        bw.flush();
        bw.close();
    }
}