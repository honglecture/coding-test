// https://www.acmicpc.net/problem/17288
// 3개만!
import java.io.*;

public class Main {

    public static void main(String[] args) throws IOException {
        BufferedReader bf = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        String str = bf.readLine();
        StringBuilder sb = new StringBuilder();
        int answer = 0;
        for (int i = 0; i < str.length(); i++) {
            String s = String.valueOf(str.charAt(i));
            if(i == 0){
                sb.append(s);
            } else {
                if(sb.length() == 0){
                    sb.append(s);
                } else {
                    int n1 = Integer.parseInt(String.valueOf(sb.charAt(sb.length() - 1)));
                    int n2 = Integer.parseInt(s);
                    if(n1 + 1 == n2){
                        sb.append(s);
                    } else {
                        if(sb.length() == 3){
                            answer++;
                            sb = new StringBuilder();
                            sb.append(s);
                        } else {
                            sb = new StringBuilder();
                            sb.append(s);
                        }
                    }
                }
            }
        }
        if(sb.length() == 3){
            answer++;
        }
        System.out.println(answer);
        bw.flush();
        bw.close();
    }

}
