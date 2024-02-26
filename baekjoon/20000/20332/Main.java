// https://www.acmicpc.net/problem/20332
// Divvying Up
import java.io.*;

public class Main {

    public static void main(String[] args) throws IOException {
        BufferedReader bf = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        int size = Integer.parseInt(bf.readLine());
        long sum = 0;
        String[] sArray = bf.readLine().split(" ");
        for (int i = 0; i < size; i++) {
            sum += Integer.parseInt(sArray[i]);
        }
        if(sum % 3 == 0){
            System.out.println("yes");
        } else {
            System.out.println("no");
        }
        bw.flush();
        bw.close();
    }

}
