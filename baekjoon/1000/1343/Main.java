// https://www.acmicpc.net/problem/1343
// 폴리오미노
import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;

public class Main {

    public static void main(String[] args) throws IOException {
        BufferedReader bf = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        String str = bf.readLine();
        String result = "";
        String answer = "";
        boolean flag = true;
        for (int i = 0; i < str.length(); i++) {
            if(str.charAt(i) == '.'){
                if(!result.equals("")){
                    if(result.length() % 2 != 0){
                        flag = false;
                        break;
                    } else {
                        int n = result.length() % 4;
                        if(n == 0){
                            for (int j = 0; j < result.length() / 4; j++) {
                                answer += "AAAA";
                            }
                        } else {
                            for (int j = 0; j < result.length() / 4; j++) {
                                answer += "AAAA";
                            }
                            for (int j = 0; j < (result.length() - ((result.length() / 4) * 4)) / 2; j++) {
                                answer += "BB";
                            }
                        }
                    }
                }
                answer += ".";
                result = "";
            } else {
                result += "X";
            }
        }
        if(flag){
            if(result.equals("")){
                bw.write(answer + "\n");
            } else {
                if(result.length() % 2 != 0){
                    bw.write("-1\n");
                } else {
                    int n = result.length() % 4;
                    if(n == 0){
                        for (int j = 0; j < result.length() / 4; j++) {
                            answer += "AAAA";
                        }
                    } else {
                        for (int j = 0; j < result.length() / 4; j++) {
                            answer += "AAAA";
                        }
                        for (int j = 0; j < (result.length() - ((result.length() / 4) * 4)) / 2; j++) {
                            answer += "BB";
                        }
                    }
                    bw.write(answer + "\n");
                }
            }
        } else {
            bw.write("-1\n");
        }
        
        bw.flush();
        bw.close();
    }

}