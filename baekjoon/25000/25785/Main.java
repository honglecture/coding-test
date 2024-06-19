// https://www.acmicpc.net/problem/25785
// Easy-to-Pronounce Words
import java.io.*;
import java.util.HashSet;
import java.util.Set;

public class Main {

    public static void main(String[] args) throws IOException {
        BufferedReader bf = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        String str = bf.readLine();
        Set<Character> set = new HashSet<>();
        set.add('a');
        set.add('e');
        set.add('i');
        set.add('o');
        set.add('u');
        boolean flag = false;
        int answer = 1;
        if(set.contains(str.charAt(0))){
            flag = true;
        }
        for (int i = 1; i < str.length(); i++) {
            char c = str.charAt(i);
            if(flag){
                if(set.contains(c)){
                    answer = 0;
                    break;
                }
                flag = false;
            } else {
                if(!set.contains(c)){
                    answer = 0;
                    break;
                }
                flag = true;
            }
        }
        System.out.println(answer);
        bw.flush();
        bw.close();
    }

}
