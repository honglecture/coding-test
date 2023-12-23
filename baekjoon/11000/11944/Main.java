// https://www.acmicpc.net/problem/11944
// NN
import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;

public class Main {

    public static void main(String[] args) throws IOException {
        BufferedReader bf = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        String[] sArray = bf.readLine().split(" ");
        StringBuilder sb = new StringBuilder();
        int n1 = Integer.parseInt(sArray[0]);
        int n2 = Integer.parseInt(sArray[1]);
        String answer = "";
        for (int i = 0; i < n1; i++) {
            sb.append(n1+"");
        }
        if(sb.toString().length() > n2){
            answer = sb.substring(0, n2);
        } else {
            answer = sb.toString();
        }
        System.out.println(answer);
        bw.flush();
        bw.close(); 
    }

}