package com.bbva.cacd.sendotpvalidationchallengev0.business.v0.impl;

import com.bbva.cacd.sendotpvalidationchallengev0.business.v0.ISendOtpValidationCreateChallengeV0Business;
import com.bbva.cacd.sendotpvalidationchallengev0.business.v0.dao.impl.SendOtpValidationCreateChallengeV0Dao;
import com.bbva.cacd.sendotpvalidationchallengev0.business.v0.dto.BDtoInCreateChallengePost;
import com.bbva.cacd.sendotpvalidationchallengev0.business.v0.dto.BDtoOutCreateChallengePost;
import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

@Component
public class SendOtpValidationCreateChallengeV0Business implements ISendOtpValidationCreateChallengeV0Business {

  private static final Log Log = LogFactory.getLog(SendOtpValidationCreateChallengeV0Business.class);

  @Autowired
  private SendOtpValidationCreateChallengeV0Dao dao; //Instancia el DAO

  @Override
  public BDtoOutCreateChallengePost sendOtpValidationCreateChallengeV0(final BDtoInCreateChallengePost createChallengePost) {
    //llamar aqui a la capa DAO poner LOGS

    Log.info(String.format("Input facade: ", createChallengePost));
    BDtoOutCreateChallengePost out = dao.invokeRestlessApxTransaction(createChallengePost); //Envía la data al Dao
    Log.info(String.format("Output Business: ", out));

    return out;
  }
}
