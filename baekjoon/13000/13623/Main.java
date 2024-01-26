// https://www.acmicpc.net/problem/13623
// Zero or One
import java.io.*;
public class Main {
    
    public static void main(String[] args) throws IOException {
        BufferedReader bf = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        String[] sArray = bf.readLine().split(" ");
        int n1 = Integer.parseInt(sArray[0]);
        int n2 = Integer.parseInt(sArray[1]);
        int n3 = Integer.parseInt(sArray[2]);
        if(n1 == n2 && n2 == n3){
            System.out.println("*");
        } else {
            if(n1 == n2){
                System.out.println("C");
            } else if(n1 == n3){
                System.out.println("B");
            } else if(n2 == n3){
                System.out.println("A");
            }
        }
        bw.flush();
        bw.close();
    }

}