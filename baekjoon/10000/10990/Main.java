// https://www.acmicpc.net/problem/10990
// 별 찍기 - 15
import java.io.*;
public class Main {

    public static void main(String[] args) throws IOException {
        BufferedReader bf = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        int size = Integer.parseInt(bf.readLine());
        for (int i = 0; i < size; i++) {
            String result = "";
            for (int j = 0; j < size + i; j++) {
                if(i == 0){
                    if(j == size - 1){
                        result += "*";
                    } else {
                        result += " ";
                    }
                } else {
                    if(j == size - 1 - i || j == size + i - 1){
                        result += "*";
                    } else {
                        result += " ";
                    }
                }
            }
            bw.write(result + "\n");
        }
        bw.flush();
        bw.close();
    }
}