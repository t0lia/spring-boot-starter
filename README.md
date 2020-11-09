# Spring Boot. Key features.

1. Dependency management
    1. BOM - bill of materials
    2. Release train. spring-boot parent vs spring-boot bom
1. Convention over configuration / Opionated defaults
    1. Web dev
        - jar instead war
        - defaults
1. IOC for dependencies
    1. Conditional annotation
        - @ConditionalOnProperty + @ConfigurationProperties + @EnableConfigurationProperties
        - @ConditionalOnBean
        - @ConditionalOnClass (no reflection, bytecode parsing before loading dependency, use string name instead classname)
        - @ConditionalOnMissingBean
        - @ConditionalOnMissingClass
        - @ConditionalOnWebApplication
        - Custom conditionals
    1. SpringBootApplication
        1. ComponentScan
        1. Configuration
        1. EnableAutoConfiguration => Spring factories
    1. AutoConfiguration log(beans count)
    1. Conflict resolution
        1. Bean name conflict
        1. @Primary
        1. check conditional annotations

https://github.com/t0lia/spring-boot-starter
https://start.spring.io/
https://docs.spring.io/spring-boot/docs/current/reference/htmlsingle/
https://docs.spring.io/spring-boot/docs/2.0.x/reference/html/howto-hotswapping.html
https://www.youtube.com/watch?v=yy43NOreJG4
https://www.youtube.com/watch?v=7Cq5zEm2wq0
