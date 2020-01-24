package com.mycompany.app;

/**
 * Hello world!
 */
public class App
{

    private final String message = "GITHUBESSENTIALS:1234:547456:test@linux.com";
    private final String message1 = "GITHUBESSENTIALS:9568:21547:test@linux.com";
    private final String message2 = "GITSENTIALS:956800:21547000:test@linux.com";
    public App() {}

    public static void main(String[] args) {
        System.out.println(new App().getMessage());
        System.out.println(new App().getMessage1());
        System.out.println(new App().getMessage2());
    }

    private final String getMessage() {
        return message;
    }
    private final String getMessage1() {
        return message1;
    }
    private final String getMessage2() {
        return message2;
    }

}
