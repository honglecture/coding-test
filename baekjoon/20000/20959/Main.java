// https://www.acmicpc.net/problem/20959
// Šifra
import java.io.*;
import java.util.HashSet;
import java.util.Set;

public class Main {

    public static void main(String[] args) throws IOException {
        BufferedReader bf = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        String str = bf.readLine();
        Set<Integer> set = new HashSet<>();
        String temp = "";
        for (int i = 0; i < str.length(); i++) {
            int n = str.charAt(i);
            if(n >= 48 && n <= 57){
                temp += String.valueOf(str.charAt(i));
            } else {
                if(!temp.equals("")){
                    set.add(Integer.parseInt(temp));
                    temp = "";
                }
            }
        }
        if(!temp.equals("")){
            set.add(Integer.parseInt(temp));
            temp = "";
        }
        System.out.println(set.size());
        bw.flush();
        bw.close();
    }

}
