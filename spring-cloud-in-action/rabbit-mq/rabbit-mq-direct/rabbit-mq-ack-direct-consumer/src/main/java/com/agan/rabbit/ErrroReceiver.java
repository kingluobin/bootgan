package com.agan.rabbit;

import org.springframework.amqp.core.ExchangeTypes;
import org.springframework.amqp.rabbit.annotation.Exchange;
import org.springframework.amqp.rabbit.annotation.Queue;
import org.springframework.amqp.rabbit.annotation.QueueBinding;
import org.springframework.amqp.rabbit.annotation.RabbitHandler;
import org.springframework.amqp.rabbit.annotation.RabbitListener;
import org.springframework.stereotype.Component;
/**
 * @author 阿甘
 * @see http://study.163.com/instructor/1016671292.htm
 * @version 1.0
 */
@Component
@RabbitListener(bindings=@QueueBinding(
		value= @Queue(value="${mq.config.queue.error}",autoDelete="true"),
		exchange=@Exchange(value="${mq.config.exchange}",type=ExchangeTypes.DIRECT),
		key="${mq.config.queue.error.routing.key}"
		)
		)
public class ErrroReceiver {
	
	@RabbitHandler
	public void process(String msg){
		System.out.println("接收到ERROR日志:"+msg);
		throw new RuntimeException();
	}
}
