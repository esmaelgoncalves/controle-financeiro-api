package com.egoncalves.controlefinanceiro.api.service.schedule;

import com.egoncalves.controlefinanceiro.api.model.Lancamento;
import com.egoncalves.controlefinanceiro.api.model.Usuario;
import com.egoncalves.controlefinanceiro.api.repository.LancamentoRepository;
import com.egoncalves.controlefinanceiro.api.repository.UsuarioRepository;
import com.egoncalves.controlefinanceiro.api.service.mail.MailerService;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.scheduling.annotation.Scheduled;
import org.springframework.stereotype.Service;

import java.time.LocalDate;
import java.util.List;

@Slf4j
@Service
public class LancamentoServiceSchedule {

    private static final String PERMISSAO_USUARIO = "ROLE_PESQUISAR_LANCAMENTOS";

    @Autowired
    private LancamentoRepository lancamentoRepository;
    @Autowired
    private UsuarioRepository usuarioRepository;

    @Autowired
    private MailerService mailer;

    @Scheduled(cron = "0 0 6 * * *")
    public void avisarSobreLancamentosVencidos(){
        if (log.isDebugEnabled()) {
            log.debug("Preparando envio de e-mails para lançamentos vencidos.");
        }
        List<Lancamento> lancamentos =
                lancamentoRepository.findByDataVencimentoIsLessThanEqualAndDataPagamentoIsNull(LocalDate.now());

        if (lancamentos.isEmpty()) {
            log.info("Sem lançamentos vencidos para aviso.");
            return;
        }

        log.info("Exitem {} lançamentos vencidos.", lancamentos.size());

        List<Usuario> usuarios = usuarioRepository.findByPermissoesDescricao(PERMISSAO_USUARIO);

        if (usuarios.isEmpty()) {
            log.warn("Existem lançamentos vencidos, mas o sistema não encontrou destinatários.");
            return;
        }

        mailer.avisarSobreLancamentosVencidos(lancamentos, usuarios);

        log.info("Envio de e-mail de aviso concluído.");
    }
}
