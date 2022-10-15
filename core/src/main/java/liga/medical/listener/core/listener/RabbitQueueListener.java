package liga.medical.listener.core.listener;

import liga.medical.listener.core.model.QueueNames;
import lombok.extern.slf4j.Slf4j;
import org.springframework.amqp.rabbit.annotation.RabbitListener;
import org.springframework.stereotype.Component;

@Slf4j
@Component
public class RabbitQueueListener {

    @RabbitListener(queues = QueueNames.DAILY_QUEUE_NAME)
    public void dailyListener(String message) {
        log.info("Получено сообщение "+ message + "из очереди " + QueueNames.DAILY_QUEUE_NAME);
    }

    @RabbitListener(queues = QueueNames.ERROR_QUEUE_NAME)
    public void alertListener(String message) {
        log.info("Получено сообщение "+ message + "из очереди " + QueueNames.ERROR_QUEUE_NAME);
    }

    @RabbitListener(queues = QueueNames.ALERT_QUEUE_NAME)
    public void errorListener(String message) {
        log.info("Получено сообщение "+ message + "из очереди " + QueueNames.ALERT_QUEUE_NAME);
    }
}
