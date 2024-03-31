// https://www.acmicpc.net/problem/27267
// Сравнение комнат
import java.io.*;

public class Main {

    public static void main(String[] args) throws IOException {
        BufferedReader bf = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        String[] sArray = bf.readLine().split(" ");
        int result1 = Integer.parseInt(sArray[0]) * Integer.parseInt(sArray[1]);
        int result2 = Integer.parseInt(sArray[2]) * Integer.parseInt(sArray[3]);
        if(result1 > result2){
            System.out.println("M");
        } else if(result1 < result2) {
            System.out.println("P");
        } else {
            System.out.println("E");
        }
        bw.flush();
        bw.close();
    }

    

}
