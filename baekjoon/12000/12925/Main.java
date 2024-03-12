// https://www.acmicpc.net/problem/12925
// Numbers
import java.io.*;
public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader bf = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        int size = Integer.parseInt(bf.readLine());
        for (int i = 0; i < size; i++) {
            String answer = "Case #"+(i + 1)+": ";
            String result = "";
            int n = Integer.parseInt(bf.readLine());
            double n1 = 3 + Math.sqrt(5);
            double n2 = Math.pow(n1, n);
            String[] sArray = String.valueOf(n2).split("\\.");
            String str = sArray[0];
            int length = str.length();
            if(str.length() > 2){
                result = str.charAt(length - 3) + "" + str.charAt(length - 2) + "" + str.charAt(length - 1);
            } else {
                if(str.length() == 1){
                    result = "00" + str.charAt(length - 1);
                } else {
                    result = "0" + str.charAt(length - 2) + "" + str.charAt(length - 1);
                }
            }
            result += "\n";
            bw.write(answer + "" + result);
        }
        bw.flush();
        bw.close();
    }
}