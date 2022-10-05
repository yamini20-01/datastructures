package general.basicprograms;

import com.sun.xml.internal.bind.v2.runtime.output.StAXExStreamWriterOutput;

import javax.xml.transform.stream.StreamSource;
import java.util.Scanner;

public class StringReverse1 {
    public static void main(String[] args) {
       String s="hello welcome jyothi java program    ";
       String s1 =s.trim();
    int count = 0;
        for(int i =0;i<s1.length();i++) {
            if (s1.charAt(i)==' ') {
                System.out.print(s.charAt(i));
                count++;
            }
        }
        System.out.print(count+1);
        }
    }




