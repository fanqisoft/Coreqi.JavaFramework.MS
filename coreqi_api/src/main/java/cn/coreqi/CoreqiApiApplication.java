package cn.coreqi;

import org.mybatis.spring.annotation.MapperScan;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.scheduling.annotation.EnableScheduling;
import org.springframework.transaction.annotation.EnableTransactionManagement;

@SpringBootApplication(scanBasePackages = {"cn.coreqi.db", "cn.coreqi.core", "cn.coreqi.api"})
@MapperScan("cn.coreqi.db.dao")
@EnableTransactionManagement
@EnableScheduling
public class CoreqiApiApplication {

    public static void main(String[] args) {
        SpringApplication.run(CoreqiApiApplication.class, args);
    }

}
