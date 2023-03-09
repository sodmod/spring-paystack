package com.badmus.paystack.services;

import com.badmus.paystack.paystackApis.core.Transactions;
import com.badmus.paystack.utils.InitializePayload;
import com.badmus.paystack.utils.VerifyPayload;
import lombok.NonNull;
import org.json.JSONObject;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class Services {
    @Autowired
    private Transactions transactions;

    public JSONObject initializePayment (@NonNull InitializePayload initializePayload){
       return transactions.initializeTransaction(initializePayload.getAmount(), initializePayload.getEmail());
    }

    public JSONObject verifyPayment (@NonNull VerifyPayload verifyPayload){
       return transactions.verifyTransaction(verifyPayload.getAccessToken());
    }
}
