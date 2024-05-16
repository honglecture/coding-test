// https://www.acmicpc.net/problem/24638
// Anno Domini 2022
import java.io.*;

public class Main {

    public static void main(String[] args) throws IOException {
        BufferedReader bf = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        String[] sArray1 = bf.readLine().split(" ");
        String[] sArray2 = bf.readLine().split(" ");
        String type1 = sArray1[0].equals("AD") ? "AD" : "BC";
        String type2 = sArray2[0].equals("AD") ? "AD" : "BC";
        int n1 = type1.equals("AD") ? Integer.parseInt(sArray1[1]) : Integer.parseInt(sArray1[0]);
        int n2 = type2.equals("AD") ? Integer.parseInt(sArray2[1]) : Integer.parseInt(sArray2[0]);
        int answer = 0;
        if(type1.equals("AD") && type2.equals("AD")){
            answer = Math.abs(n1 - n2);
        } else if(type1.equals("AD") && type2.equals("BC")){
            answer = Math.abs(n1 + n2 - 1);
        } else if(type1.equals("BC") && type2.equals("AD")){
            answer = Math.abs(n1 + n2 - 1);
        } else if(type1.equals("BC") && type2.equals("BC")){
            answer = Math.abs(n1 - n2);
        }
        System.out.println(answer);
        bw.flush();
        bw.close();
    }

    

}
