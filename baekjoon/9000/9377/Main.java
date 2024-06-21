// https://www.acmicpc.net/problem/9377
// String LD
import java.io.*;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Map;
import java.util.Set;
public class Main {

    public static void main(String[] args) throws IOException {
        BufferedReader bf = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        while (true) {
            int size = Integer.parseInt(bf.readLine());
            if(size == 0){
                break;
            }
            StringBuilder[] array = new StringBuilder[size];
            int answer = 0;
            for (int i = 0; i < array.length; i++) {
                array[i] = new StringBuilder(bf.readLine());
            }
            while (true) {
                if(!getAnswer(array)){
                    break;
                }
                answer++;
                for (int i = 0; i < array.length; i++) {
                    array[i].deleteCharAt(0);
                }
            }
            answer -= 1;
            bw.write(answer +"\n");
        }
        bw.flush();
        bw.close();
    }

    private static boolean getAnswer(StringBuilder[] array){
        boolean flag = true;
        Set<String> set = new HashSet<>();
        for (int i = 0; i < array.length; i++) {
            if(set.contains(array[i].toString())){
                return false;
            }
            set.add(array[i].toString());
            if(array[i].length() == 0){
                return false;
            }
        }
        return flag;
    }
}