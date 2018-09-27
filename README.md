# 基于 Spring Cloud 的微服务架构

本项目是一个基于 Spring Boot、Spring Cloud、Spring Oauth2 和 Spring Cloud Netflix 等框架构建的微服务项目。

# 技术栈
* Spring boot - 微服务的入门级微框架，用来简化 Spring 应用的初始搭建以及开发过程。
* Eureka - 云端服务发现，一个基于 REST 的服务，用于定位服务，以实现云端中间层服务发现和故障转移。
* Consul - Consul 是 HashiCorp 公司推出的开源工具，用于实现分布式系统的服务发现与配置
* Spring Cloud Config - 配置管理工具包，让你可以把配置放到远程服务器，集中化管理集群配置，目前支持本地存储、Git 以及 Subversion。
* Hystrix - 熔断器，容错管理工具，旨在通过熔断机制控制服务和第三方库的节点,从而对延迟和故障提供更强大的容错能力。
* Zuul - Zuul 是在云平台上提供动态路由，监控，弹性，安全等边缘服务的框架。Zuul 相当于是设备和 Netflix 流应用的 Web 网站后端所有请求的前门。
* Spring Cloud Sleuth - 日志收集工具包，封装了 Dapper 和 log-based 追踪以及 Zipkin 和 HTrace 操作，为 SpringCloud 应用实现了一种分布式追踪解决方案。
* Ribbon - 提供云端负载均衡，有多种负载均衡策略可供选择，可配合服务发现和断路器使用。
* Turbine - Turbine 是聚合服务器发送事件流数据的一个工具，用来监控集群下 hystrix 的 metrics 情况。
* Spring Cloud Stream - Spring 数据流操作开发包，封装了与 Redis、Rabbit、Kafka 等发送接收消息。
* Feign - Feign 是一种声明式、模板化的 HTTP 客户端。

# 应用架构

该项目包含 8 个服务

* registry - eureka服务注册与发现
* config - 外部配置
* zuul - 代理所有微服务的接口网关
* service-hello - 业务服务hello
* service-hi - 业务服务hi
* ribbon - ribbon服务调用
* fegin - fegin服务调用
* consul - consul服务注册与发现
* feginconsul  -fegin的consul服务调用
* turbine - turbine聚合面板监控


# 启动项目

* 使用 Docker 快速启动
    1. 配置 Docker 环境
    2. `mvn clean package` 打包项目及 Docker 镜像
    3. 在项目根目录下执行 `docker-compose up -d` 启动所有项目
* 本地手动启动
   
    1. 启动 registry、config
    2. 启动 service-hello、service-hi


## 注册中心
访问 http://localhost:8761/ 默认账号 user，密码 password
