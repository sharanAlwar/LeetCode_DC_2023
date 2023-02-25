//67
import java.math.*;
class Solution {
public String addBinary(String a, String b) {
    BigInteger c = new BigInteger(a,2);
    BigInteger d = new BigInteger(b,2);
    BigInteger e = c.add(d);
    String f = e.toString(2);
    return f;
}
}
