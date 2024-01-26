// https://www.acmicpc.net/problem/14624
// 전북대학교
import java.io.*;
public class Main {

    public static void main(String[] args) throws IOException {
        BufferedReader bf = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        int n = Integer.parseInt(bf.readLine());
        if(n % 2 == 0){
            System.out.println("I LOVE CBNU");
        } else {
            for (int i = 0; i < n; i++) {
                System.out.print("*");
            }
            System.out.println();
            for (int i = 0; i < n / 2 + 1; i++) {
                String result = "";
                if(i == 0){
                    for (int j = 0; j < n / 2 + i; j++) {
                        result += " ";
                    }
                    result += "*";
                } else {
                    for (int j = 0; j < n / 2 + i; j++) {
                        if(j == n / 2 - i){
                            result += "*";
                        } else {
                            result += " ";
                        }
                        
                    }
                    result += "*";
                }
                System.out.println(result);
            }
        }
        bw.flush();
        bw.close();
    }

    
}