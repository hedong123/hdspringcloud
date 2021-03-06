package com.honghu.cloud;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.EnableEurekaClient;
import org.springframework.cloud.stream.annotation.EnableBinding;
import org.springframework.cloud.stream.annotation.StreamListener;

import com.honghu.cloud.consumer.ConsumerService;

@EnableEurekaClient
@SpringBootApplication
@EnableBinding(ConsumerService.class) //可以绑定多个接口
public class ConsumerApplication {
	
	public static void main(String[] args) {
		SpringApplication.run(ConsumerApplication.class, args);
	}
	
	@StreamListener("HonghuInput")
	public void onMessage(byte[] msg) {
		System.out.println("消费者3，接收到的消息：" + new String(msg));
	}
}
