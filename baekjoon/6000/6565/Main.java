// https://www.acmicpc.net/problem/6565
// Hard to Believe, but True!
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
            String temp = bf.readLine();
            if(temp.equals("0+0=0")){
                bw.write("True\n");
                break;
            }
            String[] sArray = temp.split("=");
            StringBuilder result = new StringBuilder(sArray[1]).reverse();
            sArray = sArray[0].split("\\+");
            StringBuilder str1 = new StringBuilder(sArray[0]).reverse();
            StringBuilder str2 = new StringBuilder(sArray[1]).reverse();
            int n1 = Integer.parseInt(str1.toString());
            int n2 = Integer.parseInt(str2.toString());
            int n3 = Integer.parseInt(result.toString());
            if(n1 + n2 == n3){
                bw.write("True\n");
            } else {
                bw.write("False\n");
            }
        }
        bw.flush();
        bw.close();
    }

}