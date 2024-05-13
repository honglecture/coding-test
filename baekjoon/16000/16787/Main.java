// https://www.acmicpc.net/problem/16787
// マルバツスタンプ (Circle Cross Stamps) 
import java.io.*;

public class Main {

    public static void main(String[] args) throws IOException {
        BufferedReader bf = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        int size = Integer.parseInt(bf.readLine());
        String str = bf.readLine();
        int answer = 0;
        String before = "";
        for (int i = 0; i < str.length(); i++) {
            String s = String.valueOf(str.charAt(i));
            if(before.equals("")){
                before = s;
            } else {
                if(before.equals("O")){
                    if(s.equals("O")){
                        continue;
                    } else {
                        answer++;
                        before = "";
                    }
                } else {
                    if(s.equals("O")){
                        answer++;
                        before = "";
                    } else {
                        continue;
                    }
                }
            }
        }
        System.out.println(answer);
        bw.flush();
        bw.close();
    }


}
