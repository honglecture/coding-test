// https://www.acmicpc.net/problem/17350
// 2루수 이름이 뭐야
import java.io.*;


public class Main {

    public static void main(String[] args) throws IOException {
        BufferedReader bf = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        int size = Integer.parseInt(bf.readLine());
        boolean flag = false;
        for (int i = 0; i < size; i++) {
            String str = bf.readLine();
            if(str.equals("anj")){
                flag = true;
                break;
            }
        }
        if(flag){
            System.out.println("뭐야;");
        } else {
            System.out.println("뭐야?");
        }
        bw.flush();
        bw.close();
    }

}
