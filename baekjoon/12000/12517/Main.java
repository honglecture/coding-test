// https://www.acmicpc.net/problem/12517
// Centauri Prime (Small1)
import java.io.*;
public class Main {
    
    public static void main(String[] args) throws IOException {
        BufferedReader bf = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        int size = Integer.parseInt(bf.readLine());
        for (int i = 0; i < size; i++) {
            String str = bf.readLine();
            char c = str.charAt(str.length() - 1);
            if(c == 'y'){
                bw.write("Case #"+(i + 1)+": "+str+" is ruled by nobody.\n");
            } else {
                if(c == 'a' || c == 'e' || c == 'i' || c == 'o' || c == 'u'){
                    bw.write("Case #"+(i + 1)+": "+str+" is ruled by a queen.\n");
                } else {
                    bw.write("Case #"+(i + 1)+": "+str+" is ruled by a king.\n");
                }
            }
        }
        bw.flush();
        bw.close();
    }
   
}


