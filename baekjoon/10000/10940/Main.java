// https://www.acmicpc.net/problem/10940
// BASE64 디코딩
import java.io.*;
public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader bf = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        String str = bf.readLine();
		byte defaultBytes[] = str.getBytes();
        System.out.println(byteArrayToHexString(defaultBytes));
        bw.flush();
        bw.close();
    }
    public static String byteArrayToHexString(byte[] bytes){ 
		StringBuilder sb = new StringBuilder(); 
		for(byte b : bytes){ 
			sb.append(String.format("%02X", b&0xff)); 
		} 
		return sb.toString(); 
	} 


}