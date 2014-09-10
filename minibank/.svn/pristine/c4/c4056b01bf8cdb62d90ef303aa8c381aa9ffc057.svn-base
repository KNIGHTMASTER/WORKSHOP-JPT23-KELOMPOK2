package id.co.telkomsigma.webapp.action.minibank.model;

import id.co.telkomsigma.model.LabelValue;

import java.util.List;

import org.apache.tapestry.form.IPropertySelectionModel;

public class ProductModel implements IPropertySelectionModel{
	
	private List products = null;	
	
	public ProductModel(List products) {
		super();
		this.products = products;
	}

	public int getOptionCount(){
		int size = this.products.size();
		if(String.valueOf(size) == null){
			size = 1;
		}
		return size;
	}
	
	public Object getOption(int index){
		LabelValue option = (LabelValue) this.products.get(index);
		return option.getValue();
	}
	
	public String getLabel(int index){
		LabelValue option = (LabelValue) this.products.get(index);
		return option.getLabel();
	}
	
	public String getValue(int index){
		LabelValue option = (LabelValue) this.products.get(index);
		return option.getValue();
	}
	
	public Object translateValue(String value){
		return value;
	}

}
