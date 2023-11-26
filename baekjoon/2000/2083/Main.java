// https://www.acmicpc.net/problem/2083
// 럭비 클럽
import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader bf = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        while (true) {
            String[] sArray = bf.readLine().split(" ");
            String name = sArray[0];
            int age = Integer.parseInt(sArray[1]);
            int wt = Integer.parseInt(sArray[2]);
            if(name.equals("#")){
                break;
            }
            if(age > 17 || wt >= 80){
                bw.write(name + " " + "Senior\n");
            } else {
                bw.write(name + " " + "Junior\n");
            }
        }
        bw.flush();
        bw.close();
    }
}