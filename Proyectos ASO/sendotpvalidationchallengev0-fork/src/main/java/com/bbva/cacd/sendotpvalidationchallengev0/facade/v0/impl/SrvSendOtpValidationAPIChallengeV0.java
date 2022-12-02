package com.bbva.cacd.sendotpvalidationchallengev0.facade.v0.impl;

import com.bbva.cacd.sendotpvalidationchallengev0.business.v0.ISendOtpValidationCreateChallengeV0Business;
import com.bbva.cacd.sendotpvalidationchallengev0.business.v0.dto.BDtoInCreateChallengePost;
import com.bbva.cacd.sendotpvalidationchallengev0.business.v0.dto.BDtoOutCreateChallengePost;
import com.bbva.cacd.sendotpvalidationchallengev0.business.v0.impl.SendOtpValidationCreateChallengeV0Business;
import com.bbva.cacd.sendotpvalidationchallengev0.facade.v0.ISrvSendOtpValidationAPIChallengeV0;
import com.bbva.cacd.sendotpvalidationchallengev0.facade.v0.dto.DtoInCreateChallengePost;
import com.bbva.cacd.sendotpvalidationchallengev0.facade.v0.dto.DtoOutCreateChallengePost;
import com.bbva.cacd.sendotpvalidationchallengev0.facade.v0.mapper.CreateChallengePostMapper;
import com.bbva.jee.arq.spring.core.catalog.gabi.ServiceResponse;
import com.bbva.jee.arq.spring.core.catalog.gabi.ServiceResponse.ServiceResponseBuilder;
import com.bbva.jee.arq.spring.core.catalog.gabi.ServiceResponseOK;
import com.bbva.jee.arq.spring.core.servicing.annotations.SMC;
import com.bbva.jee.arq.spring.core.servicing.annotations.SN;
import com.bbva.jee.arq.spring.core.servicing.annotations.VN;
import javax.ws.rs.Consumes;
import javax.ws.rs.POST;
import javax.ws.rs.Path;
import javax.ws.rs.Produces;
import javax.ws.rs.core.MediaType;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;
import org.mapstruct.factory.Mappers;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
@SN(registryID = "SNGG20220140", logicalID = "send-otp-validation")
@VN(vnn = "v0")
@Path("/v0")
@Produces(MediaType.APPLICATION_JSON)
@Consumes(MediaType.APPLICATION_JSON)
public class SrvSendOtpValidationAPIChallengeV0 implements ISrvSendOtpValidationAPIChallengeV0 {

  private static final Log Log = LogFactory.getLog(SendOtpValidationCreateChallengeV0Business.class);

  @Autowired private ISendOtpValidationCreateChallengeV0Business sendOtpValidationCreateChallengeV0;

  @Override
  @POST
  @Path("/challenge")
  @SMC(registryID = "SMGG20221607", logicalID = "sendOtpValidationCreateChallengeV0", forcedCatalog = "gabiCatalog") // 0.1.0
  @Produces({MediaType.APPLICATION_JSON})
  @Consumes({MediaType.APPLICATION_JSON})
  public ServiceResponse<DtoOutCreateChallengePost> sendOtpValidationCreateChallengeV0(DtoInCreateChallengePost createChallengePost) {
    //crear logica, conectar a business y recibir información, todo con su respectivo mapeo

    Log.info(String.format("Input Facade: ", createChallengePost));
    CreateChallengePostMapper mapper = Mappers.getMapper(CreateChallengePostMapper.class);
    BDtoInCreateChallengePost request = mapper.dtoInCreateChallengePostToBDtoInCreateChallengePost(createChallengePost); //Devuelve un DTO de la capa Business

    final BDtoOutCreateChallengePost response = sendOtpValidationCreateChallengeV0.sendOtpValidationCreateChallengeV0(request); //Se envía la data a la capa Business

    Log.info(String.format("Output Business ", response));
    DtoOutCreateChallengePost responseFinal = mapper.bDtoOutCreateChallengePostToDtoOutCreateChallengePost(response); //Devuelve un DTo con el formato correcto
    Log.info(String.format("Output Facade: ", responseFinal));

    ServiceResponseBuilder<DtoOutCreateChallengePost> builder = ServiceResponseOK.data(responseFinal);
    return builder.build();
  }
}
