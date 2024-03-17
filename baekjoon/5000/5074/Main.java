// https://www.acmicpc.net/problem/5074
// When Do We Finish?
import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader bf = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        while (true) {
            String[] sArray = bf.readLine().split(" ");
            String[] array1 = sArray[0].split("\\:");
            String[] array2 = sArray[1].split("\\:");
            int h1 = Integer.parseInt(array1[0]);
            int h2 = Integer.parseInt(array2[0]);
            int m1 = Integer.parseInt(array1[1]);
            int m2 = Integer.parseInt(array2[1]);
            if(h1 == 0 && h2 == 0 && m1 == 0 && m2 == 0){
                break;
            }
            int sum1 = (h1 * 60) + m1;
            int sum2 = (h2 * 60) + m2;
            int result1 = sum1 + sum2;
            int result2 = result1 % (24 * 60);
            int currentH = result2 / 60;
            int currentM = result2 % 60;
            int day = result1 / (24 * 60);
            String strH = String.valueOf(currentH).length() == 1 ? "0" + currentH : String.valueOf(currentH);
            String strM = String.valueOf(currentM).length() == 1 ? "0" + currentM : String.valueOf(currentM);
            String strD = day != 0 ? "+" + day : "";
            bw.write(strH + ":" + strM + " " +strD +"\n");
        }
        bw.flush();
        bw.close();
    }
}