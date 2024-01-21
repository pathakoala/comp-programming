import java.io.*;
import java.util.*;

public class test {
    public static void main(String[] args) {
        boolean[] test = new boolean[3];
        test[2] = true;
        test[1] =  test[0] = test[2] =!test[1] ;
        for(int i = 0; i<3; i++) {
            System.out.println(test[i]);
        }
    }
}