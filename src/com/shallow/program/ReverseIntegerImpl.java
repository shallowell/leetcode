package com.shallow.program;

import java.util.ArrayList;
import java.util.List;

public class ReverseIntegerImpl {

    public int reverse1(int inputNum) {
        int tempInt, reversedInt = 0;

        while(inputNum != 0) {
            tempInt = inputNum % 10;

            if (reversedInt + tempInt/10 > Integer.MAX_VALUE/ 10) return 0;
            if (reversedInt + tempInt/10 < Integer.MIN_VALUE/ 10) return 0;

            reversedInt *= 10;
            reversedInt += tempInt;
            inputNum /= 10;
        }
        return reversedInt;
    }

    public int reverse2(int inputNum) {
        String isMinus = "";
        List<String> reversedArr = new ArrayList<String>();
        String numStr = String.valueOf(inputNum);
        int length = numStr.length();
        for(int i = length - 1; i >= 0; i--) {
            if (numStr.charAt(i) == '-') {
                isMinus = "-";
                break;
            }
            System.out.println(numStr.charAt(i));
            reversedArr.add(Character.toString(numStr.charAt(i)));
        }

        Double d = Double.parseDouble(isMinus + String.join("",(reversedArr)));
        if (d < -2147483648 || d > 2147483647) {
            return 0;
        }
        return d.intValue();
    }



    public int reverse3(int inputNum) {
        String isMinus = "";
        List<String> reversedArr = new ArrayList<String>();
        String[] strArr = String.valueOf(inputNum).split("");
        int length = strArr.length;
        for (int i = length - 1; i >= 0; i--) {
            if (strArr[i].equals("-")) {
                isMinus = "-";
                break;
            }
            reversedArr.add(strArr[i]);
        }
        try {
            return Integer.parseInt(isMinus + String.join("", reversedArr));
        } catch (NumberFormatException e) {
            return 0;
        }

    }
}
