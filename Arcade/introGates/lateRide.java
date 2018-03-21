// Return an answer as the sum of digits that the digital timer in the format hh:mm would show.

// Example
// For n = 240, the output should be
// lateRide(n) = 4.

// Since 240 minutes have passed, the current time is 04:00. The digits sum up to 0 + 4 + 0 + 0 = 4, which is the answer.

// For n = 808, the output should be
// lateRide(n) = 14.

// 808 minutes mean that it's 13:28 now, so the answer should be 1 + 3 + 2 + 8 = 14.
int lateRide(int n) {
    String hour = String.valueOf(n / 60);
    String min = String.valueOf(n % 60);
    int time = 0;

    for(int i = 0; i < hour.length(); i++){
        time += Character.digit(hour.charAt(i), 10);
    }
    for(int i = 0; i < min.length(); i++) {
        time += Character.digit(min.charAt(i), 10);
    }
    return time;
}
