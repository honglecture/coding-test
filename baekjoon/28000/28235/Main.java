// https://www.acmicpc.net/problem/28235
// 코드마스터 2023
import java.io.*;

public class Main {

    public static void main(String[] args) throws IOException {
        BufferedReader bf = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        String str = bf.readLine();
        if(str.equals("SONGDO")){
            System.out.println("HIGHSCHOOL");
        } else if(str.equals("CODE")){
            System.out.println("MASTER");
        } else if(str.equals("2023")){
            System.out.println("0611");
        } else {
            System.out.println("CONTEST");
        }
        bw.flush();
        bw.close();
    }

  
}
