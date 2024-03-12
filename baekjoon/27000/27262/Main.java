// https://www.acmicpc.net/problem/27262
// Лифт
import java.io.*;

public class Main {

    public static void main(String[] args) throws IOException {
        BufferedReader bf = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        String[] sArray = bf.readLine().split(" ");
        int n1 = Integer.parseInt(sArray[0]);
        int n2 = Integer.parseInt(sArray[1]);
        int n3 = Integer.parseInt(sArray[2]);
        int n4 = Integer.parseInt(sArray[3]);
        int answer1 = 0;
        int answer2 = 0;
        answer2 = (n1 - 1) * n3;
        if(n2 == 1){
            answer1 = (n1 - 1) * n4;
        } else {
            answer1 = ((n1 - 1) + (n2 - 1)) * n4;
        }
        System.out.println(answer1 + " " + answer2);
        bw.flush();
        bw.close();
    }

    

}
