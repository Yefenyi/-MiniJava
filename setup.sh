export CLASSPATH=".:/usr/local/lib/antlr-4.0-complete.jar:$CLASSPATH"
echo "----------ClassPathSet----------"
java -jar /usr/local/lib/antlr-4.0-complete.jar
echo "----------JarCompiled-----------"
java org.antlr.v4.Tool
echo "----------RunAntlr4-------------"
alias antlr4='java -jar /usr/local/lib/antlr-4.0-complete.jar'
echo "----------Antlr4Alias-----------"
alias grun='java org.antlr.v4.runtime.misc.TestRig'
echo "----------GrunAlias-------------"

