package com.frasergen.entity;

public class Item {
	private int itemID;
	private String customer;
	private String work_unit;
	private String salesperson; 
	private String itemNumber;
	private String item_name;
	private String progress_description;
	private String signing_date;
	private String expiration_date;
	private String task_load;
	private String service;
	private String start_date;
	private String finish_data;
	private String effective_date;
	private String specified_interval;
	private String state;
	private String state_change_time;
	private String if_over_due;
	private String remark;
	private float money;
	private float our_amount;
	private float advance;
	private float mid_section;
	private float final_payment;
	private String arrive_time;
	private float accruing_amounts;
	private String payment_note;
	private String invoice_date;
	private float invoice_value;
	private int invoice_number;
	private String update_this_week;
	private String update_date;
	private String change_expiration_date;
	private String pause_start;
	private String pause_end;
	private int productID;
	public Item() {
		super();
	}
	public Item(int itemID, String customer, String work_unit, String salesperson, String itemNumber, String item_name,
			String progress_description, String signing_date, String expiration_date, String task_load, String service,
			String start_date, String finish_data, String effective_date, String specified_interval, String state,
			String state_change_time, String if_over_due, String remark, float money, float our_amount, float advance,
			float mid_section, float final_payment, String arrive_time, float accruing_amounts, String payment_note,
			String invoice_date, float invoice_value, int invoice_number, String update_this_week, String update_date,
			String change_expiration_date, String pause_start, String pause_end, int productID) {
		super();
		this.itemID = itemID;
		this.customer = customer;
		this.work_unit = work_unit;
		this.salesperson = salesperson;
		this.itemNumber = itemNumber;
		this.item_name = item_name;
		this.progress_description = progress_description;
		this.signing_date = signing_date;
		this.expiration_date = expiration_date;
		this.task_load = task_load;
		this.service = service;
		this.start_date = start_date;
		this.finish_data = finish_data;
		this.effective_date = effective_date;
		this.specified_interval = specified_interval;
		this.state = state;
		this.state_change_time = state_change_time;
		this.if_over_due = if_over_due;
		this.remark = remark;
		this.money = money;
		this.our_amount = our_amount;
		this.advance = advance;
		this.mid_section = mid_section;
		this.final_payment = final_payment;
		this.arrive_time = arrive_time;
		this.accruing_amounts = accruing_amounts;
		this.payment_note = payment_note;
		this.invoice_date = invoice_date;
		this.invoice_value = invoice_value;
		this.invoice_number = invoice_number;
		this.update_this_week = update_this_week;
		this.update_date = update_date;
		this.change_expiration_date = change_expiration_date;
		this.pause_start = pause_start;
		this.pause_end = pause_end;
		this.productID = productID;
	}
	public int getItemID() {
		return itemID;
	}
	public void setItemID(int itemID) {
		this.itemID = itemID;
	}
	public String getCustomer() {
		return customer;
	}
	public void setCustomer(String customer) {
		this.customer = customer;
	}
	public String getWork_unit() {
		return work_unit;
	}
	public void setWork_unit(String work_unit) {
		this.work_unit = work_unit;
	}
	public String getSalesperson() {
		return salesperson;
	}
	public void setSalesperson(String salesperson) {
		this.salesperson = salesperson;
	}
	public String getItemNumber() {
		return itemNumber;
	}
	public void setItemNumber(String itemNumber) {
		this.itemNumber = itemNumber;
	}
	public String getItem_name() {
		return item_name;
	}
	public void setItem_name(String item_name) {
		this.item_name = item_name;
	}
	public String getProgress_description() {
		return progress_description;
	}
	public void setProgress_description(String progress_description) {
		this.progress_description = progress_description;
	}
	public String getSigning_date() {
		return signing_date;
	}
	public void setSigning_date(String signing_date) {
		this.signing_date = signing_date;
	}
	public String getExpiration_date() {
		return expiration_date;
	}
	public void setExpiration_date(String expiration_date) {
		this.expiration_date = expiration_date;
	}
	public String getTask_load() {
		return task_load;
	}
	public void setTask_load(String task_load) {
		this.task_load = task_load;
	}
	public String getService() {
		return service;
	}
	public void setService(String service) {
		this.service = service;
	}
	public String getStart_date() {
		return start_date;
	}
	public void setStart_date(String start_date) {
		this.start_date = start_date;
	}
	public String getFinish_data() {
		return finish_data;
	}
	public void setFinish_data(String finish_data) {
		this.finish_data = finish_data;
	}
	public String getEffective_date() {
		return effective_date;
	}
	public void setEffective_date(String effective_date) {
		this.effective_date = effective_date;
	}
	public String getSpecified_interval() {
		return specified_interval;
	}
	public void setSpecified_interval(String specified_interval) {
		this.specified_interval = specified_interval;
	}
	public String getState() {
		return state;
	}
	public void setState(String state) {
		this.state = state;
	}
	public String getState_change_time() {
		return state_change_time;
	}
	public void setState_change_time(String state_change_time) {
		this.state_change_time = state_change_time;
	}
	public String getIf_over_due() {
		return if_over_due;
	}
	public void setIf_over_due(String if_over_due) {
		this.if_over_due = if_over_due;
	}
	public String getRemark() {
		return remark;
	}
	public void setRemark(String remark) {
		this.remark = remark;
	}
	public float getMoney() {
		return money;
	}
	public void setMoney(float money) {
		this.money = money;
	}
	public float getOur_amount() {
		return our_amount;
	}
	public void setOur_amount(float our_amount) {
		this.our_amount = our_amount;
	}
	public float getAdvance() {
		return advance;
	}
	public void setAdvance(float advance) {
		this.advance = advance;
	}
	public float getMid_section() {
		return mid_section;
	}
	public void setMid_section(float mid_section) {
		this.mid_section = mid_section;
	}
	public float getFinal_payment() {
		return final_payment;
	}
	public void setFinal_payment(float final_payment) {
		this.final_payment = final_payment;
	}
	public String getArrive_time() {
		return arrive_time;
	}
	public void setArrive_time(String arrive_time) {
		this.arrive_time = arrive_time;
	}
	public float getAccruing_amounts() {
		return accruing_amounts;
	}
	public void setAccruing_amounts(float accruing_amounts) {
		this.accruing_amounts = accruing_amounts;
	}
	public String getPayment_note() {
		return payment_note;
	}
	public void setPayment_note(String payment_note) {
		this.payment_note = payment_note;
	}
	public String getInvoice_date() {
		return invoice_date;
	}
	public void setInvoice_date(String invoice_date) {
		this.invoice_date = invoice_date;
	}
	public float getInvoice_value() {
		return invoice_value;
	}
	public void setInvoice_value(float invoice_value) {
		this.invoice_value = invoice_value;
	}
	public int getInvoice_number() {
		return invoice_number;
	}
	public void setInvoice_number(int invoice_number) {
		this.invoice_number = invoice_number;
	}
	public String getUpdate_this_week() {
		return update_this_week;
	}
	public void setUpdate_this_week(String update_this_week) {
		this.update_this_week = update_this_week;
	}
	public String getUpdate_date() {
		return update_date;
	}
	public void setUpdate_date(String update_date) {
		this.update_date = update_date;
	}
	public String getChange_expiration_date() {
		return change_expiration_date;
	}
	public void setChange_expiration_date(String change_expiration_date) {
		this.change_expiration_date = change_expiration_date;
	}
	public String getPause_start() {
		return pause_start;
	}
	public void setPause_start(String pause_start) {
		this.pause_start = pause_start;
	}
	public String getPause_end() {
		return pause_end;
	}
	public void setPause_end(String pause_end) {
		this.pause_end = pause_end;
	}
	public int getProductID() {
		return productID;
	}
	public void setProductID(int productID) {
		this.productID = productID;
	}
	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + Float.floatToIntBits(accruing_amounts);
		result = prime * result + Float.floatToIntBits(advance);
		result = prime * result + ((arrive_time == null) ? 0 : arrive_time.hashCode());
		result = prime * result + ((change_expiration_date == null) ? 0 : change_expiration_date.hashCode());
		result = prime * result + ((customer == null) ? 0 : customer.hashCode());
		result = prime * result + ((effective_date == null) ? 0 : effective_date.hashCode());
		result = prime * result + ((expiration_date == null) ? 0 : expiration_date.hashCode());
		result = prime * result + Float.floatToIntBits(final_payment);
		result = prime * result + ((finish_data == null) ? 0 : finish_data.hashCode());
		result = prime * result + ((if_over_due == null) ? 0 : if_over_due.hashCode());
		result = prime * result + ((invoice_date == null) ? 0 : invoice_date.hashCode());
		result = prime * result + invoice_number;
		result = prime * result + Float.floatToIntBits(invoice_value);
		result = prime * result + itemID;
		result = prime * result + ((itemNumber == null) ? 0 : itemNumber.hashCode());
		result = prime * result + ((item_name == null) ? 0 : item_name.hashCode());
		result = prime * result + Float.floatToIntBits(mid_section);
		result = prime * result + Float.floatToIntBits(money);
		result = prime * result + Float.floatToIntBits(our_amount);
		result = prime * result + ((pause_end == null) ? 0 : pause_end.hashCode());
		result = prime * result + ((pause_start == null) ? 0 : pause_start.hashCode());
		result = prime * result + ((payment_note == null) ? 0 : payment_note.hashCode());
		result = prime * result + productID;
		result = prime * result + ((progress_description == null) ? 0 : progress_description.hashCode());
		result = prime * result + ((remark == null) ? 0 : remark.hashCode());
		result = prime * result + ((salesperson == null) ? 0 : salesperson.hashCode());
		result = prime * result + ((service == null) ? 0 : service.hashCode());
		result = prime * result + ((signing_date == null) ? 0 : signing_date.hashCode());
		result = prime * result + ((specified_interval == null) ? 0 : specified_interval.hashCode());
		result = prime * result + ((start_date == null) ? 0 : start_date.hashCode());
		result = prime * result + ((state == null) ? 0 : state.hashCode());
		result = prime * result + ((state_change_time == null) ? 0 : state_change_time.hashCode());
		result = prime * result + ((task_load == null) ? 0 : task_load.hashCode());
		result = prime * result + ((update_date == null) ? 0 : update_date.hashCode());
		result = prime * result + ((update_this_week == null) ? 0 : update_this_week.hashCode());
		result = prime * result + ((work_unit == null) ? 0 : work_unit.hashCode());
		return result;
	}
	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Item other = (Item) obj;
		if (Float.floatToIntBits(accruing_amounts) != Float.floatToIntBits(other.accruing_amounts))
			return false;
		if (Float.floatToIntBits(advance) != Float.floatToIntBits(other.advance))
			return false;
		if (arrive_time == null) {
			if (other.arrive_time != null)
				return false;
		} else if (!arrive_time.equals(other.arrive_time))
			return false;
		if (change_expiration_date == null) {
			if (other.change_expiration_date != null)
				return false;
		} else if (!change_expiration_date.equals(other.change_expiration_date))
			return false;
		if (customer == null) {
			if (other.customer != null)
				return false;
		} else if (!customer.equals(other.customer))
			return false;
		if (effective_date == null) {
			if (other.effective_date != null)
				return false;
		} else if (!effective_date.equals(other.effective_date))
			return false;
		if (expiration_date == null) {
			if (other.expiration_date != null)
				return false;
		} else if (!expiration_date.equals(other.expiration_date))
			return false;
		if (Float.floatToIntBits(final_payment) != Float.floatToIntBits(other.final_payment))
			return false;
		if (finish_data == null) {
			if (other.finish_data != null)
				return false;
		} else if (!finish_data.equals(other.finish_data))
			return false;
		if (if_over_due == null) {
			if (other.if_over_due != null)
				return false;
		} else if (!if_over_due.equals(other.if_over_due))
			return false;
		if (invoice_date == null) {
			if (other.invoice_date != null)
				return false;
		} else if (!invoice_date.equals(other.invoice_date))
			return false;
		if (invoice_number != other.invoice_number)
			return false;
		if (Float.floatToIntBits(invoice_value) != Float.floatToIntBits(other.invoice_value))
			return false;
		if (itemID != other.itemID)
			return false;
		if (itemNumber == null) {
			if (other.itemNumber != null)
				return false;
		} else if (!itemNumber.equals(other.itemNumber))
			return false;
		if (item_name == null) {
			if (other.item_name != null)
				return false;
		} else if (!item_name.equals(other.item_name))
			return false;
		if (Float.floatToIntBits(mid_section) != Float.floatToIntBits(other.mid_section))
			return false;
		if (Float.floatToIntBits(money) != Float.floatToIntBits(other.money))
			return false;
		if (Float.floatToIntBits(our_amount) != Float.floatToIntBits(other.our_amount))
			return false;
		if (pause_end == null) {
			if (other.pause_end != null)
				return false;
		} else if (!pause_end.equals(other.pause_end))
			return false;
		if (pause_start == null) {
			if (other.pause_start != null)
				return false;
		} else if (!pause_start.equals(other.pause_start))
			return false;
		if (payment_note == null) {
			if (other.payment_note != null)
				return false;
		} else if (!payment_note.equals(other.payment_note))
			return false;
		if (productID != other.productID)
			return false;
		if (progress_description == null) {
			if (other.progress_description != null)
				return false;
		} else if (!progress_description.equals(other.progress_description))
			return false;
		if (remark == null) {
			if (other.remark != null)
				return false;
		} else if (!remark.equals(other.remark))
			return false;
		if (salesperson == null) {
			if (other.salesperson != null)
				return false;
		} else if (!salesperson.equals(other.salesperson))
			return false;
		if (service == null) {
			if (other.service != null)
				return false;
		} else if (!service.equals(other.service))
			return false;
		if (signing_date == null) {
			if (other.signing_date != null)
				return false;
		} else if (!signing_date.equals(other.signing_date))
			return false;
		if (specified_interval == null) {
			if (other.specified_interval != null)
				return false;
		} else if (!specified_interval.equals(other.specified_interval))
			return false;
		if (start_date == null) {
			if (other.start_date != null)
				return false;
		} else if (!start_date.equals(other.start_date))
			return false;
		if (state == null) {
			if (other.state != null)
				return false;
		} else if (!state.equals(other.state))
			return false;
		if (state_change_time == null) {
			if (other.state_change_time != null)
				return false;
		} else if (!state_change_time.equals(other.state_change_time))
			return false;
		if (task_load == null) {
			if (other.task_load != null)
				return false;
		} else if (!task_load.equals(other.task_load))
			return false;
		if (update_date == null) {
			if (other.update_date != null)
				return false;
		} else if (!update_date.equals(other.update_date))
			return false;
		if (update_this_week == null) {
			if (other.update_this_week != null)
				return false;
		} else if (!update_this_week.equals(other.update_this_week))
			return false;
		if (work_unit == null) {
			if (other.work_unit != null)
				return false;
		} else if (!work_unit.equals(other.work_unit))
			return false;
		return true;
	}
	@Override
	public String toString() {
		return "Item [itemID=" + itemID + ", customer=" + customer + ", work_unit=" + work_unit + ", salesperson="
				+ salesperson + ", itemNumber=" + itemNumber + ", item_name=" + item_name + ", progress_description="
				+ progress_description + ", signing_date=" + signing_date + ", expiration_date=" + expiration_date
				+ ", task_load=" + task_load + ", service=" + service + ", start_date=" + start_date + ", finish_data="
				+ finish_data + ", effective_date=" + effective_date + ", specified_interval=" + specified_interval
				+ ", state=" + state + ", state_change_time=" + state_change_time + ", if_over_due=" + if_over_due
				+ ", remark=" + remark + ", money=" + money + ", our_amount=" + our_amount + ", advance=" + advance
				+ ", mid_section=" + mid_section + ", final_payment=" + final_payment + ", arrive_time=" + arrive_time
				+ ", accruing_amounts=" + accruing_amounts + ", payment_note=" + payment_note + ", invoice_date="
				+ invoice_date + ", invoice_value=" + invoice_value + ", invoice_number=" + invoice_number
				+ ", update_this_week=" + update_this_week + ", update_date=" + update_date
				+ ", change_expiration_date=" + change_expiration_date + ", pause_start=" + pause_start + ", pause_end="
				+ pause_end + ", productID=" + productID + "]";
	}
	
}
