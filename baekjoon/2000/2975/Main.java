// https://www.acmicpc.net/problem/2975
// Transactions
import java.io.*;
public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader bf = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        while (true) {
            String[] sArray = bf.readLine().split(" ");
            int n1 = Integer.parseInt(sArray[0]);
            String type = sArray[1];
            int n2 = Integer.parseInt(sArray[2]);
            if(n1== 0 && n2 == 0 && type.equals("W")){
                break;
            }
            if(type.equals("W")){
                int result = n1 - n2;
                if(result >= -200){
                    bw.write(result + "\n");
                } else {
                    bw.write("Not allowed\n");
                }
            } else {
                int result = n1 + n2;
                bw.write(result + "\n");
            }
        }
        bw.flush();
        bw.close();
    }
}