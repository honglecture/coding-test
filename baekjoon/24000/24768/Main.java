// https://www.acmicpc.net/problem/24768
// Left Beehind
import java.io.*;

public class Main {

    public static void main(String[] args) throws IOException {
        BufferedReader bf = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        while (true) {
            String[] sArray = bf.readLine().split(" ");
            int n1 = Integer.parseInt(sArray[0]);
            int n2 = Integer.parseInt(sArray[1]);
            if(n1 == 0 && n2 == 0){
                break;
            }
            if(n1 + n2 == 13){
                bw.write("Never speak again.\n");
            } else {
                if(n1 > n2){
                    bw.write("To the convention.\n");
                } else if(n1 < n2){
                    bw.write("Left beehind.\n");
                } else {
                    bw.write("Undecided.\n");
                }
            }
        }
        bw.flush();
        bw.close();
    }

    

}
