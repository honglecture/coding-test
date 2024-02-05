// https://www.acmicpc.net/problem/28453
// Previous Level
import java.io.*;

public class Main {

    public static void main(String[] args) throws IOException {
        BufferedReader bf = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        int size = Integer.parseInt(bf.readLine());
        String[] sArray = bf.readLine().split(" ");
        for (int i = 0; i < size; i++) {
            int n = Integer.parseInt(sArray[i]);
            if(n >= 300){
                bw.write("1 ");
            } else if(n >= 275){
                bw.write("2 ");
            } else if(n >= 250){
                bw.write("3 ");
            } else {
                bw.write("4 ");
            }
        }
        bw.write("\n");
        bw.flush();
        bw.close();
    }

  
}
