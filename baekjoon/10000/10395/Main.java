// https://www.acmicpc.net/problem/10395
// Automated Checking Machine
import java.io.*;
public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader bf = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        boolean flag = true;
        String[] sArray1 = bf.readLine().split(" ");
        String[] sArray2 = bf.readLine().split(" ");
        for (int i = 0; i < sArray2.length; i++) {
            String s1 = sArray1[i];
            String s2 = sArray2[i];
            if(s1.equals("0") && s2.equals("1")){
            } else if(s1.equals("1") && s2.equals("0")){
            } else {
                flag = false;
            }
        }
        if(flag){
            System.out.println("Y");
        } else {
            System.out.println("N");
        }
        bw.flush();
        bw.close();
    }

}



