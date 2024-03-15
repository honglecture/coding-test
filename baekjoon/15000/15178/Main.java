// https://www.acmicpc.net/problem/15178
// Angles
import java.io.*;

public class Main {

    public static void main(String[] args) throws IOException {
        BufferedReader bf = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        int size = Integer.parseInt(bf.readLine());
        for (int i = 0; i < size; i++) {
            String[] sArray = bf.readLine().split(" ");
            int n1 = Integer.parseInt(sArray[0]);
            int n2 = Integer.parseInt(sArray[1]);
            int n3 = Integer.parseInt(sArray[2]);
            int sum = n1 + n2 + n3;
            String str = n1 + " " + n2 + " " + n3;
            if(sum == 180){
                str += " Seems OK";
            } else {
                str += " Check";
            }
            bw.write(str + "\n");
        }
        bw.flush();
        bw.close();
    }

    
}
