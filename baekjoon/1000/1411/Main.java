// https://www.acmicpc.net/problem/1411
// 비슷한 단어
import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.util.HashSet;
import java.util.Set;

public class Main {

    public static void main(String[] args) throws IOException {
        BufferedReader bf = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        int size = Integer.parseInt(bf.readLine());
        String[] array = new String[size];
        int answer = 0;
        Set<String> set = new HashSet<>();
        for (int i = 0; i < array.length; i++) {
            array[i] = bf.readLine();
        }
        for (int i = 0; i < array.length - 1; i++) {
            for (int j = i + 1; j < array.length; j++) {
                String s1 = array[i];
                String s2 = array[j];
                boolean flag = true;
                for (int k = 0; k < s1.length(); k++) {
                    String c1 = String.valueOf(s1.charAt(k));
                    String c2 = String.valueOf(s2.charAt(k));
                    if(!c1.equals(c2)){
                        if(set.contains(c1)){
                            flag = false;
                            break;
                        }
                        s1 = s1.replaceAll(c1, c2);
                        set.add(c1);
                    }
                }
                if(flag){
                    answer++;
                    if(s1.equals(s2)){
                        
                    }
                }
                set.clear();
                
            }
        }
        bw.write(answer + "\n");
        bw.flush();
        bw.close();
    }
    
}