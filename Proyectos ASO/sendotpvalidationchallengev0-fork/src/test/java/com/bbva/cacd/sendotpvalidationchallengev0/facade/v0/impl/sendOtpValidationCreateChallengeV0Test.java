package com.bbva.cacd.sendotpvalidationchallengev0.facade.v0.impl;

import com.bbva.cacd.sendotpvalidationchallengev0.DummyMock;
import com.bbva.cacd.sendotpvalidationchallengev0.business.v0.ISendOtpValidationCreateChallengeV0Business;
import com.bbva.cacd.sendotpvalidationchallengev0.business.v0.dto.BDtoInCreateChallengePost;
import com.bbva.cacd.sendotpvalidationchallengev0.business.v0.dto.BDtoOutCreateChallengePost;
import org.junit.*;
import org.mockito.*;
import org.junit.runner.RunWith;
import org.mockito.junit.MockitoJUnitRunner;
import org.springframework.beans.factory.annotation.Autowired;

@RunWith(MockitoJUnitRunner.class)
public class sendOtpValidationCreateChallengeV0Test {

    @InjectMocks
    private SrvSendOtpValidationAPIChallengeV0 srv;

    @Mock
    @Autowired
    private ISendOtpValidationCreateChallengeV0Business sendOtpValidationCreateChallengeV0;

    private DummyMock dummyMock;

    @Before
    public void init(){
        dummyMock = new DummyMock();
        MockitoAnnotations.initMocks(this);
    }

    @Test
    public void sendOtpValidationCreateChallengeV0(){
        //testear
        //Primero se debe hacer un Mockito.When de los métodos externos que se llamen en el método y simular con una data quemada
        //El argumento any() es para decirle al método que se ejecute con cualquier valor de ese tipo
        //el thenReturn() simula el valor que devería retornar el método
        Mockito.when(sendOtpValidationCreateChallengeV0.sendOtpValidationCreateChallengeV0(Mockito.any(BDtoInCreateChallengePost.class))).thenReturn(dummyMock.getBDtoOutCreateChallengePost());
        srv.sendOtpValidationCreateChallengeV0(dummyMock.getDtoInCreateChallengePost());
    }

}
