package com.myapp.sbdrools.controller;

import com.myapp.sbdrools.model.TicketOffer;
import com.myapp.sbdrools.service.TicketService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class TicketController {
    private final TicketService ticketService;

    @Autowired
    public TicketController(TicketService ticketService) {this.ticketService = ticketService;}

    @RequestMapping(value = "/getDiscount",method = RequestMethod.GET)
    public TicketOffer getValue(@RequestParam(required = true) int age) {
        TicketOffer ticketOffer = new TicketOffer();
        ticketOffer.setAge(age);
        ticketService.getTicketOffer(ticketOffer);
        return ticketOffer;
    }
}
