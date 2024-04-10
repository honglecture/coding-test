// https://www.acmicpc.net/problem/9698
// SAHUR & IMSA’
import java.io.*;
public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader bf = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        int size = Integer.parseInt(bf.readLine());
        for (int i = 0; i < size; i++) {
            String[] sArray = bf.readLine().split(" ");
            int n1 = Integer.parseInt(sArray[0]) * 60;
            int n2 = Integer.parseInt(sArray[1]);
            int sum = n1 + n2 - 45;
            if(sum < 0){
                sum += 1440;
            }
            int result1 = sum / 60;
            int result2 = sum % 60;
            bw.write("Case #"+(i + 1)+": "+result1+" " + result2 + "\n");
        }
        bw.flush();
        bw.close();
    }
}