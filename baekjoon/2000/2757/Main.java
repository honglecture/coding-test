// https://www.acmicpc.net/problem/2757
// 엑셀
import java.io.*;
public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader bf = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        while (true) {
            String str = bf.readLine();
            if(str.equals("R0C0")){
                break;
            }
            String[] sArray = str.split("C");
            int n1 = Integer.parseInt(sArray[0].substring(1));
            int n2 = Integer.parseInt(sArray[1]);
            String result = "";
            while (true) {
                int num1 = n2 % 26;
                int num2 = n2 / 26;
                if(num1 == 0){
                    break;
                }
                n2 = num2;
                result = "Z";
            }
        }
        bw.flush();
        bw.close();
    }
}