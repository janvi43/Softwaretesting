package com.Softwaretesting.Controller;
import java.sql.Date;
import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.ControllerAdvice;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.servlet.ModelAndView;
import com.Softwaretesting.Dao.modelImpl;
import com.Softwaretesting.Dao.modelImplcustomer;
import com.Softwaretesting.Dao.modelImpllab;
import com.Softwaretesting.Dao.modelImplsample;
import com.Softwaretesting.Dao.modelImpltestdetails;
import com.Softwaretesting.Dao.modelImplticketdetails;
import com.Softwaretesting.Dao.modelImplticketheader;
import com.Softwaretesting.Entity.Customer_verf;
import com.Softwaretesting.Entity.Sample_test;
import com.Softwaretesting.Entity.lab_test;
import com.Softwaretesting.Entity.table;
import com.Softwaretesting.Entity.testdetails;
import com.Softwaretesting.Entity.ticketdetails;
import com.Softwaretesting.Entity.ticketheader;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpSession;
@RequestMapping({"/","index","/header","/ContactUS","/signform","/loginPage","/NewCustomer",
	"/Customer_verf","/NewTicket","/Ticketheader","/NewDetails","/ticketdetails","/NewSample"
	,"/Sample_test","/Newlab","/Lab_ver","/newtest","/test_details","/Report","/logout","/About"})


@Controller
@ControllerAdvice
@RestController
public class testing {
	@Autowired
	modelImpl Adi;
	public modelImpl getAdi() {
		return Adi;
		
	    
		}
	@Autowired
	modelImplcustomer tester;
	public modelImplcustomer gettester() {
		return tester;
		
	}
	@Autowired
	
	modelImplticketheader header;
	public modelImplticketheader getheader() {
		return header;
	}
	@Autowired
	modelImplticketdetails details;
	public modelImplticketdetails getdetails() {
		return details;
	}
	@Autowired
	modelImplsample barcode;
	public modelImplsample getbarcode() {
		return barcode;
	}
	@Autowired
	modelImpllab labtest;
	public modelImpllab gettest() {
		return labtest;
	}
	@Autowired
	modelImpltestdetails testdetail;
	public modelImpltestdetails gettestdetail() {
		return testdetail;
	}
	
	@RequestMapping(value = "header", method = RequestMethod.GET)
    public ModelAndView showheaderPage() {
        System.out.println("Home");
        ModelAndView mav=new ModelAndView("index");
		mav.addObject("title", "Home");
        mav.addObject("userClickHome", true);
       return new ModelAndView("header");
 
	}

@RequestMapping(value = "ContactUS", method = RequestMethod.GET)
public ModelAndView getContactUsPage()
{

	
	ModelAndView mav=new ModelAndView("index");
	mav.addObject("title", "Contact Us");
    mav.addObject("userClickContact", true);
	return new ModelAndView("ContactUS");
}
@RequestMapping (value="signform",method=RequestMethod.GET)
public ModelAndView insign() {
	ModelAndView mav= new ModelAndView("index");
	mav.addObject("title","Register");
	mav.addObject("userclicksignform",true);
	return mav ;
	
}

@RequestMapping(value = "signIN")
public ModelAndView getsignform(@ModelAttribute("softtesting")table as, BindingResult result)
{
	if(result.hasErrors()) {
		return new ModelAndView("signform");
	}
	else {
		Adi.saveAlien(as);	}
	ModelAndView mav=new ModelAndView("Success");
	mav.addObject("email",as.getAlienId());
	return mav;
}
@RequestMapping(value="new")
public ModelAndView getnew(@ModelAttribute("testings")Customer_verf as,BindingResult result) {
	if(result.hasErrors()) {
		return new ModelAndView("NewCustomer");
	}	
	
	else {
		tester.saveAlien1(as);
		}
	ModelAndView mav=new ModelAndView("NewCustomerSuccess");
	mav.addObject("",as.getID());
	return mav;
	
	}
@RequestMapping(value="NewTicket" , method=RequestMethod.GET)
public ModelAndView getnewticket() {
	ModelAndView mav= new ModelAndView("index");
	mav.addObject("title","New Ticket");
	mav.addObject("userclickNewTicket",true);
	return new ModelAndView("NewTicket");
	
}
@RequestMapping(value="newtick")
public ModelAndView getticket(@ModelAttribute("ticketing")ticketheader as ,BindingResult result) {
	if(result.hasErrors()) {
		return new ModelAndView("NewTicket");
	}else {
		header.saveAlien2(as);
	}
	ModelAndView mav=new ModelAndView("NewTicketSuccess");
	mav.addObject("",as.getTicket_NO()); 
	return mav;
	
}
@RequestMapping(value="newdetails")
public ModelAndView getticket(@ModelAttribute("tenting")ticketdetails as ,BindingResult result) {
	if(result.hasErrors()) {
		return new ModelAndView("NewDetails");
	}else {
		details.saveAlien2(as);
	}
	ModelAndView mav=new ModelAndView("NewdetailsSuccess");
	mav.addObject("",as.getticketNO()); 
	return mav;
	
}
@RequestMapping(value="sampletest")
public ModelAndView gettset(@ModelAttribute("softtesting")Sample_test as ,BindingResult result) {
	if(result.hasErrors()) {
		return new ModelAndView("NewSample");
	}else {
		barcode.saveAlien3(as);
	}
	ModelAndView mav=new ModelAndView("NewSampleSuccess");
	mav.addObject("",as.getTICKET_NO()); 
	return mav;
	
	
}
@RequestMapping(value="labtest")
public ModelAndView gettest(@ModelAttribute("labtesting")lab_test as ,BindingResult result) {
	if(result.hasErrors()) {
		return new ModelAndView("Newlab");
	}else {
		labtest.saveAlien5(as);
	}
	ModelAndView mav=new ModelAndView("NewlabSuccess");
	mav.addObject("",as.getTICKET_NO()); 
	return mav;
	
}

@RequestMapping(value="Newtest")
public ModelAndView gettestdetail(@ModelAttribute("testdetai")testdetails as ,BindingResult result) {
	if(result.hasErrors()) {
		return new ModelAndView("newtest");
	}else {
		testdetail.saveAlien6(as);
	}
	ModelAndView mav=new ModelAndView("NewtestSuccess");
	mav.addObject("",as.getTICKET_NO()); 
	return mav;
	
}

@RequestMapping(value="loginPage", method=RequestMethod.GET)
public ModelAndView login() {
	ModelAndView mav=new ModelAndView("index");
	mav.addObject("title","Login");
	mav.addObject("userClickloginPage",true);
	return new ModelAndView ("loginPage");
	
}


@RequestMapping(value="Login",method=RequestMethod.POST)
public ModelAndView successlog(table as ,BindingResult result) {
		String invalid="Plz enter valid Credential";
	table userExists = Adi.checkLogin(as.getEmail(),as.getPwd());	
			
			if(userExists!= null){
				ModelAndView mav=new ModelAndView("loginSuccess", "all",userExists);
				return mav;

			}else{
				ModelAndView mav2=new ModelAndView("loginPage");
				mav2.addObject("inValidMsg",invalid);
				mav2.addObject("inValidMsg","	 <center> <div id=\"danger\" class=\"alert alert-danger\">\r\n" + 
						"    <strong>Invalid Plz Enter Valid Login Credential</strong></div></center>");
				return mav2;
			}
			
		}
@RequestMapping (value="NewCustomer",method=RequestMethod.GET)
		public ModelAndView custn() {
			ModelAndView mav= new ModelAndView("index");
			mav.addObject("title","New Customer");
			mav.addObject("userclickNewCustomer",true);
			return new ModelAndView("NewCustomer") ;
			
		}
@RequestMapping (value="NewDetails",method=RequestMethod.GET)
public ModelAndView dat() {
	ModelAndView mav= new ModelAndView("index");
	mav.addObject("title","New Details");
	mav.addObject("userclickNewDetails",true);
	return new ModelAndView("NewDetails") ;
	
}



@RequestMapping(value="customer",method=RequestMethod.POST)
public ModelAndView successcustomer(Customer_verf as ,BindingResult result) {
		String invalid="Plz enter valid Credential";
	Customer_verf userExists = tester.checkCustomer(as.getID(),as.getName(),as.getAddress(),as.getStateID(),as.getState());	
			
			if(userExists!= null){
				ModelAndView mav=new ModelAndView("customersucess", "all",userExists);
				return mav;
			}else{
				ModelAndView mav2=new ModelAndView("Customer_verf");
				mav2.addObject("inValidMsg",invalid);
				mav2.addObject("inValidMsg","	 <center> <div id=\"danger\" class=\"alert alert-danger\">\r\n" + 
						"    <strong>Invalid Plz Enter Valid Customer </strong></div></center>");
				return mav2;
			}
}
			@RequestMapping(value="tickheader",method=RequestMethod.POST)
			public ModelAndView successticketheader( ticketheader as ,BindingResult result) {
					String invalid="Plz enter valid Credential";
				ticketheader userExists = header.checkheader(as.getTicket_NO(),as.getTicket_Date(),as.getCust_ID(),as.getStatus());	
						
						if(userExists!= null){
							ModelAndView mav=new ModelAndView("TicketheaderSuccess", "all",userExists);
							return mav;
						}else{
							ModelAndView mav2=new ModelAndView("Ticketheader");
							mav2.addObject("inValidMsg",invalid);
							mav2.addObject("inValidMsg","	 <center> <div id=\"danger\" class=\"alert alert-danger\">\r\n" + 
									"    <strong>Invalid Plz Enter Valid ticket no </strong></div></center>");
							return mav2;
						}

			
		}

			@RequestMapping(value="details",method=RequestMethod.POST)
			public ModelAndView successticketdetails( ticketdetails as ,BindingResult result) {
					String invalid="Plz enter valid Credential";
				ticketdetails userExists = details.checkdetails(as.getticketNO(),as.getLINE_NO(),as.getSample_NO(),as.getSample_Description(),as.getSample_Status());	
						
						if(userExists!= null){
							ModelAndView mav=new ModelAndView("ticketdetailSuccess", "all",userExists);
							return mav;
						}else{
							ModelAndView mav2=new ModelAndView("ticketdetails");
							mav2.addObject("inValidMsg",invalid);
							mav2.addObject("inValidMsg","	 <center> <div id=\"danger\" class=\"alert alert-danger\">\r\n" + 
									"    <strong>Invalid Plz Enter Valid ticket details </strong></div></center>");
							return mav2;
						}

			
		}
			@RequestMapping(value="barcode",method=RequestMethod.POST)
			public ModelAndView successticketdetails( Sample_test as ,BindingResult result) {
					String invalid="Plz enter valid Credential";
				Sample_test userExists = barcode.checkbarcode(as.getTICKET_NO(),as.getLINE_NO(),as.getSAMPLE_NO(),as.getTEST_ID(),as.getBARCODE_NO());	
						
						if(userExists!= null){
							ModelAndView mav=new ModelAndView("Sample_Success", "all",userExists);
							return mav;
						}else{
							ModelAndView mav2=new ModelAndView("Sample_test");
							mav2.addObject("inValidMsg",invalid);
							mav2.addObject("inValidMsg","	 <center> <div id=\"danger\" class=\"alert alert-danger\">\r\n" + 
									"    <strong>Invalid Plz Enter Valid sample </strong></div></center>");
							return mav2;
						}

			
		}

			@RequestMapping(value="test",method=RequestMethod.POST)
			public ModelAndView successticketdetails( lab_test as ,BindingResult result) {
					String invalid="Plz enter valid Credential";
				lab_test userExists = labtest.checktest(as.getTICKET_NO(),as.getTEST_Name(),as.gettest_type(),as.gettest_result());	
						
						if(userExists!= null){
							ModelAndView mav=new ModelAndView("Lab_versuccess", "all",userExists);
							return mav;
						}else{
							ModelAndView mav2=new ModelAndView("Lab_ver");
							mav2.addObject("inValidMsg",invalid);
							mav2.addObject("inValidMsg","	 <center> <div id=\"danger\" class=\"alert alert-danger\">\r\n" + 
									"    <strong>Invalid Plz Enter Valid test</strong></div></center>");
							return mav2;
						}

			
		}
			@RequestMapping(value="testdetails",method=RequestMethod.POST)
			public ModelAndView successtestdetails( testdetails as ,BindingResult result) {
					String invalid="Plz enter valid Credential";
				testdetails userExists = testdetail.checktestdetails(as.getTICKET_NO(),as.getappearance(),as.gettensible_strength());	
						
						if(userExists!= null){
							ModelAndView mav=new ModelAndView("test_detailSuccess", "all",userExists);
							return mav;
						}else{
							ModelAndView mav2=new ModelAndView("test_details");
							mav2.addObject("inValidMsg",invalid);
							mav2.addObject("inValidMsg","	 <center> <div id=\"danger\" class=\"alert alert-danger\">\r\n" + 
									"    <strong>Invalid Plz Enter Valid test</strong></div></center>");
							return mav2;
							
						}
			}
			@RequestMapping(value = "About", method = RequestMethod.GET)
public ModelAndView getabout()
{

	
	ModelAndView mav=new ModelAndView("index");
	mav.addObject("title", "About US");
    mav.addObject("userClickAbout", true);
	return new ModelAndView("About");
}



@RequestMapping(value="logout",method=RequestMethod.GET)
public ModelAndView getout() {
ModelAndView mav= new ModelAndView("About");
mav.addObject("title","Logout");
mav.addObject("userClickogout", true);
return mav;
}
@RequestMapping(value = "/Logout")
public ModelAndView logout(HttpServletRequest request) {
    System.out.println("Logout()");
    HttpSession httpSession = request.getSession();
    httpSession.invalidate();
    return new ModelAndView("logout");
}


@RequestMapping(value="Customer_verf", method= RequestMethod.GET)
public ModelAndView cus() {
	ModelAndView mav =new ModelAndView("index");
	
mav.addObject("title","verify Customer");
mav.addObject("userClickCustomer_verf",true);
return new ModelAndView("Customer_verf");

}
@RequestMapping(value="Ticketheader", method= RequestMethod.GET)
public ModelAndView ticket() {
	ModelAndView mav =new ModelAndView("index");
	
mav.addObject("title","Ticket header");
mav.addObject("userClickTicketheader",true);
return new ModelAndView("Ticketheader");

}
@RequestMapping(value="ticketdetails", method= RequestMethod.GET)
public ModelAndView ticketdetails() {
	ModelAndView mav =new ModelAndView("index");
	
mav.addObject("title","ticket details");
mav.addObject("userClickticketdetails",true);
return new ModelAndView("ticketdetails");

}
@RequestMapping(value="NewSample", method= RequestMethod.GET)
public ModelAndView Samplenew() {
	ModelAndView mav =new ModelAndView("index");
	mav.addObject("title","New Sample");
  mav.addObject("userClickNewSample",true);
return new ModelAndView("NewSample");

}

@RequestMapping(value="Sample_test", method= RequestMethod.GET)
public ModelAndView SampleTest() {
	ModelAndView mav =new ModelAndView("index");
	
mav.addObject("title","Sample Test");
mav.addObject("userClickSample_test",true);
return new ModelAndView("Sample_test");

}
@RequestMapping(value="Lab_ver", method= RequestMethod.GET)
public ModelAndView lABvRERF() {
	ModelAndView mav =new ModelAndView("index");
	
	
	
mav.addObject("title","Lab test");
mav.addObject("userClickLab_ver",true);
return new ModelAndView("Lab_ver");

}
@RequestMapping(value="Newlab", method= RequestMethod.GET)

public ModelAndView newlab() {
	ModelAndView mav =new ModelAndView("index");
	
	
	
mav.addObject("title","New Lab");
mav.addObject("userClickNewlab",true);
return new ModelAndView("Newlab");

}
@RequestMapping(value="test_details", method= RequestMethod.GET)
public ModelAndView testdetails() {
	ModelAndView mav =new ModelAndView("index");
mav.addObject("title","Test Details");
mav.addObject("userClicktest_details",true);
return new ModelAndView("test_details");

}
@RequestMapping(value="newtest", method= RequestMethod.GET)
public ModelAndView newtestdetails() {
	ModelAndView mav =new ModelAndView("index");	
mav.addObject("title","New Test Details");

mav.addObject("userClicknewtest",true);
return new ModelAndView("newtest");

}

@RequestMapping(value="Report",method=RequestMethod.GET)
public ModelAndView reports() {
	ModelAndView mav=new ModelAndView("index");
	mav.addObject("title","Report");	
	mav.addObject("userclickReport",true);
	return new ModelAndView("Report");
}
@RequestMapping(value="generate-report", method=RequestMethod.POST)
public ModelAndView generateReport(@RequestParam("Ticket_NO") int Ticket_NO, 
                                   @RequestParam("Ticket_Date")  Date Ticket_Date, 
                                   @RequestParam("Name") String Name, Model model) {
    List<ticketheader> tickets = header.findTicketsWithDetails(Ticket_NO, Ticket_Date, Name);
    
   
    model.addAttribute("tickets", tickets);
    if (!tickets.isEmpty()) {
        return new ModelAndView("generate-report", "all" ,tickets);
    } else {
        ModelAndView mav = new ModelAndView("Report");
        mav.addObject("inValidMsg", "No valid tickets found. Please enter valid test data.");
        return mav;
    }
    
}
}