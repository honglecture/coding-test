// https://www.acmicpc.net/problem/2712
// 미국 스타일
import java.io.*;
public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader bf = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        int size = Integer.parseInt(bf.readLine());
        for (int i = 0; i < size; i++) {
            String[] sArray = bf.readLine().split(" ");
            double n = Double.parseDouble(sArray[0]);
            String s = sArray[1];
            String result1 = "";
            if(s.equals("kg")){
                n *= 2.2046;
                result1 = "lb";
            } else if(s.equals("lb")){
                n *= 0.4536;
                result1 = "kg";
            } else if(s.equals("l")){
                n *= 0.2642;
                result1 = "g";
            } else if(s.equals("g")){
                n *= 3.7854;
                result1 = "l";
            }
            String result2 = String.format("%.4f", n);
            bw.write(result2 + " " + result1 + "\n");
        }
        bw.flush();
        bw.close();
    }

}