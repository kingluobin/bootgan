package com.agan.server;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import zipkin.server.EnableZipkinServer;
/**
 * @author 阿甘
 * @see http://study.163.com/provider/1016671292/index.htm
 * @version 1.0
 */
@SpringBootApplication
@EnableZipkinServer
public class ZipkinApplication {

	public static void main(String[] args) {
		SpringApplication.run(ZipkinApplication.class, args);
	}
}
