import jdk.dynalink.Operation;

import java.util.Scanner;

public class BitsManipulation {
    public static void main(String[] args) {

//        Bit manipulation: it is a technique int programming in which we can manipulate the bits
//                          of any number by performing some specific task on bits of any number
//                          this technique is used in many algorithms for finding appropriate answer.

//               Operators: & (and), |(or), ^(xor), ~(ones complement), <<(left shift), >>(right shift).

//               Operations to be performed of bits are:
//                    Left shift: syntax: Number Operator position (A << 1)
//                    right shift: syntax: Number Operator position (A >> 1)
//                    update bit:
//                    clear bit:
//                    get bit:
//                    set bit:

//    Q1: Get the 3rd bit(position = 2) of a number n. n = 0101
//            first do-> Bit mask: 1<<i
//                       Operation: And
//         int n = 5;
//         int pos = 3;
//         int bitMask = 1<<pos;
//
//         if((bitMask & n) == 0){
//             System.out.println("bit was 0");
//         } else {
//             System.out.println("bit was 1");
//         }
//    Q2: set the 2nd bit(position = 1) of a number n. n = 0101
//        first do-> Bit mask: 1<<i
//                   Operation: OR

//        int n = 5;
//        int pos = 3;
//        int bitMask = 1<<pos;
//        int newNumber = bitMask | n;
//        System.out.println(newNumber);

//        Q3: clear the 3nd bit(position = 2) of a number n. n = 0101
//        first do-> Bit mask: 1<<i
//                   Operation: AND with NOT

//        int n = 5;
//        int pos = 2;
//        int bitMask = 1<<pos;
//        int newNumber = ~(bitMask) & n;
//        System.out.println(newNumber);


//        Q4: update the 2nd bit(position = 1) of a number n to 1. n = 0101
//        first do-> Bit mask: 1<<i
//                   Operation: AND with NOT(for update with 0)
//                              OR (For update with 1)

        Scanner sc = new Scanner(System.in);
        int opr = sc.nextByte();
//      opr = 1: set  opr = 0: clear
        int n = sc.nextInt();
        int pos = sc.nextInt();
        int bitMask = 1<<pos;

        if(opr == 0) {
            int newNumber = ~(bitMask) & n;
            System.out.println(newNumber);
        } else {
            int newNumber = bitMask | n;
            System.out.println(newNumber);
        }
    }
}