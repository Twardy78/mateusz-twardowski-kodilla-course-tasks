package com.kodilla.exception;

public class ExponentiationRules {
    ;

    public void exponentiationProcess (int a, int b) {
        int result = 1;
        if (b == 0)
            result = 1;
        else {
            if (b == 1) {
                result = a;
            }else {
                if (a == 0 ){
                    result = 0;
                }else {
                    for (int i = 0; i <= b; i++) {
                    result = result * a;
                    }
                }

            }
        }
        System.out.println(result);
    }

}
