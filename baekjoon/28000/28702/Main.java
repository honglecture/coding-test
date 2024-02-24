// https://www.acmicpc.net/problem/28702
// FizzBuzz
import java.io.*;

public class Main {

    public static void main(String[] args) throws IOException {
        BufferedReader bf = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        String str1 = bf.readLine();
        String str2 = bf.readLine();
        String str3 = bf.readLine();
        // FizzBuzz
        // Fizz
        // Buzz
        int n = 0;
        if(!str1.equals("FizzBuzz") && !str1.equals("Fizz") && !str1.equals("Buzz")){
            n = Integer.parseInt(str1) + 3;
        } else if(!str2.equals("FizzBuzz") && !str2.equals("Fizz") && !str2.equals("Buzz")){
            n = Integer.parseInt(str2) + 2;
        } else if(!str3.equals("FizzBuzz") && !str3.equals("Fizz") && !str3.equals("Buzz")){
            n = Integer.parseInt(str3) + 1;
        }
        if(n % 3 == 0 && n % 5 == 0){
            System.out.println("FizzBuzz");
        } else if(n % 3 == 0 && n % 5 != 0){
            System.out.println("Fizz");
        } else if(n % 3 != 0 && n % 5 == 0){
            System.out.println("Buzz");
        } else {
            System.out.println(n);
        }
        bw.flush();
        bw.close();
    }

  
}
