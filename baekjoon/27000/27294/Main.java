// https://www.acmicpc.net/problem/27294
// 몇개고?
import java.io.*;

public class Main {

    public static void main(String[] args) throws IOException {
        BufferedReader bf = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        String[] sArray = bf.readLine().split(" ");
        int n1 = Integer.parseInt(sArray[0]);
        int n2 = Integer.parseInt(sArray[1]);
        if(n2 == 1){
            bw.write("280\n");
        } else {
            if(n1 < 12){
                bw.write("280\n");
            } else if(n1 > 16){
                bw.write("280\n");
            } else {
                bw.write("320\n");
            }
        }
        
        bw.flush();
        bw.close();
    }

    

}
