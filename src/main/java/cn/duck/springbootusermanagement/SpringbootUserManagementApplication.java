package cn.duck.springbootusermanagement;

import org.mybatis.spring.annotation.MapperScan;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
@MapperScan("cn.duck.springbootusermanagement.mapper")
public class SpringbootUserManagementApplication {

    public static void main(String[] args) {
        SpringApplication.run(SpringbootUserManagementApplication.class, args);
    }

}
