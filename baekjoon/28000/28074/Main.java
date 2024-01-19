// https://www.acmicpc.net/problem/28074
// 모비스
import java.io.*;

public class Main {

    public static void main(String[] args) throws IOException {
        BufferedReader bf = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        String str = bf.readLine();
        String[] array = {"M", "O", "B", "I", "S"};
        boolean flag = true;
        for (int i = 0; i < array.length; i++) {
            if(!str.contains(array[i])){
                flag = false;
                break;
            }
        }
        if(flag){
            System.out.println("YES");
        } else {
            System.out.println("NO");
        }
        bw.flush();
        bw.close();
    }

  
}
