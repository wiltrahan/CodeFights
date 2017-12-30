// Given a year, return the century it is in.
// The first century spans from the year 1 up to and including the year 100,
// the second - from the year 101 up to and including the year 200, etc

int centuryFromYear(int year) {
    if(year % 100 == 0) {
        return year / 100;
    }
    int modVal = year % 100;
    return ((year - modVal) + 100) / 100;
}
