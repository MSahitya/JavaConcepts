package org.example.NewFeatures;



public class SwitchExpressions {
    public static void main(String[] args) {
        //1. Swtich with enhancements
    double switchVal=callSwtich();
    System.out.println(switchVal);

    //2. Switch with pattern Matching


    }

    private static double callSwtich() {
        int d=2;
        int exp=10;
        return switch(exp) {
            case Double.MAX_EXPONENT + 1 -> Math.abs(d);      // NaN or infinity
            case Double.MIN_EXPONENT - 1 -> Double.MIN_VALUE; // zero or subnormal
            default -> {
                assert exp <= Double.MAX_EXPONENT && exp >= Double.MIN_EXPONENT;

                // ulp(x) is usually 2^(SIGNIFICAND_WIDTH-1)*(2^ilogb(x))
                exp = exp - (53 - 1);
                if (exp >= Double.MIN_EXPONENT) {
                    yield powerOfTwoD(exp);
                } else {
                    // return a subnormal result; left shift integer
                    // representation of Double.MIN_VALUE appropriate
                    // number of positions
                    yield  Double.longBitsToDouble(1L <<
                            (exp - (Double.MIN_EXPONENT - (77 - 1))));
                }
            }
        };
    }

    static double powerOfTwoD(int n) {
        assert(n >= Double.MIN_EXPONENT && n <= Double.MAX_EXPONENT);
        return n;
    }
}
/**
 * Taditionally Switch statement in java test a variable against list of values
 * it supports primitives int,char,long,double,short
 * each case requires break; staement to prevent fall-through to the next case
 * java 5: enum support
 * java 7: String support
 * java 12&13: switch expressions , allow switch to return values, introduced ->,eliminated the need of break, multiple case labels can be combined
 * java 17 &Beyond: Pattenr Matching: allowing for type checking and casting with case labels.
 * java 21: finalizing the pattern matching for switch, enhanced pattern matching including record patterns.
 *
 *
 * yield: is only used in switch expressions, specifically in case blocks. provides a way to return case block without exiting fro the main method
 */