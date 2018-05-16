# web-start

## Deploy

Execute gradle tasks:

- generate keystore
```bash
$ ./gradlew genkey
```
or manually:
```bash
$ keytool -genkey -alias calc -keyalg RSA -keystore calc.jks -keysize 2048
$ cp calc.jks ~/.keystore
```

- generate certificate
```bash
$ keytool -export -alias calc -keystore calc.jks -rfc -file calc.csr
```

**Important:** Add the certificate as a trusted one in Java Control Panel.
For Mac: System Preferences > Java > Open Java Control Panel > Security tab > Manage certificates > User > Import.
Import it possibly everywhere (trusted certificates, secure site etc.).

- create *.jnlp file with a signed jar
```bash
$ ./gradlew createWebstart
```

It will create webstart files at `build/jnlp`.

## Start

Copy the contents of `build/jnlp` to Tomcat's `webapps/ROOT` folder.

Go to Tomcat's `bin` folder and execute startup script.
```bash
$ cd /opt/apache-tomcat-9.0.8/bin
$ ./startup.sh
```

_Note: check if Tomcat is running with `ps -ef | grep tomcat` and eventually kill the kitten: `pkill -9 -f tomcat`._

_Shorten: ./killtomacat.sh_

In web browser:
```
http://localhost:8080/launch.jnlp
```

It will download the jnlp file.
Execute it and enjoy the calculator.


--------

Commands I found useful:

Sign jar manually:
```bash
jarsigner -keystore ../../../calc.jks -storepass hania123 -keypass hania123 lab8__V1.0-SNAPSHOT-calc.jar calc
```

Unpack *.pack.gz file for whatever reason:
```bash
unpack200 *.jar.pack.gz *.jar
```
