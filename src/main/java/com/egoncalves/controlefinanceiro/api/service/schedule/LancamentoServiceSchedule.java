package com.egoncalves.controlefinanceiro.api.service.schedule;

import org.springframework.scheduling.annotation.Scheduled;
import org.springframework.stereotype.Service;

@Service
public class LancamentoServiceSchedule {

    @Scheduled(cron = "0 0 6 * * *")
    public void avisarSobreLancamentosVencidos(){

    }
}
