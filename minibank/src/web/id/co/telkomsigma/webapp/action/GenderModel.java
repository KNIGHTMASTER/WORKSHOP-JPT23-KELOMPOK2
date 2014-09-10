package id.co.telkomsigma.webapp.action;

import id.co.telkomsigma.model.LabelValue;

import java.util.List;

import org.apache.tapestry.form.IPropertySelectionModel;

public class GenderModel implements IPropertySelectionModel{
	
	private List genders = null;	
	
	public GenderModel(List products) {
		super();
		this.genders = products;
	}

	public int getOptionCount(){
		return this.genders.size();
	}
	
	public Object getOption(int index){
		LabelValue option = (LabelValue) this.genders.get(index);
		return option.getValue();
	}
	
	public String getLabel(int index){
		LabelValue option = (LabelValue) this.genders.get(index);
		return option.getLabel();
	}
	
	public String getValue(int index){
		LabelValue option = (LabelValue) this.genders.get(index);
		return option.getValue();
	}
	
	public Object translateValue(String value){
		return value;
	}

}
