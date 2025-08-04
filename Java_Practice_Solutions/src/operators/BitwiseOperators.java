package operators;

public class BitwiseOperators {
    public static void main(String[] args){

        //  bitwise operators
        int d = 0b1010;
        int e = 0b1100;
        System.out.println("d & e : " + (d &e)); //bitwise AND
        //output= 8
        System.out.println("d ^ e : "+ (d ^ e)); //bitwise XOR
        // output = 6
        System.out.println(" ~d : " + (~d)); // bitwise NOT , complement operator
        //output = -11
        System.out.println("d<<2 : " + (d<<2)); // left shift
        //output = 40
        System.out.println("e>>> 1 : " + ( e>>>1 )); // right shift
        //output = 6
        System.out.println("d | e : " + (d | e)); // bitwise OR
//output = 14
    }
}
