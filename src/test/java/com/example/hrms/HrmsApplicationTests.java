package com.example.hrms;

import org.junit.jupiter.api.Test;
import org.mybatis.spring.annotation.MapperScan;
import org.springframework.boot.test.context.SpringBootTest;

@SpringBootTest
@MapperScan("com.example.hrms.dao")
class HrmsApplicationTests {

    @Test
    void contextLoads() {
    }

}
