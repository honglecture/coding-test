// https://www.acmicpc.net/problem/26714
// Liczenie punktów
import java.io.*;

public class Main {

    public static void main(String[] args) throws IOException {
        BufferedReader bf = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        int size = Integer.parseInt(bf.readLine()) / 10;
        int answer = 0;
        String str = bf.readLine();
        for (int i = 0; i < str.length(); i += size) {
            boolean flag = true;
            for (int j = i; j < i + size; j++) {
                if(!String.valueOf(str.charAt(j)).equals("T")){
                    flag = false;
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
