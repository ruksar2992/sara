package com.mvc.spring.service.Impl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.mvc.spring.Dao.TicketDao;
import com.mvc.spring.model.Ticket;
import com.mvc.spring.service.TicketService;

@Service
public class TicketServiceImpl implements TicketService{
    @Autowired
    TicketDao ticketDao;
    //{@inheritDoc}
    @Override
    public List<Ticket> saveTicketDetails(int scheduleId, int busId){
    	return ticketDao.saveTicketDetails(scheduleId, busId);
    }

	

}
 
