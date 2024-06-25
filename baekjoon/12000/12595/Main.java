// https://www.acmicpc.net/problem/12595
// Odd Man Out (Small)
import java.io.*;
import java.util.HashSet;
import java.util.Set;
public class Main {
    
    public static void main(String[] args) throws IOException {
        BufferedReader bf = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        int size = Integer.parseInt(bf.readLine());
        for (int i = 0; i < size; i++) {
            bf.readLine();
            Set<String> set = new HashSet<>();
            String[] array = bf.readLine().split(" ");
            for (int j = 0; j < array.length; j++) {
                String s = array[j];
                if(set.contains(s)){
                    set.remove(s);
                } else {
                    set.add(s);
                }
            }
            bw.write("Case #"+(i + 1)+": " + set.iterator().next() + "\n");
        }
        bw.flush();
        bw.close();
    }
   
}


