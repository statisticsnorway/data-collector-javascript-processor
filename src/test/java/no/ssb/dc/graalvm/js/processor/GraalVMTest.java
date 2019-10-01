package no.ssb.dc.graalvm.js.processor;

import org.testng.annotations.Test;

public class GraalVMTest {

    @Test
    public void testName() {

        if (System.getProperty("java.vm.name").contains("GraalVM")) {
            return;
        }
    }
}
