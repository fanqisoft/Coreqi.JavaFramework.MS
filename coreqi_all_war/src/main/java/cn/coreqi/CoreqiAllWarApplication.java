package cn.coreqi;

import org.mybatis.spring.annotation.MapperScan;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.builder.SpringApplicationBuilder;
import org.springframework.boot.web.servlet.support.SpringBootServletInitializer;
import org.springframework.scheduling.annotation.EnableScheduling;
import org.springframework.transaction.annotation.EnableTransactionManagement;

@SpringBootApplication(scanBasePackages = {"cn.coreqi"})
@MapperScan("cn.coreqi.db.dao")
@EnableTransactionManagement
@EnableScheduling
public class CoreqiAllWarApplication extends SpringBootServletInitializer {

    public static void main(String[] args) {
        SpringApplication.run(CoreqiAllWarApplication.class, args);
    }

    @Override
    protected SpringApplicationBuilder configure(SpringApplicationBuilder application) {
        return application.sources(CoreqiAllWarApplication.class);
    }

}
