module no.ssb.dc.javascript.processor {

    requires no.ssb.service.provider.api;
    requires no.ssb.dc.api;

    requires org.slf4j;

    requires org.graalvm.sdk;
    requires org.graalvm.truffle;
    requires org.graalvm.js.scriptengine;

    exports no.ssb.dc.graalvm.js.processor;
}
