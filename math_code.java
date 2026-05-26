public class Main{
    public static void main(String[] args) {
        //System.out.println(Math.PI);//Math class has PI
        double result = Math.max(10, 100); // pow abs E PI sqrt round ceil floor max min
        System.out.println(result);
        System.out.printf("%.1f", Math.pow(3.1415, 2)); // also rounds off
        //superscripts: NumLock+Alt+0178 (0179 for cube)
        //%[flags][width][.precision][specifier-character] format string
        //% s-string, c-char, d-int, f-double, b-boolean

        //flags:
        // + = plus
        //,=comma grouping separator
        // (= neg numbers enclosed
        //space= minus if neg space if pos
        System.out.printf("\n% ,09.1f",-123456.789);// padding 04 adds zeroes till total length is 4 just 4 adds space and -4 rightpads
    }
}
