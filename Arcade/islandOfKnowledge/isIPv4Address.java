// An IP address is a numerical label assigned to each device (e.g., computer, printer) participating in a computer network that uses the Internet Protocol for communication. There are two versions of the Internet protocol, and thus two versions of addresses. One of them is the IPv4 address.

// IPv4 addresses are represented in dot-decimal notation, which consists of four decimal numbers, each ranging from 0 to 255 inclusive, separated by dots, e.g., 172.16.254.1.

// Given a string, find out if it satisfies the IPv4 address naming rules.
boolean isIPv4Address(String inputString) {
  String[] ipv = inputString.split(Pattern.quote("."));
  for(int i = 0; i < ipv.length; i++) {
    if(isInteger(ipv[i]) == false ||
       ipv.length != 4 ||
       Integer.parseInt(ipv[i]) < 0 ||
       Integer.parseInt(ipv[i]) > 255) {
      return false;
    }
  }
  return true;
}
boolean isInteger(String s) {
  boolean isValidInteger = false;
      try
      {
         Integer.parseInt(s);
         isValidInteger = true;
      }
      catch (NumberFormatException ex)
      {
         // s is not an integer
      }
      return isValidInteger;
}
