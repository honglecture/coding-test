// https://www.acmicpc.net/problem/24830
// Broken Calculator
import java.io.*;

public class Main {

    public static void main(String[] args) throws IOException {
        BufferedReader bf = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        int size = Integer.parseInt(bf.readLine());
        long beforeNum = 1;
        for (int i = 0; i < size; i++) {
            String[] sArray = bf.readLine().split(" ");
            int n1 = Integer.parseInt(sArray[0]);
            String type = sArray[1];
            int n2 = Integer.parseInt(sArray[2]);
            if(type.equals("+")){
                long result = (n1 + n2) - beforeNum;
                bw.write(result + "\n");
                beforeNum = result;
            } else if(type.equals("-")){
                long result =  (n1 - n2) * beforeNum;
                bw.write(result + "\n");
                beforeNum = result;
            } else if(type.equals("*")){
                long result = (long) Math.pow((n1 * n2), 2);
                bw.write(result + "\n");
                beforeNum = result;
            } else {
                if(n1 % 2 == 0){
                    long result = n1 / 2;
                    bw.write(result + "\n");
                    beforeNum = result;
                } else {
                    long result = (n1 + 1) / 2;
                    bw.write(result + "\n");
                    beforeNum = result;
                }
            }
        }
        bw.flush();
        bw.close();
    }

    

}
