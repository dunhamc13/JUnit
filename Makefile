test : TestConversion.class junit.jar hamcrest-core.jar
	java -cp .:./junit.jar:./hamcrest-core.jar org.junit.runner.JUnitCore TestConversion

TestConversion.class : TestConversion.java junit.jar hamcrest-core.jar
	javac -cp .:./junit.jar:./hamcrest-core.jar TestConversion.java
