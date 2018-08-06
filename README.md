# OSGi Declarative Services Hello World Example

## Prerequisites

Install
- jdk 1.8
- maven >= 3.5

## Source 

Checkout the source 

	git clone git@github.com:cschneider/osgi-ds-hello-world.git

Start eclipse and import from top level directory as existing maven projects.

## Build

	mvn clean install

## Run standalone

	java -jar starter/target/app.jar 

## Run in Apache Karaf

Download current Apache Karaf version, extract and start.
In the karaf shell type:

	feature:install scr
	install -s mvn:net.lr.demo/net.lr.ds.hello/1.0.0-SNAPSHOT


