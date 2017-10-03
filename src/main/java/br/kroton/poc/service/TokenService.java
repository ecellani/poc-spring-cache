package br.kroton.poc.service;

import br.kroton.poc.dto.Token;
import org.slf4j.Logger;
import org.springframework.cache.annotation.Cacheable;
import org.springframework.stereotype.Component;

import static org.slf4j.LoggerFactory.getLogger;

/**
 * @author erick.cellani
 */
@Component
public class TokenService {

    private static final Logger log = getLogger(TokenService.class);

    @Cacheable("token")
    public Token getToken() {
        try {
            Thread.sleep(3000L);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
        log.info("Token refreshed");
        return new Token("eyJhbGciOiJIUzI1NiJ9");
    }
}
