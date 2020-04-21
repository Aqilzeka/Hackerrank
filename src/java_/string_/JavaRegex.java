package java_.string_;

import java.util.Scanner;

public class JavaRegex {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        while (in.hasNext()){
            String IP = in.next();
            System.out.println(IP.matches(new MyRegex().pattern));
        }
    }
}

class MyRegex{
    String num = "([01]?\\d{1,2}|2[0-4]\\d|25[0-5])";
    String pattern =String.format("%s.%s.%s.%s",num,num,num,num);
}