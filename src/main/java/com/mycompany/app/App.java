package com.mycompany.app;

/**
 * Hello world!
 */
public class App
{

    private final String message = "GITHUBESSENTIALS:1234:547456:test@linux.com";

    public App() {}

    public static void main(String[] args) {
        System.out.println(new App().getMessage());
    }

    private final String getMessage() {
        return message;
    }

}
