package designpattern.spring.ioc;

import java.util.List;

public class PetStoreServiceImpl implements PetStoreService {

	
	private AccountDao accountDao;
	
	private ItemDao itemDao;
	
	
	@Override
	public List<String> getUsernameList() {

		return accountDao.getUsernameList();
		
	}


	public AccountDao getAccountDao() {
		return accountDao;
	}


	public void setAccountDao(AccountDao accountDao) {
		this.accountDao = accountDao;
	}


	public ItemDao getItemDao() {
		return itemDao;
	}


	public void setItemDao(ItemDao itemDao) {
		this.itemDao = itemDao;
	}
	
	

	
}
