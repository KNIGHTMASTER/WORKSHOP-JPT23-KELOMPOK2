package id.co.telkomsigma.service.minibank;

import java.util.List;

import id.co.telkomsigma.model.User;
import id.co.telkomsigma.model.minibank.CIF;

public interface CIFManager {

	public CIF actionGetCIF(Long cifId);

	public CIF actionLoadCIFById(Long cifId);

	public void actionSave(CIF cif);
	
	public List<CIF> actionLoadCIFALL();
	
	public CIF actionLoadCIFByUser(User user);
}
