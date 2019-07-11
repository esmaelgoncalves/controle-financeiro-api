/**
 *
 */
package com.egoncalves.controlefinanceiro.api.config;

import lombok.Data;
import org.springframework.boot.context.properties.ConfigurationProperties;

/**
 * @author Esmael
 *
 */
@Data
@ConfigurationProperties("controlefinanceiro")
public class ControleFinanceiroAPIProperty {
    private String originPermitida = "http://localhost:8000";

    private final Seguranca seguranca = new Seguranca();

    private final Mail mail = new Mail();

    @Data
    public static class Seguranca {

        private boolean enableHttps;

    }

    @Data
    public static class Mail {
        private String host;

        private Integer port;

        private String username;

        private String password;
    }
}
