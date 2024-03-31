// https://www.acmicpc.net/problem/30793
// gahui and sousenkyo 3
import java.io.*;

public class Main {

    public static void main(String[] args) throws IOException {
        BufferedReader bf = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        String[] sArray = bf.readLine().split(" ");
        double n1 = Integer.parseInt(sArray[0]);
        double n2 = Integer.parseInt(sArray[1]);
        double result = n1 / n2;
        if(result < 0.2){
            System.out.println("weak");
        } else if(result < 0.4){
            System.out.println("normal");
        } else if(result < 0.6){
            System.out.println("strong");
        } else {
            System.out.println("very strong");
        }
        bw.flush();
        bw.close();
    }

    

}
