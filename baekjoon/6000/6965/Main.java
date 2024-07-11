// https://www.acmicpc.net/problem/6965
// Censor
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
            StringBuilder sb = new StringBuilder();
            for (int j = 0; j < sArray.length; j++) {
                if(sArray[j].length() == 4){
                    sb.append("****");
                } else {
                    sb.append(sArray[j]);
                }
                sb.append(" ");
            }
            sb.deleteCharAt(sb.length() - 1);
            bw.write(sb.toString() + "\n");
            if(i != size - 1){
                bw.write("\n");
            }
        }
        bw.flush();
        bw.close();
    }

    
}