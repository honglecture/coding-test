// https://www.acmicpc.net/problem/24923
// Canadians, eh?
import java.io.*;

public class Main {

    public static void main(String[] args) throws IOException {
        BufferedReader bf = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        String str = bf.readLine();
        String subStr = str.substring(str.length() - 3, str.length());
        if(subStr.equals("eh?")){
            System.out.println("Canadian!");
        } else {
            System.out.println("Imposter!");
        }
        bw.flush();
        bw.close();
    }

    

}
