// https://www.acmicpc.net/problem/26041
// 비슷한 전화번호 표시
import java.io.*;

public class Main {

    public static void main(String[] args) throws IOException {
        BufferedReader bf = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        String[] array = bf.readLine().split(" ");
        String key = bf.readLine();
        int answer = 0;
        for (int i = 0; i < array.length; i++) {
            String str = array[i];
            if(str.length() <= key.length()){
                continue;
            }
            boolean flag = true;
            int size = key.length();
            for (int j = 0; j < size; j++) {
                if(str.charAt(j) != key.charAt(j)){
                    flag = false;
                    break;
                }
            }
            if(flag){
                answer++;
            }
        }
        System.out.println(answer);
        bw.flush();
        bw.close();
    }

}
