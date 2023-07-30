# SpringBoot3LogbackSmtpAppenderError
```
cd C:\Users\Beci\Desktop\demo3\demo; JAVA_HOME=G:\\jdk-17.0.6_windows-x64_bin\\jdk-17.0.6 cmd /c "\"C:\\Users\\Beci\\Desktop\\demo3\\demo\\mvnw.cmd\" -Dexec.vmArgs= \"-Dexec.args=${exec.vmArgs} -classpath %classpath ${exec.mainClass} ${exec.appArgs}\" -Dexec.appArgs= -Dexec.mainClass=com.example.demo.DemoApplication -Dexec.executable=G:\\jdk-17.0.6_windows-x64_bin\\jdk-17.0.6\\bin\\java.exe -Dmaven.ext.class.path=G:\\NetBeans16\\netbeans\\java\\maven-nblib\\netbeans-eventspy.jar -Dfile.encoding=UTF-8 org.codehaus.mojo:exec-maven-plugin:3.0.0:exec"
Running NetBeans Compile On Save execution. Phase execution is skipped and output directories of dependency projects (with Compile on Save turned on) will be used instead of their jar artifacts.
Scanning for projects...

--------------------------< com.example:demo >--------------------------
Building demo 0.0.1-SNAPSHOT
  from pom.xml
--------------------------------[ jar ]---------------------------------

--- exec:3.0.0:exec (default-cli) @ demo ---
Logging system failed to initialize using configuration from 'null'
java.lang.IllegalStateException: Logback configuration error detected: 
ERROR in ch.qos.logback.core.model.processor.AppenderModelHandler - Could not create an Appender of type [ch.qos.logback.classic.net.SMTPAppender]. ch.qos.logback.core.util.DynamicClassLoadingException: Failed to instantiate type ch.qos.logback.classic.net.SMTPAppender
ERROR in ch.qos.logback.core.model.processor.DefaultProcessor@4241e0f4 - Failed to traverse model appender ch.qos.logback.core.model.processor.ModelHandlerException: ch.qos.logback.core.util.DynamicClassLoadingException: Failed to instantiate type ch.qos.logback.classic.net.SMTPAppender
ERROR in ch.qos.logback.core.model.processor.AppenderModelHandler - Could not create an Appender of type [ch.qos.logback.classic.net.SMTPAppender]. ch.qos.logback.core.util.DynamicClassLoadingException: Failed to instantiate type ch.qos.logback.classic.net.SMTPAppender
ERROR in ch.qos.logback.core.model.processor.DefaultProcessor@4241e0f4 - Failed to traverse model appender ch.qos.logback.core.model.processor.ModelHandlerException: ch.qos.logback.core.util.DynamicClassLoadingException: Failed to instantiate type ch.qos.logback.classic.net.SMTPAppender
	at org.springframework.boot.logging.logback.LogbackLoggingSystem.reportConfigurationErrorsIfNecessary(LogbackLoggingSystem.java:260)
	at org.springframework.boot.logging.logback.LogbackLoggingSystem.loadConfiguration(LogbackLoggingSystem.java:247)
	at org.springframework.boot.logging.AbstractLoggingSystem.initializeWithConventions(AbstractLoggingSystem.java:80)
	at org.springframework.boot.logging.AbstractLoggingSystem.initialize(AbstractLoggingSystem.java:60)
	at org.springframework.boot.logging.logback.LogbackLoggingSystem.initialize(LogbackLoggingSystem.java:187)
	at org.springframework.boot.context.logging.LoggingApplicationListener.initializeSystem(LoggingApplicationListener.java:332)
	at org.springframework.boot.context.logging.LoggingApplicationListener.initialize(LoggingApplicationListener.java:298)
	at org.springframework.boot.context.logging.LoggingApplicationListener.onApplicationEnvironmentPreparedEvent(LoggingApplicationListener.java:246)
	at org.springframework.boot.context.logging.LoggingApplicationListener.onApplicationEvent(LoggingApplicationListener.java:223)
	at org.springframework.context.event.SimpleApplicationEventMulticaster.doInvokeListener(SimpleApplicationEventMulticaster.java:172)
	at org.springframework.context.event.SimpleApplicationEventMulticaster.invokeListener(SimpleApplicationEventMulticaster.java:165)
	at org.springframework.context.event.SimpleApplicationEventMulticaster.multicastEvent(SimpleApplicationEventMulticaster.java:143)
	at org.springframework.context.event.SimpleApplicationEventMulticaster.multicastEvent(SimpleApplicationEventMulticaster.java:131)
	at org.springframework.boot.context.event.EventPublishingRunListener.multicastInitialEvent(EventPublishingRunListener.java:136)
	at org.springframework.boot.context.event.EventPublishingRunListener.environmentPrepared(EventPublishingRunListener.java:81)
	at org.springframework.boot.SpringApplicationRunListeners.lambda$environmentPrepared$2(SpringApplicationRunListeners.java:64)
	at java.base/java.lang.Iterable.forEach(Iterable.java:75)
	at org.springframework.boot.SpringApplicationRunListeners.doWithListeners(SpringApplicationRunListeners.java:118)
	at org.springframework.boot.SpringApplicationRunListeners.doWithListeners(SpringApplicationRunListeners.java:112)
	at org.springframework.boot.SpringApplicationRunListeners.environmentPrepared(SpringApplicationRunListeners.java:63)
	at org.springframework.boot.SpringApplication.prepareEnvironment(SpringApplication.java:356)
	at org.springframework.boot.SpringApplication.run(SpringApplication.java:307)
	at org.springframework.boot.SpringApplication.run(SpringApplication.java:1306)
	at org.springframework.boot.SpringApplication.run(SpringApplication.java:1295)
	at com.example.demo.DemoApplication.main(DemoApplication.java:10)
Exception in thread "main" java.lang.IllegalStateException: java.lang.IllegalStateException: Logback configuration error detected: 
ERROR in ch.qos.logback.core.model.processor.AppenderModelHandler - Could not create an Appender of type [ch.qos.logback.classic.net.SMTPAppender]. ch.qos.logback.core.util.DynamicClassLoadingException: Failed to instantiate type ch.qos.logback.classic.net.SMTPAppender
ERROR in ch.qos.logback.core.model.processor.DefaultProcessor@4241e0f4 - Failed to traverse model appender ch.qos.logback.core.model.processor.ModelHandlerException: ch.qos.logback.core.util.DynamicClassLoadingException: Failed to instantiate type ch.qos.logback.classic.net.SMTPAppender
ERROR in ch.qos.logback.core.model.processor.AppenderModelHandler - Could not create an Appender of type [ch.qos.logback.classic.net.SMTPAppender]. ch.qos.logback.core.util.DynamicClassLoadingException: Failed to instantiate type ch.qos.logback.classic.net.SMTPAppender
ERROR in ch.qos.logback.core.model.processor.DefaultProcessor@4241e0f4 - Failed to traverse model appender ch.qos.logback.core.model.processor.ModelHandlerException: ch.qos.logback.core.util.DynamicClassLoadingException: Failed to instantiate type ch.qos.logback.classic.net.SMTPAppender
	at org.springframework.boot.context.logging.LoggingApplicationListener.initializeSystem(LoggingApplicationListener.java:347)
	at org.springframework.boot.context.logging.LoggingApplicationListener.initialize(LoggingApplicationListener.java:298)
	at org.springframework.boot.context.logging.LoggingApplicationListener.onApplicationEnvironmentPreparedEvent(LoggingApplicationListener.java:246)
	at org.springframework.boot.context.logging.LoggingApplicationListener.onApplicationEvent(LoggingApplicationListener.java:223)
	at org.springframework.context.event.SimpleApplicationEventMulticaster.doInvokeListener(SimpleApplicationEventMulticaster.java:172)
	at org.springframework.context.event.SimpleApplicationEventMulticaster.invokeListener(SimpleApplicationEventMulticaster.java:165)
	at org.springframework.context.event.SimpleApplicationEventMulticaster.multicastEvent(SimpleApplicationEventMulticaster.java:143)
	at org.springframework.context.event.SimpleApplicationEventMulticaster.multicastEvent(SimpleApplicationEventMulticaster.java:131)
	at org.springframework.boot.context.event.EventPublishingRunListener.multicastInitialEvent(EventPublishingRunListener.java:136)
	at org.springframework.boot.context.event.EventPublishingRunListener.environmentPrepared(EventPublishingRunListener.java:81)
	at org.springframework.boot.SpringApplicationRunListeners.lambda$environmentPrepared$2(SpringApplicationRunListeners.java:64)
	at java.base/java.lang.Iterable.forEach(Iterable.java:75)
	at org.springframework.boot.SpringApplicationRunListeners.doWithListeners(SpringApplicationRunListeners.java:118)
	at org.springframework.boot.SpringApplicationRunListeners.doWithListeners(SpringApplicationRunListeners.java:112)
	at org.springframework.boot.SpringApplicationRunListeners.environmentPrepared(SpringApplicationRunListeners.java:63)
	at org.springframework.boot.SpringApplication.prepareEnvironment(SpringApplication.java:356)
	at org.springframework.boot.SpringApplication.run(SpringApplication.java:307)
	at org.springframework.boot.SpringApplication.run(SpringApplication.java:1306)
	at org.springframework.boot.SpringApplication.run(SpringApplication.java:1295)
	at com.example.demo.DemoApplication.main(DemoApplication.java:10)
Caused by: java.lang.IllegalStateException: Logback configuration error detected: 
ERROR in ch.qos.logback.core.model.processor.AppenderModelHandler - Could not create an Appender of type [ch.qos.logback.classic.net.SMTPAppender]. ch.qos.logback.core.util.DynamicClassLoadingException: Failed to instantiate type ch.qos.logback.classic.net.SMTPAppender
ERROR in ch.qos.logback.core.model.processor.DefaultProcessor@4241e0f4 - Failed to traverse model appender ch.qos.logback.core.model.processor.ModelHandlerException: ch.qos.logback.core.util.DynamicClassLoadingException: Failed to instantiate type ch.qos.logback.classic.net.SMTPAppender
ERROR in ch.qos.logback.core.model.processor.AppenderModelHandler - Could not create an Appender of type [ch.qos.logback.classic.net.SMTPAppender]. ch.qos.logback.core.util.DynamicClassLoadingException: Failed to instantiate type ch.qos.logback.classic.net.SMTPAppender
ERROR in ch.qos.logback.core.model.processor.DefaultProcessor@4241e0f4 - Failed to traverse model appender ch.qos.logback.core.model.processor.ModelHandlerException: ch.qos.logback.core.util.DynamicClassLoadingException: Failed to instantiate type ch.qos.logback.classic.net.SMTPAppender
	at org.springframework.boot.logging.logback.LogbackLoggingSystem.reportConfigurationErrorsIfNecessary(LogbackLoggingSystem.java:260)
	at org.springframework.boot.logging.logback.LogbackLoggingSystem.loadConfiguration(LogbackLoggingSystem.java:247)
	at org.springframework.boot.logging.AbstractLoggingSystem.initializeWithConventions(AbstractLoggingSystem.java:80)
	at org.springframework.boot.logging.AbstractLoggingSystem.initialize(AbstractLoggingSystem.java:60)
	at org.springframework.boot.logging.logback.LogbackLoggingSystem.initialize(LogbackLoggingSystem.java:187)
	at org.springframework.boot.context.logging.LoggingApplicationListener.initializeSystem(LoggingApplicationListener.java:332)
	... 19 more
Command execution failed.
org.apache.commons.exec.ExecuteException: Process exited with an error: 1 (Exit value: 1)
    at org.apache.commons.exec.DefaultExecutor.executeInternal (DefaultExecutor.java:404)
    at org.apache.commons.exec.DefaultExecutor.execute (DefaultExecutor.java:166)
    at org.codehaus.mojo.exec.ExecMojo.executeCommandLine (ExecMojo.java:982)
    at org.codehaus.mojo.exec.ExecMojo.executeCommandLine (ExecMojo.java:929)
    at org.codehaus.mojo.exec.ExecMojo.execute (ExecMojo.java:457)
    at org.apache.maven.plugin.DefaultBuildPluginManager.executeMojo (DefaultBuildPluginManager.java:126)
    at org.apache.maven.lifecycle.internal.MojoExecutor.doExecute2 (MojoExecutor.java:328)
    at org.apache.maven.lifecycle.internal.MojoExecutor.doExecute (MojoExecutor.java:316)
    at org.apache.maven.lifecycle.internal.MojoExecutor.execute (MojoExecutor.java:212)
    at org.apache.maven.lifecycle.internal.MojoExecutor.execute (MojoExecutor.java:174)
    at org.apache.maven.lifecycle.internal.MojoExecutor.access$000 (MojoExecutor.java:75)
    at org.apache.maven.lifecycle.internal.MojoExecutor$1.run (MojoExecutor.java:162)
    at org.apache.maven.plugin.DefaultMojosExecutionStrategy.execute (DefaultMojosExecutionStrategy.java:39)
    at org.apache.maven.lifecycle.internal.MojoExecutor.execute (MojoExecutor.java:159)
    at org.apache.maven.lifecycle.internal.LifecycleModuleBuilder.buildProject (LifecycleModuleBuilder.java:105)
    at org.apache.maven.lifecycle.internal.LifecycleModuleBuilder.buildProject (LifecycleModuleBuilder.java:73)
    at org.apache.maven.lifecycle.internal.builder.singlethreaded.SingleThreadedBuilder.build (SingleThreadedBuilder.java:53)
    at org.apache.maven.lifecycle.internal.LifecycleStarter.execute (LifecycleStarter.java:118)
    at org.apache.maven.DefaultMaven.doExecute (DefaultMaven.java:261)
    at org.apache.maven.DefaultMaven.doExecute (DefaultMaven.java:173)
    at org.apache.maven.DefaultMaven.execute (DefaultMaven.java:101)
    at org.apache.maven.cli.MavenCli.execute (MavenCli.java:906)
    at org.apache.maven.cli.MavenCli.doMain (MavenCli.java:283)
    at org.apache.maven.cli.MavenCli.main (MavenCli.java:206)
    at jdk.internal.reflect.NativeMethodAccessorImpl.invoke0 (Native Method)
    at jdk.internal.reflect.NativeMethodAccessorImpl.invoke (NativeMethodAccessorImpl.java:77)
    at jdk.internal.reflect.DelegatingMethodAccessorImpl.invoke (DelegatingMethodAccessorImpl.java:43)
    at java.lang.reflect.Method.invoke (Method.java:568)
    at org.codehaus.plexus.classworlds.launcher.Launcher.launchEnhanced (Launcher.java:283)
    at org.codehaus.plexus.classworlds.launcher.Launcher.launch (Launcher.java:226)
    at org.codehaus.plexus.classworlds.launcher.Launcher.mainWithExitCode (Launcher.java:407)
    at org.codehaus.plexus.classworlds.launcher.Launcher.main (Launcher.java:348)
    at jdk.internal.reflect.NativeMethodAccessorImpl.invoke0 (Native Method)
    at jdk.internal.reflect.NativeMethodAccessorImpl.invoke (NativeMethodAccessorImpl.java:77)
    at jdk.internal.reflect.DelegatingMethodAccessorImpl.invoke (DelegatingMethodAccessorImpl.java:43)
    at java.lang.reflect.Method.invoke (Method.java:568)
    at org.apache.maven.wrapper.BootstrapMainStarter.start (BootstrapMainStarter.java:52)
    at org.apache.maven.wrapper.WrapperExecutor.execute (WrapperExecutor.java:161)
    at org.apache.maven.wrapper.MavenWrapperMain.main (MavenWrapperMain.java:73)
------------------------------------------------------------------------
BUILD FAILURE
------------------------------------------------------------------------
Total time:  3.059 s
Finished at: 2023-07-30T17:36:26+02:00
------------------------------------------------------------------------
Failed to execute goal org.codehaus.mojo:exec-maven-plugin:3.0.0:exec (default-cli) on project demo: Command execution failed.: Process exited with an error: 1 (Exit value: 1) -> [Help 1]

To see the full stack trace of the errors, re-run Maven with the -e switch.
Re-run Maven using the -X switch to enable full debug logging.

For more information about the errors and possible solutions, please read the following articles:
[Help 1] http://cwiki.apache.org/confluence/display/MAVEN/MojoExecutionException
```
