// https://www.acmicpc.net/problem/26530
// Shipping
import java.io.*;

public class Main {

    public static void main(String[] args) throws IOException {
        BufferedReader bf = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        int testCase = Integer.parseInt(bf.readLine());
        for (int i = 0; i < testCase; i++) {
            int size = Integer.parseInt(bf.readLine());
            double sum = 0;
            String answer = "";
            for (int j = 0; j < size; j++) {
                String[] sArray = bf.readLine().split(" ");
                int n = Integer.parseInt(sArray[1]);
                double price = 0;
                if(sArray[2].charAt(0) == '.'){
                    price = Double.parseDouble("0" + sArray[2]);
                } else {
                    price = Double.parseDouble(sArray[2]);
                }
                sum += n * price;
            }
            answer = String.format("%.2f", sum);
            bw.write("$" + answer + "\n");
        }
        bw.flush();
        bw.close();
    }

}
