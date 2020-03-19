#基于Java的注解配置
###把数据源和JavaTemplate的配置由xml移到Java配置类
```
   @Configuration
   @ComponentScan("com.soft1851.spring.ioc")
   public class JDBCConfig {
       /**
        * 数据连接池地址配置
        * @return druidDataSource
        */
       @Bean
       public DruidDataSource druidDataSource(){
           DruidDataSource druidDataSource = new  DruidDataSource();
           druidDataSource.setDriverClassName("com.mysql.jdbc.Driver");
           druidDataSource.setUrl("jdbc:mysql://localhost:3306/db_bbs?useUnicode=true&characterEncoding=utf8&useSSL=false&autoReconnect=true");
           druidDataSource.setUsername("root");
           druidDataSource.setPassword("root");
           return druidDataSource;
       }
       @Bean
       public JdbcTemplate jdbcTemplate(DruidDataSource druidDataSource){
           return new   JdbcTemplate(druidDataSource);
       }
       @Bean
       public ForumDao forumDao(JdbcTemplate jdbcTemplate) {
           return new ForumDaoImpl(jdbcTemplate);
       }
   }```

