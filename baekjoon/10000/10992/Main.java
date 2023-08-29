// https://www.acmicpc.net/problem/10992
// 별 찍기 - 17
import java.io.*;
public class Main {
    
    public static void main(String[] args) throws IOException {
        BufferedReader bf = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        int size = Integer.parseInt(bf.readLine());
        for (int i = 0; i < size; i++) {
            String result = "";
            if(i != size - 1){
                for (int j = 0; j < size + i; j++) {
                    if(j == size + i - 1){
                        result += "*";
                    } else if(j == size - i - 1){
                        result += "*";
                    } else {
                        result += " ";
                    }

                }
            } else {
                for (int j = 0; j < size + i; j++) {
                    result += "*";
                }
            }
            bw.write(result + "\n");
        }
        bw.flush();
        bw.close();
    }

}