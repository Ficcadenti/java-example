package com.raffo.servlet;

import java.util.*;
import java.text.*;

public class DateTime 
{
	DateFormat dateFormat = new SimpleDateFormat("EEEE d MMMM yyyy");
	DateFormat timeFormat = new SimpleDateFormat("H:mm:ss");
	
	public String getDate() 
	{
		Date date = new Date();
		return dateFormat.format(date);
	}
	public String getTime() 
	{
		Date date = new Date();
		return timeFormat.format(date);
	}
}