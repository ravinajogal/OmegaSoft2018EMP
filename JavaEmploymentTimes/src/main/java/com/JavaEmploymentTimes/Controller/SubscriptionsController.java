package com.JavaEmploymentTimes.Controller;

import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

import com.JavaEmploymentTimes.Dao.SubscriptionsDao;
import com.JavaEmploymentTimes.Model.Subscriptions;
@RestController
public class SubscriptionsController {
	@RequestMapping(value="/AddSubscription",method=RequestMethod.POST)
	@ResponseBody
	public String AddSubscription(@ModelAttribute ("Subscriptions") Subscriptions subscriptions)
	{
		SubscriptionsDao obj=new SubscriptionsDao();			
		return obj.AddSubscription(subscriptions);
	}
}