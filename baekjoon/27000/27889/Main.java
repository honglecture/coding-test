// https://www.acmicpc.net/problem/27889
// 특별한 학교 이름
import java.io.*;

public class Main {

    public static void main(String[] args) throws IOException {
        BufferedReader bf = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        String str = bf.readLine();
        if(str.equals("NLCS")){
            System.out.println("North London Collegiate School");
        } else if(str.equals("BHA")){
            System.out.println("Branksome Hall Asia");
        } else if(str.equals("KIS")){
            System.out.println("Korea International School");
        } else if(str.equals("SJA")){
            System.out.println("St. Johnsbury Academy");
        }
        bw.flush();
        bw.close();
    }

    

}
