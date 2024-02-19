// https://www.acmicpc.net/problem/28295
// 안밖? 밖안? 계단? 역계단?
import java.io.*;

public class Main {

    public static void main(String[] args) throws IOException {
        BufferedReader bf = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        String[] array = {"N", "E", "S", "W"};
        int index = 0;
        for (int i = 0; i < 10; i++) {
            int n = Integer.parseInt(bf.readLine());
            if(n == 1){
                // 우
                index++;
            } else if(n == 2){
                // 뒤
                index += 2;
            } else {
                // 좌
                index -= 1;
            }
            if(index > 3){
                index -= 4;
            } else if(index < 0){
                index += 4;
            }
        }
        System.out.println(array[index]);
        bw.flush();
        bw.close();
    }

  
}
