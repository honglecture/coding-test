// https://www.acmicpc.net/problem/29716
// 풀만한문제
import java.io.*;

public class Main {

    public static void main(String[] args) throws IOException {
        BufferedReader bf = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        String[] sArray = bf.readLine().split(" ");
        int key = Integer.parseInt(sArray[0]);
        int size = Integer.parseInt(sArray[1]);
        int answer = 0;
        for (int i = 0; i < size; i++) {
            int result = 0;
            String str = bf.readLine();
            for (int j = 0; j < str.length(); j++) {
                char c = str.charAt(j);
                int n = c;
                if(c == ' '){
                    result++;
                } else {
                    if(n >= 65 && n <= 90){
                        result += 4;
                    } else if(n >= 97 && n <= 122){
                        result += 2;
                    } else if(n >= 48 && n <= 57){
                        result += 2;
                    }
                }
            }
            if(result <= key){
                answer++;
            }

        }
        bw.write(answer + "\n");
        bw.flush();
        bw.close();
    }

    

}
