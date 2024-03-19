// https://www.acmicpc.net/problem/30642
// 아이그루스와 화장실
import java.io.*;

public class Main {

    public static void main(String[] args) throws IOException {
        BufferedReader bf = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        int size = Integer.parseInt(bf.readLine());
        String name = bf.readLine();
        int f = Integer.parseInt(bf.readLine());
        int answer = 0;
        if(name.equals("annyong")){
            if(f % 2 != 0){
                answer = f;
            } else {
                if(f + 1 > size){
                    answer = f - 1;
                } else {
                    answer = f + 1;
                }
            }
        } else {
            if(f % 2 == 0){
                answer = f;
            } else {
                if(f + 1 > size){
                    answer = f - 1;
                } else {
                    answer = f + 1;
                }
            }
        }
        System.out.println(answer);
        bw.flush();
        bw.close();
    }

    

}
