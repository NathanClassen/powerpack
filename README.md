# PowerPack
_Pack with Power, with Powerpack!_

A command-line tool to calculate exactly how many goods to bring on your next hike.

Simply run powerpack and enter the maximum weight capacity of your bag.

### Prerequisites

You must either have Java 17 and Maven installed or have Docker installed and ensure the Docker Daemon is running

## Build

### Build JAR file with Maven

From the root of the project, run:

`mvn package`

### Build Docker image

From the root of the project, run:

`docker build -t powerpack .`

## Run

This simple CLI program takes zero or one argument, an integer specifying the maximum weight capacity of the bag you'll 
be packing. The default is 27.

### Execute the JAR file

From the root of the project, run:

`java -jar target/PowerPack-1.0.jar <capacity>`


### Run the program as a Docker image

Run,

`docker run --rm powerpack <capacity>`