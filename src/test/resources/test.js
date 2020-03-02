function hello() {
    console.log("hello world");
}

if (typeof Graal != 'undefined') {
    print(Graal.versionJS);
    print(Graal.versionGraalVM);
    print(Graal.isGraalRuntime);
}

hello();
