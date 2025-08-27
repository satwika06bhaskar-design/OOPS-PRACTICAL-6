package javaprogramming;

public class Wrap {

    public static void main(String[] args) {
        // Declaration and Initialization
        byte byteVar = 10;
        short shortVar = 1000;
        int intVar = 100000;
        long longVar = 10000000000L;
        float floatVar = 10.5f;
        double doubleVar = 20.99;
        char charVar = 'A';
        boolean booleanVar = true;

        // Output values and sizes using Wrapper classes
        System.out.println("byte: Value = " + byteVar + ", Size = " + Byte.SIZE + " bits");
        System.out.println("short: Value = " + shortVar + ", Size = " + Short.SIZE + " bits");
        System.out.println("int: Value = " + intVar + ", Size = " + Integer.SIZE+ " bits");
        System.out.println("long: Value = " + longVar + ", Size = " + Long.SIZE + " bits");
        System.out.println("float: Value = " + floatVar + ", Size = " + Float.SIZE + " bits");
        System.out.println("double: Value = " + doubleVar + ", Size = " + Double.SIZE + " bits");
        System.out.println("char: Value = " + charVar + ", Size = " + Character.SIZE + " bits");
        System.out.println("boolean: Value = " + booleanVar + ", Size = Not precisely defined (JVM dependent)");
    }
}