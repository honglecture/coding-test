// https://www.acmicpc.net/problem/14038
// Tournament Selection
import java.io.*;
public class Main {

    public static void main(String[] args) throws IOException {
        BufferedReader bf = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        int count = 0;
        for (int i = 0; i < 6; i++) {
            String str = bf.readLine();
            if(str.equals("W")){
                count++;
            }
        }
        if(count >= 5){
            System.out.println("1");
        } else if(count >= 3){
            System.out.println("2");
        } else if(count >= 1){
            System.out.println("3");
        } else {
            System.out.println("-1");
        }
        bw.flush();
        bw.close();
    }


}