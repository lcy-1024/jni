# jni-test

**mvn clean package**

1. cd /target

2. java -jar jni-test-1.0-SNAPSHOT-jar-with-dependencies.jar

   ```
   /lib64/libhello.so exists? true
   load succeed! /lib64/libhello.so
   Hello JNI!
   ```
***
1. cd /target

2. ./jni-test

   ```
   /lib64/libhello.so exists? true
   load succeed! /lib64/libhello.so
   Hello JNI!
   ```

   

# jni-quarkus-test

**mvn clean package -Pnative**

1. cd /target/jni-quarkus-test-1.0-SNAPSHOT-native-image-source-jar

2. java -jar jni-quarkus-test-1.0-SNAPSHOT-runner.jar

   ```
   /lib64/libhello.so exists? true
   load succeed! /lib64/libhello.so
   __  ____  __  _____   ___  __ ____  ______ 
    --/ __ \/ / / / _ | / _ \/ //_/ / / / __/ 
    -/ /_/ / /_/ / __ |/ , _/ ,< / /_/ /\ \   
   --\___\_\____/_/ |_/_/|_/_/|_|\____/___/   
   2022-07-25 14:40:26,225 INFO  [io.quarkus] (main) jni-quarkus-test 1.0-SNAPSHOT on JVM (powered by Quarkus 2.7.2.Final) started in 0.444s. 
   2022-07-25 14:40:26,272 INFO  [io.quarkus] (main) Profile prod activated. 
   2022-07-25 14:40:26,273 INFO  [io.quarkus] (main) Installed features: [cdi]
   2022-07-25 14:40:26,319 INFO  [io.quarkus] (main) jni-quarkus-test stopped in 0.044s
   Hello JNI!
   ```

***
1. cd /target

2. ./jni-quarkus-test-1.0-SNAPSHOT-runner

   ```
   __  ____  __  _____   ___  __ ____  ______ 
    --/ __ \/ / / / _ | / _ \/ //_/ / / / __/ 
    -/ /_/ / /_/ / __ |/ , _/ ,< / /_/ /\ \   
   --\___\_\____/_/ |_/_/|_/_/|_|\____/___/   
   2022-07-25 14:40:26,660 ERROR [io.qua.run.Application] (main) Failed to start application (with profile prod): java.lang.UnsatisfiedLinkError: com.lcy.Hello.sayHello()V [symbol: Java_com_lcy_Hello_sayHello or Java_com_lcy_Hello_sayHello__]
   	at com.oracle.svm.jni.access.JNINativeLinkage.getOrFindEntryPoint(JNINativeLinkage.java:153)
   	at com.oracle.svm.jni.JNIGeneratedMethodSupport.nativeCallAddress(JNIGeneratedMethodSupport.java:57)
   	at com.lcy.Hello.sayHello(Hello.java)
   	at com.lcy.Start.test(Start.java:17)
   	at com.lcy.Start_Observer_test_a799b8b2587eb0527280ebced59cb1a03604e37b.notify(Unknown Source)
   	at io.quarkus.arc.impl.EventImpl$Notifier.notifyObservers(EventImpl.java:320)
   	at io.quarkus.arc.impl.EventImpl$Notifier.notify(EventImpl.java:302)
   	at io.quarkus.arc.impl.EventImpl.fire(EventImpl.java:73)
   	at io.quarkus.arc.runtime.ArcRecorder.fireLifecycleEvent(ArcRecorder.java:128)
   	at io.quarkus.arc.runtime.ArcRecorder.handleLifecycleEvents(ArcRecorder.java:97)
   	at io.quarkus.deployment.steps.LifecycleEventsBuildStep$startupEvent1144526294.deploy_0(Unknown Source)
   	at io.quarkus.deployment.steps.LifecycleEventsBuildStep$startupEvent1144526294.deploy(Unknown Source)
   	at io.quarkus.runner.ApplicationImpl.doStart(Unknown Source)
   	at io.quarkus.runtime.Application.start(Application.java:101)
   	at io.quarkus.runtime.ApplicationLifecycleManager.run(ApplicationLifecycleManager.java:103)
   	at io.quarkus.runtime.Quarkus.run(Quarkus.java:67)
   	at io.quarkus.runtime.Quarkus.run(Quarkus.java:41)
   	at io.quarkus.runtime.Quarkus.run(Quarkus.java:120)
   	at com.lcy.Application.main(Application.java:9)
   ```

   
