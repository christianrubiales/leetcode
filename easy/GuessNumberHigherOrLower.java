/* The guess API is defined in the parent class GuessGame.
   @param num, your guess
   @return -1 if my number is lower, 1 if my number is higher, otherwise return 0
      int guess(int num); */
public class GuessNumberHigherOrLower {

    public int guessNumber(int n) {
        int low = 1;
        int high = n;
        
        int mid = 0;
        while (true) {
            mid = low + (high - low)/2;
            if (guess(mid) == 1) {
                low = mid + 1;
            } else if (guess(mid) == -1) {
                high = mid - 1;
            } else {
                return mid;
            }
        }
    }
}
