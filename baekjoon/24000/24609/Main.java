// https://www.acmicpc.net/problem/24609
// Overdraft
import java.io.*;

public class Main {

    public static void main(String[] args) throws IOException {
        BufferedReader bf = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        int size = Integer.parseInt(bf.readLine());
        int currentNum = 0;
        int min = 0;
        for (int i = 0; i < size; i++) {
            int n = Integer.parseInt(bf.readLine());
            currentNum += n;
            if(currentNum < 0){
                min = Integer.min(min, currentNum);
            }
        }
        System.out.println(Math.abs(min));
        bw.flush();
        bw.close();
    }

    

}
