// Consider an arithmetic expression of the form a#b=c. Check whether it is possible to replace # with one of the four signs: +, -, * or / to obtain a correct expression.

boolean arithmeticExpression(int a, int b, int c) {
    int add = a + b;
    int sub = a - b;
    int mult = a * b;
    double div = (double)a / b;

    if(c == add || c == sub || c == mult || c == div) {
        System.out.println(div);
        return true;
    }
    return false;
}
