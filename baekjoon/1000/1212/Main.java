// https://www.acmicpc.net/problem/1212
// 8진수 2진수
import java.io.*;
public class Main {

    public static void main(String[] args) throws IOException {
        BufferedReader bf = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        String str = bf.readLine();
        StringBuilder answer = new StringBuilder("");
        String[] array = {"000","001","010","011","100","101","110","111"};
        for (int i = 0; i < str.length(); i++) {
            int n = Integer.parseInt(String.valueOf(str.charAt(i)));
            String temp = array[n];
            answer.append(temp);
        }
        if(str.equals("0")){
            System.out.println("0");
            return;
        }
        while(true){
            int n = Integer.parseInt(String.valueOf(answer.toString().charAt(0)));
            if(n == 0){
                answer.deleteCharAt(0);
            } else {
                break;
            }
        }
        bw.write(answer + "\n");
        bw.flush();
        bw.close();
    }

}
