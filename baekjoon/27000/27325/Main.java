// https://www.acmicpc.net/problem/27325
// 3 つの箱 (Three Boxes)
import java.io.*;

public class Main {

    public static void main(String[] args) throws IOException {
        BufferedReader bf = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        int size = Integer.parseInt(bf.readLine());
        String str = bf.readLine();
        int current = 1;
        int answer = 0;
        for (int i = 0; i < str.length(); i++) {
            char c = str.charAt(i);
            if(c == 'L'){
                if(current != 1){
                    current--;
                }
            } else {
                if(current != 3){
                    current++;
                    if(current == 3){
                        answer++;
                    }
                } else {
                    answer++;
                }
            }
        }
        System.out.println(answer);
        bw.flush();
        bw.close();
    }

    

}
