public class RomanNumber {
    int remainder;

    public String calculate(int decimalNumber) {
        remainder = decimalNumber;
        String ret = "";
        ret += getLiteralM(remainder);
        ret += getLiteralD(remainder);
        ret += getLiteralC(remainder);
        ret += getLiteralL(remainder);
        ret += getLiteralX(remainder);
        ret += getLiteralV(remainder);
        ret += getLiteralI(remainder);
        return ret;
    }

    private String getLiteralM(int decimalNumber) {
        return getLiteral(decimalNumber, "M", 1000, "CM");
    }

    private String getLiteralD(int decimalNumber) {
        return getLiteral(decimalNumber, "D", 500, "CD");
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
        return getLiteralSegments("V", 5, divisionValue);
    }

    private String getLiteralI(int decimalNumber) {
        int divisionValue = decimalNumber / 1;
        if (decimalNumber == 4) {
            return "IV";
        }
        return getLiteralSegments("I", 1, divisionValue);
    }

    private String getLiteral(int decimalNumber, String segment, int cornerDecimalNumber, String cornerRomanLiteral) {
        if (remainder == 0)
            return "";
        int divisionValue = decimalNumber / cornerDecimalNumber;
        String ret = "";
        int cornerDecimalNumberMin = cornerDecimalNumber - getCornerSubstractor(cornerDecimalNumber);
        if ((decimalNumber >= cornerDecimalNumberMin) && (divisionValue == 0)) {
            ret = cornerRomanLiteral;
            remainder -= cornerDecimalNumberMin;
        } else {
            ret = getLiteralSegments(segment, cornerDecimalNumber, divisionValue);
        }
        return ret;
    }

    private String getLiteralSegments(String segment, int cornerDecimalNumber, int divisionValue) {
        String ret = "";
        for (int i = 0; i < divisionValue; i++) {
            ret += segment;
        }
        remainder -= divisionValue * cornerDecimalNumber;
        return ret;
    }

    private int getCornerSubstractor(int cornerDecimalNumber) {
        int substractor = 1;
        while (cornerDecimalNumber > 10) {
            cornerDecimalNumber /= 10;
            substractor *= 10;
        }
        return substractor;
    }
}
