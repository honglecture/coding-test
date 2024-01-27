// https://www.acmicpc.net/problem/29731
// 2033년 밈 투표
import java.io.*;
import java.util.HashSet;
import java.util.Set;

public class Main {

    public static void main(String[] args) throws IOException {
        BufferedReader bf = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        int size = Integer.parseInt(bf.readLine());
        Set<String> set = new HashSet<>();
        boolean flag = true;
        set.add("Never gonna give you up");
        set.add("Never gonna let you down");
        set.add("Never gonna run around and desert you");
        set.add("Never gonna make you cry");
        set.add("Never gonna say goodbye");
        set.add("Never gonna tell a lie and hurt you");
        set.add("Never gonna stop");
        for (int i = 0; i < size; i++) {
            String str = bf.readLine();
            if(!set.contains(str)){
                flag = false;
                break;
            }
        }
        if(flag){
            System.out.println("No");
        } else {
            System.out.println("Yes");
        }
        bw.flush();
        bw.close();
    }

    

}
