package com.mvc.spring.Dao.Impl;


import java.util.ArrayList;
import java.util.List;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.query.Query;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;
import org.springframework.transaction.annotation.Transactional;
import com.mvc.spring.Dao.TicketDao;
import com.mvc.spring.model.Ticket;

@Repository
public class TicketDaoImpl implements TicketDao{
	//@inheritDoc
		    @Autowired
		    SessionFactory sessionFactory;
		    /**
		     * {@inheritDoc}
		     */
		    @SuppressWarnings("unchecked")
			@Override
		    @Transactional
		    public List<Ticket> saveTicketDetails(int BusScheduleId, int busId){
		    	List<Ticket> ticketList = new ArrayList<Ticket>();
		    	Session session = sessionFactory.getCurrentSession();
		   
		        Ticket ticket = new Ticket();
		        ticket.setBusId(busId);
		        ticket.setBusScheduleId(BusScheduleId);
		        session.save(ticket);
		        String hql="from Ticket where BusScheduleId= :BusScheduleId";
		        Query<Ticket> query = session.createQuery(hql);
		        query.setParameter("BusScheduleId", BusScheduleId);
		        System.out.println("from query");
		        ticketList = query.list();
		        return ticketList;
		    }
			
						
}

