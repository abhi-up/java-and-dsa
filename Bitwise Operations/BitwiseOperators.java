
public class BitwiseOperators {
    public static void main(String[] args) {
        int a = 5; // Binary representation: 0000 0101
        int b = 3; // Binary representation: 0000 0011

        int resultAnd = a & b; // Bitwise AND: 0000 0001 (1)
        int resultOr = a | b; // Bitwise OR: 0000 0111 (7)
        int resultXor = a ^ b; // Bitwise XOR: 0000 0110 (6)
        int resultNotA = ~a; // Bitwise NOT of a: 1111 1010 (-6)
        int resultLeftShift = a << 1; // Left shift by 1: 0000 1010 (10)
        int resultRightShift = a >> 1; // Right shift by 1: 0000 0010 (2)

        System.out.println("Bit AND Operation: " + resultAnd);
        System.out.println("Bit OR Operation: " + resultOr);
        System.out.println("Bit XOR Operation: " + resultXor);
        System.out.println("Bit Not Operation: " + resultNotA);
        System.out.println("Bit Left Shift Operation: " + resultLeftShift);
        System.out.println("Bit Right Shift Operation: " + resultRightShift);

    }

}
