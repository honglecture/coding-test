// https://www.acmicpc.net/problem/12756
// 고급 여관
import java.io.*;
public class Main {
    
    public static void main(String[] args) throws IOException {
        BufferedReader bf = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        String[] sArray1 = bf.readLine().split(" ");
        String[] sArray2 = bf.readLine().split(" ");
        int n1 = Integer.parseInt(sArray1[0]);
        int n2 = Integer.parseInt(sArray1[1]);
        int n3 = Integer.parseInt(sArray2[0]);
        int n4 = Integer.parseInt(sArray2[1]);
        while (true) {
            if(n2 <= 0 && n4 <= 0){
                System.out.println("DRAW");
                break;
            } else {
                if(n2 <= 0){
                    System.out.println("PLAYER B");
                    break;
                } else if(n4 <= 0){
                    System.out.println("PLAYER A");
                    break;
                }
            }
            n2 = n2 - n3;
            n4 = n4 - n1;
        }
        bw.flush();
        bw.close();
    }

}
