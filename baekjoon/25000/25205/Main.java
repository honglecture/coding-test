// https://www.acmicpc.net/problem/25205
// 경로당펑크 2077
import java.io.*;

public class Main {

    public static void main(String[] args) throws IOException {
        BufferedReader bf = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        int size = Integer.parseInt(bf.readLine());
        String str = bf.readLine();
        String[] array = {"r", "R", "s", "e", "E", "f", "a", "q", "Q", "t", "T", "d", "w", "W", "c", "z", "x", "v", "g"};
        String last = String.valueOf(str.charAt(str.length() - 1));
        boolean flag = false;
        for (int i = 0; i < array.length; i++) {
            if(array[i].equals(last)){
                flag = true;
                break;
            }
        }
        if(flag){
            System.out.println("1");
        } else {
            System.out.println("0");
        }
        bw.flush();
        bw.close();
    }

}
