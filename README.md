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

## Batch layer
TBD


## Speed layer
TBD


## Serving layer
TBD
