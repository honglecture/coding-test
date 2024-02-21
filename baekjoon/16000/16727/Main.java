// https://www.acmicpc.net/problem/16727
// ICPC
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
        int sum1 = n1 + n4;
        int sum2 = n2 + n3;
        
        if(sum1 > sum2){
            System.out.println("Persepolis");
        } else if(sum1 < sum2){
            System.out.println("Esteghlal");
        } else {
            if(n2 > n4){
                System.out.println("Esteghlal");
            } else if(n2 < n4){
                System.out.println("Persepolis");
            } else {
                System.out.println("Penalty");
            }
        }
        bw.flush();
        bw.close();
    }


}
