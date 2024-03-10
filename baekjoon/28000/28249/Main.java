// https://www.acmicpc.net/problem/28249
// Chili Peppers
import java.io.*;

public class Main {

    public static void main(String[] args) throws IOException {
        BufferedReader bf = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        int size = Integer.parseInt(bf.readLine());
        int answer = 0;
        for (int i = 0; i < size; i++) {
            String str = bf.readLine();
            if(str.equals("Poblano")){
                answer += 1500;
            } else if(str.equals("Mirasol")){
                answer += 6000;
            } else if(str.equals("Serrano")){
                answer += 15500;
            } else if(str.equals("Cayenne")){
                answer += 40000;
            } else if(str.equals("Thai")){
                answer += 75000;
            } else if(str.equals("Habanero")){
                answer += 125000;
            }
        }
        System.out.println(answer);
        bw.flush();
        bw.close();
    }

  
}
