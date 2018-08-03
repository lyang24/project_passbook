package com.passbook.merchant.security;
import java.lang.ThreadLocal;

/**
 * use ThreadLocal to store evey single token's data
 */
public class AccessContext {
    private static final ThreadLocal<String> token = new ThreadLocal<String>();

    public static String getToken() {
        return token.get();
    }

    public static void setToken(String tokenStr) {
        token.set(tokenStr);
    }
    // might be redudant but i do it for safety
    public static void clearAccessKey() {
        token.remove();
    }
}
