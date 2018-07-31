package com.passbook.merchant.Security;

/**
 * use ThreadLocal to store evey single token's data
 */
public class AccessContext {
    private static final ThreadLocal<String> token = new TheadLocal<String>();

    public static String getToken() {
        return token.get();
    }

    public static void setToken(String tokenStr) {
        token.set(tokenStr);
    }
    // might be redudant but i do it for safety
    public stativ void clearAccessKey() {
        token.remove();
    }
}
