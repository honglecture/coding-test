// https://www.acmicpc.net/problem/9776
// Max Volume
import java.io.*;
public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader bf = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        int size = Integer.parseInt(bf.readLine());
        double answer = 0;
        for (int i = 0; i < size; i++) {
            String[] sArray = bf.readLine().split(" ");
            String type = sArray[0];
            if(type.equals("C")){
                double n1 = Double.parseDouble(sArray[1]);
                double n2 = Double.parseDouble(sArray[2]);
                double result1 = (double)1/(double)3;
                double result2 = result1 * Math.PI * Math.pow(n1, 2) * n2;
                answer = Double.max(answer, result2);
            } else if(type.equals("L")){
                double n1 = Double.parseDouble(sArray[1]);
                double n2 = Double.parseDouble(sArray[2]);
                double result1 = Math.PI * Math.pow(n1, 2) * n2;
                answer = Double.max(answer, result1);
            } else if(type.equals("S")){
                double n1 = Double.parseDouble(sArray[1]);
                double result1 = (double)4/(double)3;
                double result2 = result1 * Math.PI * Math.pow(n1, 3);
                answer = Double.max(answer, result2);
            }
        }
        bw.write(answer + "\n");
        bw.flush();
        bw.close();
    }

}