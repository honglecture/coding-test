// https://www.acmicpc.net/problem/30700
// KOREA 문자열 만들기
import java.io.*;

public class Main {

    public static void main(String[] args) throws IOException {
        BufferedReader bf = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        String str = bf.readLine();
        int answer = 0;
        int index = 0;
        String[] array = {"K", "O", "R", "E", "A"};
        for (int i = 0; i < str.length(); i++) {
            String s = String.valueOf(str.charAt(i));
            if(array[index].equals(s)){
                answer++;
                index++;
                if(index == 5){
                    index = 0;
                }
            }
        }
        System.out.println(answer);
        bw.flush();
        bw.close();
    }

    

}
