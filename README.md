# kafka-demo
> A kafka demo.

**说明：**

- 启动`Zookeeper`及`Kafka`：

  ```shell
  zookeeper-server-start /usr/local/etc/kafka/zookeeper.properties & kafka-server-start /usr/local/etc/kafka/server.properties
  ```

  也可以分别启动`Zookeeper`及`Kafka`，因为`Kafka`依赖于`Zookeeper`，故先启动`Zookeeper`。

- 启动中遇到的问题：

  ```txt
  Unable to start kafka with zookeeper (kafka.common.InconsistentClusterIdException)
  ```

  解决：

  - 删除Zookeeper及Kafka生成的所有文件，我这边的路径是：`/usr/local/var/lib/kafka-logs`及`/usr/local/var/lib/zookeeper`。再启动即可。

- 创建名为test的topic

  ```shell
  kafka-topics --create --zookeeper localhost:2181 --replication-factor 1 --partitions 1 --topic test
  ```

- 测试接口

  在SpringBoot启动后，在浏览器访问`http://127.0.0.1:8080/kafka/send`，即可在控制台看到消息输出。