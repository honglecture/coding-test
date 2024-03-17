// https://www.acmicpc.net/problem/15340
// Sim Card
import java.io.*;

public class Main {

    public static void main(String[] args) throws IOException {
        BufferedReader bf = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        while (true) {
            String[] sArray = bf.readLine().split(" ");
            int n1 = Integer.parseInt(sArray[0]);
            int n2 = Integer.parseInt(sArray[1]);
            if(n1 == 0 && n2 == 0){
                break;
            }
            int answer1 = (n1 * 30) + (n2 * 40);
            int answer2 = (n1 * 35) + (n2 * 30);
            int answer3 = (n1 * 40) + (n2 * 20);
            bw.write(Integer.min(Integer.min(answer1, answer2), answer3) + "\n");
        }
        bw.flush();
        bw.close();
    }

    
}
