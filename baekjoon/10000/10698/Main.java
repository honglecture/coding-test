// https://www.acmicpc.net/problem/10698
// Ahmed Aly
import java.io.*;
public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader bf = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        int size = Integer.parseInt(bf.readLine());
        for (int i = 0; i < size; i++) {
            String[] sArray = bf.readLine().split(" ");
            int n1 = Integer.parseInt(sArray[0]);
            int n2 = Integer.parseInt(sArray[2]);
            int n3 = Integer.parseInt(sArray[4]);
            String type = sArray[1];
            boolean flag = false;
            if(type.equals("+")){
                if(n1 + n2 == n3){
                    flag = true;
                }
            } else {
                if(n1 - n2 == n3){
                    flag = true;
                }
            }
            if(flag){
                bw.write("Case "+(i + 1)+": YES\n");
            } else {
                bw.write("Case "+(i + 1)+": NO\n");
            }
        }
        bw.flush();
        bw.close();
    }


    

}