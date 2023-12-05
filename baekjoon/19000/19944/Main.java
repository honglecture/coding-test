// https://www.acmicpc.net/problem/19944
// 뉴비의 기준은 뭘까?
import java.io.*;

public class Main {

    public static void main(String[] args) throws IOException {
        BufferedReader bf = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        String[] sArray = bf.readLine().split(" ");
        int n1 = Integer.parseInt(sArray[0]);
        int n2 = Integer.parseInt(sArray[1]);
        if(n2 <= 2){
            bw.write("NEWBIE!\n");
        } else {
            if(n2 <= n1 && n2 != 1 && n2 != 2){
                bw.write("OLDBIE!\n");
            } else {
                bw.write("TLE!\n");
            }
        }
        bw.flush();
        bw.close();
    }

    
}