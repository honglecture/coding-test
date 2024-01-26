// https://www.acmicpc.net/problem/20001
// 고무오리 디버깅
import java.io.*;

public class Main {

    public static void main(String[] args) throws IOException {
        BufferedReader bf = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        bf.readLine();
        int count = 0;
        while (true) {
            String str = bf.readLine();
            if(str.equals("고무오리 디버깅 끝")){
                break;
            }
            
            if(str.equals("문제")){
                count++;
            } else if(str.equals("고무오리")){
                if(count == 0){
                    count += 2;
                } else {
                    count--;
                }
            }
        }
        if(count == 0){
            System.out.println("고무오리야 사랑해");
        } else {
            System.out.println("힝구");
        }
        bw.flush();
        bw.close();
    }

}
