// https://www.acmicpc.net/problem/31607
// 和の判定 (Sum Checker)
import java.io.*;

public class Main {

    public static void main(String[] args) throws IOException {
        BufferedReader bf = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        int n1 = Integer.parseInt(bf.readLine());
        int n2 = Integer.parseInt(bf.readLine());
        int n3 = Integer.parseInt(bf.readLine());
        boolean flag = false;
        if(n1 + n2 == n3){
            flag = true;
        }
        if(n2 + n3 == n1){
            flag = true;
        }
        if(n1 + n3 == n2){
            flag = true;
        }
        if(flag){
            System.out.println("1");
        } else {
            System.out.println("0");
        }
        bw.flush();
        bw.close();
    }

    

}
