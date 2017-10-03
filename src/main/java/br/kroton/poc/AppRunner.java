package br.kroton.poc;

import br.kroton.poc.service.TokenService;
import org.slf4j.Logger;
import org.springframework.boot.CommandLineRunner;
import org.springframework.stereotype.Component;

import static org.slf4j.LoggerFactory.getLogger;

/**
 * @author erick.cellani
 */
@Component
public class AppRunner implements CommandLineRunner {

    private static final Logger log = getLogger(AppRunner.class);

    private final TokenService tokenService;

    public AppRunner(TokenService tokenService) {
        this.tokenService = tokenService;
    }

    @Override
    public void run(String... args) throws Exception {
        log.info("...starting");
        log.info("Request token: {}", tokenService.getToken());
        log.info("Request token: {}", tokenService.getToken());
        log.info("Request token: {}", tokenService.getToken());

        try {
            log.info("...sleeping");
            Thread.sleep(2000L);
            log.info("waking up...");
        } catch (InterruptedException e) {
            e.printStackTrace();
        }

        log.info("Request token: {}", tokenService.getToken());
        log.info("Request token: {}", tokenService.getToken());
        log.info("Request token: {}", tokenService.getToken());
        log.info("Done!");
    }
}
