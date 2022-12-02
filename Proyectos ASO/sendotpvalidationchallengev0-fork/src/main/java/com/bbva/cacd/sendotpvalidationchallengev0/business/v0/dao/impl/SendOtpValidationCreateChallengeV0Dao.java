package com.bbva.cacd.sendotpvalidationchallengev0.business.v0.dao.impl;

import com.bbva.cacd.sendotpvalidationchallengev0.business.v0.dao.ISendOtpValidationCreateChallengeV0Dao;
import com.bbva.cacd.sendotpvalidationchallengev0.business.v0.dao.model.cceetl01_1.RequestTransactionCceetl01_1;
import com.bbva.cacd.sendotpvalidationchallengev0.business.v0.dao.model.cceetl01_1.ResponseTransactionCceetl01_1;
import com.bbva.cacd.sendotpvalidationchallengev0.business.v0.dao.tx.mapper.SendOtpValidationCreateChallengeV0DaoMapper;
import com.bbva.cacd.sendotpvalidationchallengev0.business.v0.dto.BDtoInCreateChallengePost;
import com.bbva.cacd.sendotpvalidationchallengev0.business.v0.dto.BDtoOutCreateChallengePost;
import com.bbva.cacd.sendotpvalidationchallengev0.business.v0.impl.SendOtpValidationCreateChallengeV0Business;
import com.bbva.jee.arq.spring.core.host.ServicioTransacciones;
import org.mapstruct.factory.Mappers;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;
import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;

@Component
public class SendOtpValidationCreateChallengeV0Dao implements ISendOtpValidationCreateChallengeV0Dao {

    private static final Log Log = LogFactory.getLog(SendOtpValidationCreateChallengeV0Business.class);

    @Autowired
    private ServicioTransacciones transactionService;

    @Autowired
    private SendOtpValidationCreateChallengeV0DaoMapper mapper;

    @Override
    public BDtoOutCreateChallengePost invokeRestlessApxTransaction(BDtoInCreateChallengePost bDtoInCreateChallengePost) {
        //poner lógica de conexión a APX aqui, poner logs y mapear los datos al formato de APX
        Log.info(String.format("Data DAO: ", bDtoInCreateChallengePost));
        RequestTransactionCceetl01_1 apx = mapper.getRequestTx(bDtoInCreateChallengePost); //Obtengo el objeto que APX necesita
        ResponseTransactionCceetl01_1 result = transactionService.invocar(RequestTransactionCceetl01_1.class, ResponseTransactionCceetl01_1.class, apx); //Envío la data a APX

        BDtoOutCreateChallengePost bDtoOutCreateChallengePost = mapper.getResponse(result); //Comvertir la data al formato indicado
        Log.info(String.format("Result: ", bDtoOutCreateChallengePost));
        return bDtoOutCreateChallengePost;
    }

}
