// https://www.acmicpc.net/problem/9398
// A Password Policy Requirement
import java.io.*;
public class Main {

    public static void main(String[] args) throws IOException {
        BufferedReader bf = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        int size = Integer.parseInt(bf.readLine());
        for (int i = 0; i < size; i++) {
            String str = bf.readLine();
            int answer = Integer.MAX_VALUE;
            for (int j = 0; j < str.length(); j++) {
                boolean flag1 = false;
                boolean flag2 = false;
                boolean flag3 = false;
                int count = 0;
                for (int k = j; k < str.length(); k++) {
                    char c = str.charAt(k);
                    if(c >= 65 && c <= 90){
                        flag1 = true;
                    } else if(c >= 97 && c <= 122){
                        flag2 = true;
                    } else {
                        flag3 = true;
                    }
                    count++;
                    if(flag1 && flag2 && flag3){
                        if(k < str.length() - 1){
                            char c2 = str.charAt(k + 1);
                            if(c <= 59 && c2 <= 59){
                                continue;
                            } else if(c <= 90 && c2 <= 90){
                                continue;
                            } else if(c <= 122 && c2 <= 122){
                                continue;
                            }
                        }
                        answer = Integer.min(count, answer);
                        break;
                    }
                }
            }
            if(answer == Integer.MAX_VALUE){
                answer = 0;
            }
            bw.write(answer + "\n");
        }
        bw.flush();
        bw.close();
    }
}