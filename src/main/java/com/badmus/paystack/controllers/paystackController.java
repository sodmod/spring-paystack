package com.badmus.paystack.controllers;

import com.badmus.paystack.services.Services;
import com.badmus.paystack.utils.InitializePayload;
import com.badmus.paystack.utils.VerifyPayload;
import org.json.JSONObject;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

@CrossOrigin(origins = "*", maxAge = 3600)
@RestController
@RequestMapping("api/transaction")
public class paystackController {

    @Autowired
    private Services services;

    JSONObject jsonObject;

    @PostMapping(value = "initialize")
    public String initializeTransaction (@RequestBody InitializePayload initializePayload){
        jsonObject = services.initializePayment(initializePayload);
        System.out.println(initializePayload);
        System.out.println(jsonObject);
        return jsonObject.toString();
    }

    @PostMapping(value = "verify")
    public String verifyTransaction (@RequestBody VerifyPayload verifyPayload){
        jsonObject = services.verifyPayment(verifyPayload);
        System.out.println(jsonObject);
        return jsonObject.toString();
    }
}
