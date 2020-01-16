#Javaがインストールされていない端末でも動く、配布できるJavaアプリケーション例
## 要件：JDK9以降！

## 1.コンパイル
```
javac -d out src/module-info.java
javac -d out --module-path out src/game/Main.java
```
## 2.確認
```
java --module-path out --module jlinkModule/game.Main
```
## 3.JDKをスイッチ(jlinkコマンド)
```
export JAVA_HOME=`/usr/libexec/java_home -v 11`
alias jlink=${JAVA_HOME}/bin/jlink
```
## 4.JRE同梱アプリ作成
```
jlink --launcher start=jlinkModule/game.Main --output game --module-path out --add-modules jlinkModule
```
## 5.実行
```
bash game/bin/start
```

##
jlink --compress=2 --module-path $JAVA_HOME/jmods --add-modules java.base,java.desktop --output jre
