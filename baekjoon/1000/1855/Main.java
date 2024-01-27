// https://www.acmicpc.net/problem/1855
// 암호
import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;

public class Main {
    
    public static void main(String[] args) throws IOException {
        BufferedReader bf = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        int size = Integer.parseInt(bf.readLine());
        String str = bf.readLine();
        String[][] array = new String[str.length() / size][size];
        int y = 0;
        int x = 0;
        boolean flag = true;
        String answer = "";
        for (int i = 0; i < str.length(); i++) {
            String s = String.valueOf(str.charAt(i));
            if(flag){
                array[y][x] = s;
                if(x + 1 == size){
                    y++;
                    flag = false;
                } else {
                    x++;
                }
            } else {
                array[y][x] = s;
                if(x - 1 == -1){
                    y++;
                    flag = true;
                } else {
                    x--;
                }
            }
        }
        for (int i = 0; i < array[0].length; i++) {
            for (int j = 0; j < array.length; j++) {
                answer += array[j][i];
            }
        }
        System.out.println(answer);
        bw.flush();
        bw.close();
    }


    
}
