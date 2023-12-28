// https://www.acmicpc.net/problem/6778
// Which Alien? 
import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;

public class Main {

    public static void main(String[] args) throws IOException {
        BufferedReader bf = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        int n1 = Integer.parseInt(bf.readLine());
        int n2  = Integer.parseInt(bf.readLine());
        if(n1 >= 3  && n2 <= 4){
            System.out.println("TroyMartian");
        }
        if(n1 <= 6  && n2 >= 2){
            System.out.println("VladSaturnian");
        }
        if(n1 <= 2 && n2 <= 3){
            System.out.println("GraemeMercurian");
        }
        bw.flush();
        bw.close();
    }

    
}