// https://www.acmicpc.net/problem/9342
// 염색체
import java.io.*;
import java.security.DrbgParameters.Reseed;
public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader bf = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        int size = Integer.parseInt(bf.readLine());
        for (int i = 0; i < size; i++) {
            String str = bf.readLine();
            String result = "";
            String beforeString = String.valueOf(str.charAt(0));
            for (int j = 1; j < str.length(); j++) {
                String s = String.valueOf(str.charAt(j));
                if(!beforeString.equals(s)){
                    result += beforeString;
                    beforeString = s;
                }
            }
            result += beforeString;
            if(result.length() >= 3 && result.length() <= 5){
                if(result.length() == 3){
                    if(result.equals("AFC")){
                        bw.write("Infected!\n");
                    } else {
                        bw.write("Good\n");
                    }
                } else if(result.length() == 4){
                    
                } else {
                    if(result.equals("AFC")){
                        bw.write("Infected!\n");
                    } else {
                        bw.write("Good\n");
                    }
                }
            } else {
                bw.write("Good\n");
            }
        }
        bw.flush();
        bw.close();
    }
    private static boolean checkStr(String s){
        boolean flag = true;
        // A, B, C, D, E, F
        if(s.equals("A") || s.equals("B") || s.equals("C") || s.equals("D") || s.equals("E") || s.equals("F")){
            flag = true;
        } else {
            flag = false;
        }
        return flag;
    }
}