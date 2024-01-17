// https://www.acmicpc.net/problem/28113
// 정보섬의 대중교통
import java.io.*;

public class Main {

    public static void main(String[] args) throws IOException {
        BufferedReader bf = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        String[] sArray = bf.readLine().split(" ");
        int n1 = Integer.parseInt(sArray[0]);
        int n2 = Integer.parseInt(sArray[1]);
        int n3 = Integer.parseInt(sArray[2]);
        if(n1 > n2){
            System.out.println("Bus");
        } else if(n1 == n2){
            if(n2 == n3){
                System.out.println("Anything");
            } else if(n2 > n3) {
                System.out.println("Bus");
            } else {
                System.out.println("Bus");
            }
        } else {
            if(n2 == n3){
                System.out.println("Anything");
            } else if(n2 > n3) {
                System.out.println("Subway");
            } else {
                System.out.println("Bus");
            }
        }
        bw.flush();
        bw.close();
    }

  
}
