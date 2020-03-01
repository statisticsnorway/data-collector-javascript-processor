package no.ssb.dc.graalvm.js.processor;

import no.ssb.dc.api.util.CommonUtils;
import org.graalvm.polyglot.Context;
import org.graalvm.polyglot.Source;
import org.graalvm.polyglot.Value;
import org.junit.jupiter.api.Test;

import java.io.IOException;

public class GraalVMTest {

    @Test
    public void testGraalVM() throws IOException {
        if (System.getProperty("java.vm.name").contains("GraalVM")) {
            System.out.printf("java.vm.name: %s%n", System.getProperty("java.vm.name"));
        }

        try (Context context = Context.create()) {
            String source = CommonUtils.readFileOrClasspathResource("test.js");
            System.out.printf("test.js:%n%s%n", source);
            context.eval(Source.newBuilder("js", source, "src.js").build());
            Value hello = context.getBindings("js").getMember("hello");
        }
    }
}

