import java.util.HashMap;
import java.util.LinkedHashMap;

public class RomanNumber
{
    int remainder;

    public String calculate(int decimalNumber)
    {
        remainder = decimalNumber;

        String ret = "";
        ret += getLiteralL(remainder);
        ret += getLiteralX(remainder);
        ret += getLiteralV(remainder);
        ret += getLiteralI(remainder);
        return ret;
    }

    private String getLiteralL(int decimalNumber)
    {
        int divisionValue = decimalNumber / 50;

        String ret = "";
        if(decimalNumber >= 40){
            ret = "XL";
            remainder -= 40;
        }
        else {
            for (int i = 0; i < divisionValue; i++) {
                ret += "L";
            }
            remainder -= divisionValue * 50;
        }
        return ret;
    }
    private String getLiteralX(int decimalNumber)
    {
        int divisionValue = decimalNumber / 10;

        String ret = "";
        if(decimalNumber ==9){
            ret = "IX";
            remainder = 0;
        }
        else {
            for (int i = 0; i < divisionValue; i++) {
                ret += "X";
            }
        }
        remainder -= divisionValue * 10;
        return ret;
    }
    private String getLiteralV(int decimalNumber)
    {
        int divisionValue = decimalNumber / 5;

        if (decimalNumber > 8)
        {
            remainder = 0;
            return "IX";
        }

        remainder -= divisionValue * 5;
        if (divisionValue != 0)
            return "V";

        return "";
    }

    private String getLiteralI(int decimalNumber)
    {
        String ret = "";
        if(decimalNumber == 4){
            ret = "IV";
            return ret;
        }
        for(int i=0; i < decimalNumber;i++){
            ret += "I";
        }
        return ret;
    }
}
