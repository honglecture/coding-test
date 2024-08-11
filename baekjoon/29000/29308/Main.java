// https://www.acmicpc.net/problem/29308
// Закат
import java.io.*;

public class Main {

    public static void main(String[] args) throws IOException {
        BufferedReader bf = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        int size = Integer.parseInt(bf.readLine());
        int maxNum = 0;
        String name = "";
        for (int i = 0; i < size; i++) {
            String[] sArray = bf.readLine().split(" ");
            int n = Integer.parseInt(sArray[0]);
            String s1 = sArray[1];
            String s2 = sArray[2];
            if(s2.equals("Russia")){
                if(maxNum < n){
                    name = s1;
                    maxNum = n;
                }
            }
        }
        System.out.println(name);
        bw.flush();
        bw.close();
    }

    

}
