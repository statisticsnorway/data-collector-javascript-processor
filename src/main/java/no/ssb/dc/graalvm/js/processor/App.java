package no.ssb.dc.graalvm.js.processor;

import org.graalvm.polyglot.Context;

public class App {

    public static void main(String[] args) throws Exception {
        System.out.printf("Run main%n");

        try (Context context = Context.create()) {
            System.out.printf("Hello from GraalVM App%n");
        }
    }
}
