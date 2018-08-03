package com.frasergen.util;

import org.springframework.util.StringUtils;

public class CustomerContextHolder {
	
	public static final String DATA_SOURCE_MYSQLONE = "dataSourceOne";
    public static final String DATA_SOURCE_MYSQLTWO = "DataSourceTwo";
    //用ThreadLocal来设置当前线程使用哪个dataSource
    private static final ThreadLocal<String> contextHolder = new ThreadLocal<String>();
    public static void setCustomerType(String customerType) {
        contextHolder.set(customerType);
    }
    public static String getCustomerType() {
            return (String) contextHolder.get();
    }
    public static void clearCustomerType() {
        contextHolder.remove();
    }
	
}
