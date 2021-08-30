package com.myapp.sbdrools.service;

import com.myapp.sbdrools.model.TicketOffer;
import org.kie.api.KieServices;
import org.kie.api.runtime.KieContainer;
import org.kie.api.runtime.KieSession;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class TicketService {


    private final KieContainer kieContainer = KieServices.Factory.get().getKieClasspathContainer();

    //This method loads the facts and the rules in the drools working memory and firing all the rules.
    public void getTicketOffer(TicketOffer ticketOffer) {
        //The session named rulesSession is defined in kmodule.xml
        KieSession kSession = kieContainer.newKieSession("rulesSession");
        kSession.insert(ticketOffer); //inserting ticketOffer
        kSession.fireAllRules(); //fire all the rules from rules folder
        kSession.dispose(); //dispose the session at the end
        //return ticketOffer;
    }
}
