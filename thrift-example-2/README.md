# Thrift example 2
Following the official tutorial at https://thrift.apache.org/tutorial/java


## Prerequisites
* Install Thrift binary
    - Download Thrift binary
    - Install dependencies. E.g. for Ubuntu `apt-get install libtool m4 automake`
    - Install Thrift binary: follow instructions on README.
        - https://thrift-tutorial.readthedocs.io/en/latest/installation.html?fbclid=IwAR104Bk0bsFtxCrOX1I5_u_WliKQYf_URYch5okok8KJNFEYcj2VakEHUtk
        - `./bootstrap.sh`
        - `./configure`
        - `./make`
        - `./make install`


## How to generate Thrift source
There are two options:
* From command line
    - `sudo thrift -r -out src/main/java --gen java src/main/resources/thrift/tutorial.thrift`
* Through maven:
    - `mvn clean generate-sources`

## About Thrift
* Interface Definition Language (IDL)
* Base and Special types
* Structs
    - Thrift structs are the equivalent of classes in OOP languages but without inheritance.
* Containers
    - list, set, map
* Exceptions
* Services

## Tutorial
https://www.baeldung.com/apache-thrift
