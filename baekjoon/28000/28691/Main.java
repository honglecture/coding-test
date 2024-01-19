// https://www.acmicpc.net/problem/28691
// 정보보호학부 동아리 소개
import java.io.*;

public class Main {

    public static void main(String[] args) throws IOException {
        BufferedReader bf = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        String str = bf.readLine();
        if(str.equals("M")){
            System.out.println("MatKor");
        } else if(str.equals("W")){
            System.out.println("WiCys");
        } else if(str.equals("C")){
            System.out.println("CyKor");
        } else if(str.equals("A")){
            System.out.println("AlKor");
        } else if(str.equals("$")){
            System.out.println("$clear");
        }
        bw.flush();
        bw.close();
    }

  
}
