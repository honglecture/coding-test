// https://www.acmicpc.net/problem/31090
// 2023은 무엇이 특별할까?
import java.io.*;

public class Main {

    public static void main(String[] args) throws IOException {
        BufferedReader bf = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        int size = Integer.parseInt(bf.readLine());
        for (int i = 0; i < size; i++) {
            String str = bf.readLine();
            int n1 = Integer.parseInt(str);
            int n2 = n1 + 1;
            int n3 = Integer.parseInt(str.charAt(str.length() - 2) + "" + str.charAt(str.length() - 1));
            if(n2 % n3 == 0){
                bw.write("Good\n");
            } else {
                bw.write("Bye\n");
            }
        }
        bw.flush();
        bw.close();
    }

    

}
