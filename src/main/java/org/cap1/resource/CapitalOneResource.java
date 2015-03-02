package org.cap1.resource;

import java.io.IOException;

import org.cap1.model.Transaction;
import org.cap1.model.TransactionHome;
import org.json.JSONArray;
import org.json.JSONObject;
import org.restlet.ext.json.JsonRepresentation;
import org.restlet.resource.Get;
import org.restlet.resource.ServerResource;

public class CapitalOneResource extends ServerResource {

    private TransactionHome transactionHome;

    public TransactionHome getTransactionHome() {
        return transactionHome;
    }

    public void setTransactionHome(TransactionHome transactionHome) {
        this.transactionHome = transactionHome;
    }
    
    @Get("json")
    public String getResource()  {
        
        JSONArray transactions = new JSONArray();
        
        for (Transaction transaction : transactionHome.getAllTransactions()) {
            transactions.put(new JSONObject(transaction));
        }
        
        try {
            return new JsonRepresentation(transactions).getText();    
        }
        catch (IOException ioe) {
            ioe.printStackTrace();
            return "error!";
        }
        
    }    
}
