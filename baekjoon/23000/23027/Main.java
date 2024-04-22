// https://www.acmicpc.net/problem/23027
// 1번부터 문제의 상태가…?
import java.io.*;

public class Main {

    public static void main(String[] args) throws IOException {
        BufferedReader bf = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        String str = bf.readLine();
        StringBuilder sb = new StringBuilder();
        if(str.contains("A")){
             for (int i = 0; i < str.length(); i++) {
                String s = String.valueOf(str.charAt(i));
                if(s.equals("B")){
                    sb.append("A");
                } else if(s.equals("C")){
                    sb.append("A");
                } else if(s.equals("D")){
                    sb.append("A");
                } else if(s.equals("F")){
                    sb.append("A");
                } else {
                    sb.append(s);
                }
             }
        } else {
            if(str.contains("B")){
                for (int i = 0; i < str.length(); i++) {
                    String s = String.valueOf(str.charAt(i));
                    if(s.equals("C")){
                        sb.append("B");
                    } else if(s.equals("D")){
                        sb.append("B");
                    } else if(s.equals("F")){
                        sb.append("B");
                    } else {
                        sb.append(s);
                    }
                 }
            } else {
                if(str.contains("C")){
                    for (int i = 0; i < str.length(); i++) {
                        String s = String.valueOf(str.charAt(i));
                        if(s.equals("D")){
                            sb.append("C");
                        } else if(s.equals("F")){
                            sb.append("C");
                        } else {
                            sb.append(s);
                        }
                     }
                } else {
                    for (int i = 0; i < str.length(); i++) {
                        sb.append("A");
                     }
                }
            }
        }
        System.out.println(sb.toString());
        bw.flush();
        bw.close();
    }

}
