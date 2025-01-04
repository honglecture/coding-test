// https://www.acmicpc.net/problem/21573
// 컨디셔너
import java.io.*;

public class Main {

    public static void main(String[] args) throws IOException {
        BufferedReader bf = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        String[] sArray = bf.readLine().split(" ");
        String type = bf.readLine();
        int n1 = Integer.parseInt(sArray[0]);
        int n2 = Integer.parseInt(sArray[1]);
        if(type.equals("freeze")){
            if(n1 <= n2){
                System.out.println(n1);
            } else {
                System.out.println(n2);
            }
        } else if(type.equals("heat")){
            if(n1 <= n2){
                System.out.println(n2);
            } else {
                System.out.println(n1);
            }
        } else if(type.equals("auto")){
            System.out.println(n2);
        } else {
            System.out.println(n1);
        }
        bw.flush();
        bw.close();
    }

}
