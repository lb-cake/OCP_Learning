javac Chapter_1/challenge/Disemvoweler.java Chapter_1/challenge/driver/TrollHunterDriver.java
java Chapter_1.challenge.driver.TrollHunterDriver

# Create a jar
jar cvf TrollHunter.jar Chapter_1/challenge/driver/TrollHunterDriver.class Chapter_1/challenge/Disemvoweler.class

# Add manifest to jar
jar cvfm TrollHunter.jar manifest.txt Chapter_1/challenge/*.class Chapter_1/challenge/driver/*.class

# Run the damn jar
java -cp TrollHunter.jar Chapter_1/challenge/driver/TrollHunterDriver