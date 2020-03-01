# Data Collector Javascript Processor

## Run command line

```
mvn verify dependency:copy-dependencies -DskipTests
cp target/data-collector-javascript-processor-0.1-SNAPSHOT.jar target/dependency
java -XX:+UnlockExperimentalVMOptions -XX:+EnableJVMCI  --module-path=./target/compiler --upgrade-module-path=./target/compiler/compiler.jar -p target/dependency -m no.ssb.dc.javascript.processor/no.ssb.dc.graalvm.js.processor.App 
```

[![Build Status](https://drone.prod-bip-ci.ssb.no/api/badges/statisticsnorway/data-collector-javascript-processor/status.svg)](https://drone.prod-bip-ci.ssb.no/statisticsnorway/data-collector-javascript-processor)
[![Codacy Badge](https://api.codacy.com/project/badge/Grade/59ebea4bd20247f49a546bc7e7f5722a)](https://www.codacy.com/manual/oranheim/data-collector-javascript-processor?utm_source=github.com&amp;utm_medium=referral&amp;utm_content=statisticsnorway/data-collector-javascript-processor&amp;utm_campaign=Badge_Grade)
[![codecov](https://codecov.io/gh/statisticsnorway/data-collector-javascript-processor/branch/master/graph/badge.svg)](https://codecov.io/gh/statisticsnorway/data-collector-javascript-processor)

For more information about Data Collector, please refer to the [Data Collector documentation](https://github.com/statisticsnorway/data-collector-project).
