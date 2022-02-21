public class FibFormula implements iFindFib{

    @Override
    public int calculate_fib(int n) {
        int fn ;
        double total;
        //   (( (1+sqrt(5) )/2)^n - ((1-sqrt(5))/2)^n) / sqrt(5)
        //total = ((Math.pow(((1+Math.sqrt(5))/2), n)) - (Math.pow((1 - Math.sqrt(5))/2, n)/Math.sqrt(5)));

//        double section1 = ((1+Math.sqrt(5))/2);
//        double section1n = Math.pow(section1, n);
//        double section2 = ((1 - Math.sqrt(5))/2);
//        double section2n = Math.pow(section2, n);
//        double section2nd = (section2n/Math.sqrt(5));
//        total = section1n - section2nd;
        double SQ = Math.sqrt(5);
        double func = (1 + SQ)/2;
        int answer = (int) ((Math.pow(func, n) - Math.pow(-func, -n))/SQ);
        return answer;



//        int answer = (int)total;
//
//        return answer;
    }
}

