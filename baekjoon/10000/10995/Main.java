// https://www.acmicpc.net/problem/10995
// 별 찍기 - 20
import java.io.*;
public class Main {
    
    public static void main(String[] args) throws IOException {
        BufferedReader bf = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        int size = Integer.parseInt(bf.readLine());
        for (int i = 0; i < size; i++) {
            if(i % 2 == 0){
                String result = "";
                for (int j = 0; j < size; j++) {
                    if(j == size - 1){
                        result += "*";
                    } else {
                        result += "* ";
                    }
                }
                bw.write(result + "\n");
            } else {
                String result = " ";
                for (int j = 0; j < size; j++) {
                    if(j == size - 1){
                        result += "*";
                    } else {
                        result += "* ";
                    }
                }
                bw.write(result + "\n");
            }
        }
        bw.flush();
        bw.close();
    }

}