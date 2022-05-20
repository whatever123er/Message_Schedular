package com.bhattacharya.processors;

import com.bhattacharya.requests.PostFormURLEncoded;
import com.bhattacharya.responses.Response;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class MessageProcessor {

    @Autowired
    ValidatorProcess validator;

    public Response msgProcessor(PostFormURLEncoded message){
        System.out.println(message);
        validator.isMsgValidate(message);
        return null;
    }
}