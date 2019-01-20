# Big Data
* Playground for things related with the book "Big Data" of Manning
* https://www.manning.com/books/big-data
* Source code: https://www.manning.com/downloads/53
* https://freecontent.manning.com/data-storage-in-the-batch-layer-with-pail/

## Lambda Architecture

* Batch layer
    - Master dataset
    - batch view = funciton (all data)
    - Technology: Hadoop
* Speed layer
    - Realtime views
    - realtime view = funciton (realtime view, new data)
* Serving layer
    - Batch views
    - query = funciton (batch view, realtime view)
    - Technology: ElephantDB


* *Technologies
    * Batch computatinon systems: **Hadoop MapReduce**, **Hadoop Distributed File System (HDFS)**
    * Serialization frameworks: **Trhift**, Protocol Buffers, Avro
    * Random-access NoSQL databases: **Cassandra**, HBase, MongoDB, Voltemort, Riak, CouchDB
    * Messaging/queuing systems: **Kafka**
    * Realtime computation systems: **Storm** 


## Data model for Big Data
* **Fact-based model**
    - Data is raw
    - Data is immutable
    - Data is eternally true
* Thrift
    - https://thrift.apache.org/
    - https://thrift.apache.org/tutorial/java
    - https://media.readthedocs.org/pdf/thrift-tutorial/latest/thrift-tutorial.pdf
    - Thrift structs are the equivalent of classes in OOP languages but without inheritance. A struct has a set of strongly typed fields, each with a unique name as an identifier. Fields may have various annotations (numeric field IDs, optional default values, etc.).
    - Two different ways to generate the Java source code from the thrift file (see examples under thrift-example-1 and thrift-example-2):
        - Option 1: Run `mvn clean generate-sources` having configured the `libthrift` library in the pom.xml. It will be generated under target/generated-sources
        - Option 2: Manually generate the sources with the `thrift` command from a terminal, indicating the destination folder 

## Batch layer
* HDFS
    - Files are split into blocks that are spread among many nodes in the cluster
    - Blocks are replicated among many nodes so the data is still available even when machines go down
    - The namenode keeps strack of the blocks for each file and where those blocks are stored
* Hadoop local installation:
    - https://hortonworks.com/products/sandbox/
    - https://www.cloudera.com/developers/get-started-with-hadoop-tutorial.html
    - https://bitnami.com/stack/hadoop/virtual-machine
    - Docker:
        - https://hub.docker.com/r/cloudera/quickstart/
        - https://hub.docker.com/r/harisekhon/hadoop/
        - https://hadoop.apache.org/docs/r3.0.2/hadoop-yarn/hadoop-yarn-site/DockerContainers.html

## Speed layer
TBD


## Serving layer
TBD
