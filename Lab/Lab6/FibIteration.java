public class FibIteration implements iFindFib {

    @Override
    public int calculate_fib(int num) {
        int answer = 1 ;
        int numP = 0;
        int numN = 1;

        if (num <= 2) {
            answer = 1;
        } else {
            for (int i = 1; i < num ; ++i) {

                answer = numP + numN;
                numP = numN;
                numN = answer;

            }



        }
        return answer;
    }
}
