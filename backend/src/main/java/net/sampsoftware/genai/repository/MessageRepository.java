package net.sampsoftware.genai.repository;

import net.sampsoftware.genai.model.Message;
import org.springframework.data.repository.reactive.ReactiveCrudRepository;
import reactor.core.publisher.Flux;

public interface MessageRepository extends ReactiveCrudRepository<Message, Long> {
    Flux<Message> findAllByOrderByTimestampDesc();
}
