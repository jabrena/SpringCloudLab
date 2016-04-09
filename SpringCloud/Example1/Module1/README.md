# Module 1.

gradle init --type java-library

http://logback.qos.ch/

logback-core
logback-classic
logback-access

http://logback.qos.ch/manual/index.html

https://projectlombok.org/api/lombok/extern/slf4j/Slf4j.html

https://projectlombok.org/api/lombok/extern/java/Log.html

http://logback.qos.ch/manual/architecture.html

``` bash
1. Logging performance when logging is turned off entirely

You can turn off logging entirely by setting the level of the root logger `
to Level.OFF, the highest possible level.
When logging is turned off entirely, the cost of a log request
consists of a method invocation plus an integer comparison.
On a 3.2Ghz Pentium D machine this cost is typically around 20 nanoseconds.
``

log.setLevel(Level.OFF);

http://logback.qos.ch/manual/appenders.html

``` bash
SocketAppender and SSLSocketAppender

The appenders covered thus far are only able to log to local resources.
In contrast, the SocketAppender is designed to log to a remote entity
by transmitting serialized ILoggingEvent instances over the wire.
When using SocketAppender logging events on the wire are sent in the clear.
However, when using SSLSocketAppender, logging events are delivered over
a secure channel.

SyslogAppender

The syslog protocol is a very simple protocol:
a syslog sender sends a small message to a syslog receiver.
The receiver is commonly called syslog daemon or syslog server.
Logback can send messages to a remote syslog daemon.
This is achieved by using SyslogAppender.
```

https://github.com/mbonaci/ship-syslog
https://github.com/chunpu/syslogd

http://logback.qos.ch/manual/jmxConfig.html

-Dlogback.configurationFile=/path/to/config.xml

https://docs.spring.io/spring-boot/docs/current/reference/html/boot-features-logging.html
https://docs.spring.io/spring-boot/docs/current/reference/html/howto-logging.html

http://www.javabeat.net/spring-boot-logging/
