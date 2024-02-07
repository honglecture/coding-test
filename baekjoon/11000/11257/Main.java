// https://www.acmicpc.net/problem/11257
// IT Passport Examination
import java.io.*;
public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader bf = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        int size = Integer.parseInt(bf.readLine());
        for (int i = 0; i < size; i++) {
            String[] sArray = bf.readLine().split(" ");
            String n1 = sArray[0];
            int n2 = Integer.parseInt(sArray[1]);
            int n3 = Integer.parseInt(sArray[2]);
            int n4 = Integer.parseInt(sArray[3]);
            int sum = n2 + n3 + n4;
            String result = "PASS";
            if(sum < 55){
                result = "FAIL";
            } else {
                double d1 = 35 * 0.3;
                double d2 = 25 * 0.3;
                double d3 = 40 * 0.3;
                if(n2 < d1){
                    result = "FAIL";
                } else if(n3 < d2){
                    result = "FAIL";
                } else if(n4  < d3){
                    result = "FAIL";
                }
            }
            bw.write(n1 + " " + sum + " " + result + "\n");
        }
        bw.flush();
        bw.close();
    }

    
}