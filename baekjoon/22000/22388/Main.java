// https://www.acmicpc.net/problem/22388
// 改元
import java.io.*;

public class Main {

    public static void main(String[] args) throws IOException {
        BufferedReader bf = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        while (true) {
            String str = bf.readLine();
            if(str.equals("#")){
                break;
            }
            String[] sArray = str.split(" ");
            String name = sArray[0];
            int n1 = Integer.parseInt(sArray[1]);
            int n2 = Integer.parseInt(sArray[2]);
            int n3 = Integer.parseInt(sArray[3]);
            if(n1 > 31){
                bw.write("? " + (n1 - 30) + " " + n2 + " " + n3 + "\n");
            } else if(n1 < 31){
                bw.write(name + " " + n1 + " " + n2 + " " + n3 + "\n");
            } else {
                if(n2 < 5){
                    bw.write(name + " " + n1 + " " + n2 + " " + n3 + "\n");
                } else {
                    bw.write("? " + (n1 - 30) + " " + n2 + " " + n3 + "\n");
                }
            }
        }
        bw.flush();
        bw.close();
    }

}
