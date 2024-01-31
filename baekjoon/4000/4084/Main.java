// https://www.acmicpc.net/problem/4084
// Viva la Diferencia
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
            int n1 = Integer.parseInt(sArray[0]);
            int n2 = Integer.parseInt(sArray[1]);
            int n3 = Integer.parseInt(sArray[2]);
            int n4 = Integer.parseInt(sArray[3]);
            int count = 0;
            if(n1 == 0 && n2 == 0 && n2 == 0 && n2 == 0){
                break;
            }
            while (true) {
                if(n1 == n2 && n2 == n3 && n3 == n4 && n4 == n1){
                    break;
                }
                int nextN1 = Math.abs(n1 - n2);
                int nextN2 = Math.abs(n2 - n3);
                int nextN3 = Math.abs(n3 - n4);
                int nextN4 = Math.abs(n4 - n1);
                n1 = nextN1;
                n2 = nextN2;
                n3 = nextN3;
                n4 = nextN4;
                count++;
            }
            bw.write(count + "\n");
        }
        bw.flush();
        bw.close();
    }
}