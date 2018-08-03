package com.frasergen.util;

import org.springframework.jdbc.datasource.lookup.AbstractRoutingDataSource;

public class dynamicDataSource extends AbstractRoutingDataSource{

	@Override
	protected Object determineCurrentLookupKey() {
		// TODO Auto-generated method stub
		return CustomerContextHolder.getCustomerType();
	}
	
	
}
