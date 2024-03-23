// https://www.acmicpc.net/problem/15098
// No Duplicates
import java.io.*;
import java.util.HashSet;
import java.util.Set;

public class Main {

    public static void main(String[] args) throws IOException {
        BufferedReader bf = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        String[] sArray = bf.readLine().split(" ");
        boolean flag = true;
        Set<String> set = new HashSet<>();
        for (int i = 0; i < sArray.length; i++) {
            if(set.contains(sArray[i])){
                flag = false;
                break;
            }
            set.add(sArray[i]);
        }
        if(flag){
            System.out.println("yes");
        } else {
            System.out.println("no");
        }
        bw.flush();
        bw.close();
    }

    
}
