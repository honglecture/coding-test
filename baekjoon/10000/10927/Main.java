// https://www.acmicpc.net/problem/10927
// MD5
import java.io.*;
import java.security.MessageDigest;
import java.security.NoSuchAlgorithmException;
public class Main {
    public static void main(String[] args) throws IOException, NoSuchAlgorithmException {
        BufferedReader bf = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        String str = bf.readLine();
        String result = enc(str);
        System.out.println(result);
        bw.flush();
        bw.close();
    }
    public static String enc(String input) throws NoSuchAlgorithmException {
        MessageDigest mDigest = MessageDigest.getInstance("MD5");
        byte[] result = mDigest.digest(input.getBytes());
        StringBuffer stringBuffer = new StringBuffer();
        for (int i = 0; i < result.length; i++) {
            stringBuffer.append(Integer.toString((result[i] & 0xff) + 0x100, 16).substring(1));
        }
        return stringBuffer.toString();
    }
}