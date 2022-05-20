package eCommerceRegisterSystem.core;

import eCommerceRegisterSystem.google.GoogleManager;

public class GoogleManagerAdapter implements GoogleService {

	@Override
	public void add(String message) {

		GoogleManager googleManager = new GoogleManager();
		googleManager.signUp();
	}

}
