package com.github.lofi.client;

import java.util.logging.Logger;

import com.github.lofi.client.ui.OrderClientBundle;
import com.google.gwt.core.client.EntryPoint;

public class AppEntryPoint implements EntryPoint {

	private static Logger logger = Logger.getLogger(AppEntryPoint.class.getName());

	@Override
	public void onModuleLoad() {
		logger.info("Start app...");
		
		OrderClientBundle.BUNDLE.css().ensureInjected();

		new OrderApp().run();
	}
}
