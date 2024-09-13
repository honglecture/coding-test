// https://www.acmicpc.net/problem/4649
// Tanning Salon
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
        while (true) {
            String temp = bf.readLine();
            if(temp.equals("0")){
                break;
            }
            String[] sArray = temp.split(" ");
            int size = Integer.parseInt(sArray[0]);
            String str = sArray[1];
            Set<String> set = new HashSet<>();
            Set<String> removeSet = new HashSet<>();
            int answer = 0;
            for (int i = 0; i < str.length(); i++) {
                String s = String.valueOf(str.charAt(i));
                if(set.contains(s)){
                    set.remove(s);
                } else if(removeSet.contains(s)){
                    removeSet.remove(s);
                    answer++;
                } else {
                    if(set.size() == size){
                        removeSet.add(s);
                    } else {
                        set.add(s);
                    }
                }
            }
            if(answer == 0){
                bw.write("All customers tanned successfully.\n");
            } else {
                bw.write(answer + " customer(s) walked away.\n");
            }
        }
        bw.flush();
        bw.close();
    }
    
}