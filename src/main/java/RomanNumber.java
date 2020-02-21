import java.util.HashMap;
import java.util.LinkedHashMap;

public class RomanNumber
{

    RomanNumber()
    {

    }

    public String calculate(int decimalNumber)
    {
        if (decimalNumber <= 5)
            return getLiteral1To5(decimalNumber);
        else if(decimalNumber<=10){
            return getLiteral6to10(decimalNumber);
        }else if(decimalNumber<=20){
            return getLiteral11to20(decimalNumber);
        }else{
            return "";
        }
    }

    private String getLiteral11to20(int decimalNumber)
    {
        int upper = ((decimalNumber / 10) * 10);
        int lower = decimalNumber - upper;

        String numerals = "";

        if (decimalNumber >= 10)
        {
            numerals = getLiteral6to10(upper);
        }

        if (lower >= 6 && lower <= 10)
            numerals += getLiteral6to10(lower);

        numerals += getLiteral1To5(lower);

        return numerals;
    }

    private String getLiteral6to10(int decimalNumber)
    {
        switch (decimalNumber)
        {
            case 6: return "VI";
            case 7: return "VII";
            case 8: return "VIII";
            case 9: return "IX";
            case 10: return "X";
            default:
                return "";
        }
    }

    private String getLiteral1To5(int decimalNumber)
    {
        switch (decimalNumber)
        {
            case 1: return "I";
            case 2: return "II";
            case 3: return "III";
            case 4: return "IV";
            case 5: return "V";
            default:
                return "";
        }
    }
}
