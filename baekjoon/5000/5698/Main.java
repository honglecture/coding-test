// https://www.acmicpc.net/problem/5698
// Tautogram
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
            String str = bf.readLine();
            if(str.equals("*")){
                break;
            }
            String[] array = str.split(" ");
            boolean flag = true;
            for (int i = 1; i < array.length; i++) {
                String s1 = String.valueOf(array[i].charAt(0)).toUpperCase();
                String s2 = String.valueOf(array[i - 1].charAt(0)).toUpperCase();
                if(!s1.equals(s2)){
                    flag = false;
                    break;
                }
            }
            if(flag){
                bw.write("Y\n");
            } else {
                bw.write("N\n");
            }
        }
        bw.flush();
        bw.close();
    }
    
}