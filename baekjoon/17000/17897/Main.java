// https://www.acmicpc.net/problem/17897
// Pea Soup and Pancakes
import java.io.*;
import java.util.HashSet;
import java.util.Set;

public class Main {

    public static void main(String[] args) throws IOException {
        BufferedReader bf = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        int testCase = Integer.parseInt(bf.readLine());
        String answer = "";
        for (int i = 0; i < testCase; i++) {
            int size = Integer.parseInt(bf.readLine());
            Set<String> set = new HashSet<>();
            set.add("pea soup");
            set.add("pancakes");
            String name = bf.readLine();
            for (int j = 0; j < size; j++) {
                String str = bf.readLine();
                if(set.contains(str)){
                    set.remove(str);
                }
            }
            if(set.size() == 0){
                answer = name;
                break;
            }
        }
        if(answer.equals("")){
            answer = "Anywhere is fine I guess";
        }
        System.out.println(answer);
        bw.flush();
        bw.close();
    }

   
}