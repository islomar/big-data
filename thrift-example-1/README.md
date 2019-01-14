# Thrift example 1
Example following https://www.baeldung.com/apache-thrift

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
Run `sudo thrift -r -out src/main/java/gen --gen java src/main/resources/thrift/service.thrift`

## About Thrift
* Interface Definition Language (IDL)
* Base and Special types
* Structs
    - Thrift structs are the equivalent of classes in OOP languages but without inheritance.
* Containers
    - list, set, map
* Exceptions
* Services
