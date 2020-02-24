public class RomanNumber {
    int remainder;

    public String calculate(int decimalNumber) {
        remainder = decimalNumber;

        String ret = "";
        ret += getLiteralC(remainder);
        ret += getLiteralL(remainder);
        ret += getLiteralX(remainder);
        ret += getLiteralV(remainder);
        ret += getLiteralI(remainder);
        return ret;
    }

    private String getLiteralC(int decimalNumber) {
        return getLiteral(decimalNumber, "C", 100, "XC");
    }

    private String getLiteralL(int decimalNumber) {
        return getLiteral(decimalNumber, "L", 50, "XL");
    }

    private String getLiteralX(int decimalNumber) {
        return getLiteral(decimalNumber, "X", 10, "IX");
    }

    private String getLiteralV(int decimalNumber) {
        int divisionValue = decimalNumber / 5;
        if (decimalNumber > 8) {
            remainder = 0;
            return "IX";
        }
        remainder -= divisionValue * 5;
        if (divisionValue != 0)
            return "V";
        return "";
    }

    private String getLiteralI(int decimalNumber) {
        String ret = "";
        if (decimalNumber == 4) {
            ret = "IV";
            return ret;
        }
        for (int i = 0; i < decimalNumber; i++) {
            ret += "I";
        }
        return ret;
    }

    private String getLiteral(int decimalNumber, String segment, int corner_dnum, String corner_rnum) {
        int divisionValue = decimalNumber / corner_dnum;
        String ret = "";
        int corner_dnum_min = corner_dnum - (corner_dnum <= 10 ? 1 : 10);
        if ((decimalNumber >= corner_dnum_min) && (divisionValue == 0)) {
            ret = corner_rnum;
            remainder -= corner_dnum_min;
        } else {
            for (int i = 0; i < divisionValue; i++) {
                ret += segment;
            }
            remainder -= divisionValue * corner_dnum;
        }
        return ret;
    }
}
