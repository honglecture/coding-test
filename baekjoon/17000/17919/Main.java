// https://www.acmicpc.net/problem/17919
// Östgötska
import java.io.*;

public class Main {

    public static void main(String[] args) throws IOException {
        BufferedReader bf = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        String[] sArray = bf.readLine().split(" ");
        double total = sArray.length;
        double sum = 0;
        for (int i = 0; i < sArray.length; i++) {
            String str = sArray[i];
            if(str.contains("ae")){
                sum++;
            }
        }
        if(sum / total * 100.0 >= 40){
            System.out.println("dae ae ju traeligt va");
        } else {
            System.out.println("haer talar vi rikssvenska");
        }
        bw.flush();
        bw.close();
    }

   
}