// https://www.acmicpc.net/problem/4758
// Filling Out the Team
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
            StringBuilder answer = new StringBuilder();
            String[] sArray = bf.readLine().split(" ");
            double n1 = Double.parseDouble(sArray[0]);
            int n2 = Integer.parseInt(sArray[1]);
            int n3 = Integer.parseInt(sArray[2]);
            if(n1 == 0 && n2 == 0 && n3 == 0){
                break;
            }
            if(n1 <= 4.5 && n2 >= 150 && n3 >= 200){
                answer.append("Wide Receiver ");
            }
            if(n1 <= 6.0 && n2 >= 300 && n3 >= 500){
                answer.append("Lineman ");
            }
            if(n1 <= 5.0 && n2 >= 200 && n3 >= 300){
                answer.append("Quarterback ");
            }
            if(answer.length() == 0){
                bw.write("No positions\n");
            } else {
                answer.deleteCharAt(answer.length() - 1);
                bw.write(answer.toString() + "\n");
            }
        }
        bw.flush();
        bw.close();
    }
    
}