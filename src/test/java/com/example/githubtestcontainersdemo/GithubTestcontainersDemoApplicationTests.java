package com.example.githubtestcontainersdemo;

import org.junit.jupiter.api.Test;
import org.springframework.boot.test.context.SpringBootTest;
import org.testcontainers.containers.PostgreSQLContainer;

@SpringBootTest
class GithubTestcontainersDemoApplicationTests {

  @Test
  void contextLoads() {
    new PostgreSQLContainer<>("postgres:11").start();
  }

}
