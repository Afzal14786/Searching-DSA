package Codes.NumberSystem;

public class bit {
    public static void main(String[] args) {
        int n = 8;
        int pos = 2;

        int bitmask = 1 << pos;

        if ((bitmask & n) == 0) {
            System.out.println("Bit was zero");
        } else {
            System.out.println("Bit was non zero");
        }
    }
}
