// https://www.acmicpc.net/problem/14489
// 욱제는 효도쟁이야!!
import java.io.*;
public class Main {

    public static void main(String[] args) throws IOException {
        BufferedReader bf = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        String[] sArray = bf.readLine().split(" ");
        int n1 = Integer.parseInt(sArray[0]);
        int n2 = Integer.parseInt(sArray[1]);
        int n3 = Integer.parseInt(bf.readLine()) * 2;
        int sum = n1 + n2;
        if(n3 <= sum){
            System.out.println(sum - n3);
        } else {
            System.out.println(sum);
        }
        bw.flush();
        bw.close();
    }
}