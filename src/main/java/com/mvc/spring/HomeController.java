package com.mvc.spring;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.ModelAttribute;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;

import com.mvc.spring.dto.Credentials;
import com.mvc.spring.model.Bus;
import com.mvc.spring.model.BusSchedule;
import com.mvc.spring.model.Ticket;
import com.mvc.spring.model.User;
import com.mvc.spring.service.BusScheduleService;
import com.mvc.spring.service.BusService;

import com.mvc.spring.service.UserService;
import com.mvc.spring.service.Impl.TicketServiceImpl;
//Handles requests for the application home page
@Controller
public class HomeController {
	@Autowired
	UserService userService;
	@Autowired
	BusService busService;
	@Autowired
	BusScheduleService busScheduleService;
	private TicketServiceImpl ticketService;
	//@param user
	 // @param model
	 // @return
	@RequestMapping(value = "/", method = RequestMethod.GET)
	public String home() {
		return "login";
	}
	//@param model
	 //@param login
	 //@param session
	 //@return
	@RequestMapping(value = "/login", method = RequestMethod.POST)
	public String authenticate(@ModelAttribute("creden") Credentials credentials, Model model) {
		boolean isExists = userService.authenticateUser(credentials.getUsername(), credentials.getPassword());
		if (isExists) {
			return "viewdetails";
		}
		return "loginfail";
	}
	//@param model
	 //@return
	@RequestMapping(value = "/register")
	public String homeTo() {
		return "register";

	}
		//@param login
		
		 //@return
	@RequestMapping(value = "/add", method = RequestMethod.POST)
	public String saveUser(@ModelAttribute("user") User user) {
		userService.saveUser(user);
		return "login";
	}

	
	//@param model
	 //@param source
	 //@param destination
	
	 //@param session
	 //@return
	@RequestMapping(value = "/details", method = RequestMethod.POST)
    public String Searching(@RequestParam("source") String i, @RequestParam("destination") String j,
            @RequestParam("depatureDate") String k, Model model) {
        System.out.println(k);
        List<Bus> rList = busService.getBus(i,j,k);
        System.out.println(rList);
        if (rList!=null) {
           model.addAttribute("rList", rList);
            return "busdetails";
        }
        return "invalid";
    }

	//@param model
	 //@param busid
	 // @return
	@RequestMapping(value = "/busList")
	public String carList(Model model, @RequestParam int busid, @RequestParam String busno) {
		try {
			Bus bus = busService.busDetail(busid);
			model.addAttribute("bus", bus);
			List<BusSchedule> busSchedule = busScheduleService.busScheduleDetail(busno);
			model.addAttribute("busSchdule", busSchedule);
			System.out.println(busSchedule);
			return "busScheduledetails";
		} catch (Exception e) {
			System.out.println(e);
			return "invalid";
		}

	}

	
	//@param model
	//@param busScheduleid
		 //@param busid
		 // @return
	@RequestMapping(value = "/tickedList")
	public String ticketList(Model model, @RequestParam int busScheduleid, @RequestParam int BusId, @RequestParam String source,
			@RequestParam String destination) {
		try {
			
			List<Ticket> ticketdetails = ticketService.saveTicketDetails(busScheduleid, BusId);
			model.addAttribute("ticketdetails", ticketdetails);
			model.addAttribute("source", source);
			model.addAttribute("destination", destination);
			System.out.println("hello");
			return "ticketdetails";
		} catch (Exception e) {
			System.out.println(e);
			return "invalid";
		}

	}
}
