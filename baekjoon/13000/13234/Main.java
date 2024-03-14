// https://www.acmicpc.net/problem/13234
// George Boole
import java.io.*;
public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader bf = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        String[] sArray = bf.readLine().split(" ");
        boolean flag1 = sArray[0].equals("true") ? true : false;
        boolean flag2 = sArray[2].equals("true") ? true : false;
        if(sArray[1].equals("OR")){
            if(flag1 || flag2){
                System.out.println("true");
            } else {
                System.out.println("false");
            }
        } else {
            if(flag1 && flag2){
                System.out.println("true");
            } else {
                System.out.println("false");
            }
        }
        bw.flush();
        bw.close();
    }
    
}