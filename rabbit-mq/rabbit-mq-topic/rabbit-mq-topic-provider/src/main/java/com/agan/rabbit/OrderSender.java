package com.agan.rabbit;

import java.util.Date;

import org.springframework.amqp.core.AmqpTemplate;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Component;
/**
 * @author 阿甘
 * @see http://study.163.com/provider/1016671292/index.htm
 * @version 1.0
 */
@Component
public class OrderSender {
	
	@Autowired
	private AmqpTemplate rabbitTemplate;
	
	@Value("${mq.config.exchange}")
	private String exchange;
	
	public void send() throws InterruptedException{
		this.rabbitTemplate.convertAndSend(this.exchange,"order.log.debug", "order.log.debug.......");
		this.rabbitTemplate.convertAndSend(this.exchange,"order.log.info", "order.log.info.......");
		this.rabbitTemplate.convertAndSend(this.exchange,"order.log.warn", "order.log.warn.......");
		this.rabbitTemplate.convertAndSend(this.exchange,"order.log.error", "order.log.error.......");
	}
}
