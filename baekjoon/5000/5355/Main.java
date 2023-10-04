// https://www.acmicpc.net/problem/5355
//  콜센터
import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader bf = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        int size = Integer.parseInt(bf.readLine());
        for (int i = 0; i < size; i++) {
            String[] sArray = bf.readLine().split(" ");
            double n = Double.parseDouble(sArray[0]);
            for (int j = 1; j < sArray.length; j++) {
                String s = sArray[j];
                if(s.equals("@")){
                    n *= 3;
                } else if(s.equals("%")){
                    n += 5;
                } else if(s.equals("#")){
                    n -= 7;
                }
            }
            double result = Math.round(n * 100) / 100.00;
            bw.write(result + "0" + "\n");
        }

        bw.flush();
        bw.close();
    }
}