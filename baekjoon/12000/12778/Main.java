// https://www.acmicpc.net/problem/12778
// CTP공국으로 이민 가자
import java.io.*;
public class Main {
    
    public static void main(String[] args) throws IOException {
        BufferedReader bf = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        int size = Integer.parseInt(bf.readLine());
        for (int i = 0; i < size; i++) {
            String[] sArray = bf.readLine().split(" ");
            int n = Integer.parseInt(sArray[0]);
            String type = sArray[1];
            StringBuilder sb = new StringBuilder();
            if(type.equals("C")){
                sArray = bf.readLine().split(" ");
                for (int j = 0; j < sArray.length; j++) {
                    int c = (char) sArray[j].charAt(0) - 64;
                    sb.append(c + " ");
                }
            } else {
                sArray = bf.readLine().split(" ");
                for (int j = 0; j < sArray.length; j++) {
                    char c = (char) (Integer.parseInt(sArray[j]) + 64);
                    sb.append(c + " ");
                }
            }
            bw.write(sb.toString() + "\n");
        }
        bw.flush();
        bw.close();
    }

}
