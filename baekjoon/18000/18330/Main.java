// https://www.acmicpc.net/problem/18330
// Petrol
import java.io.*;

public class Main {

    public static void main(String[] args) throws IOException {
        BufferedReader bf = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        int n1 = Integer.parseInt(bf.readLine());
        int n2 = Integer.parseInt(bf.readLine()) + 60;
        if(n1 > n2){
            int sum = n2 * 1500;
            sum += (n1 - n2) * 3000;
            System.out.println(sum);
        } else {
            System.out.println(1500 * n1);
        }
        
        bw.flush();
        bw.close();
    }

}
