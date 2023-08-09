package Threads;

import java.io.IOException;

public class Runtime1 {
    public static void main(String[] args) throws IOException {
        System.out.println(Runtime.getRuntime().totalMemory());
        System.out.println(Runtime.getRuntime().freeMemory());
    }
}
