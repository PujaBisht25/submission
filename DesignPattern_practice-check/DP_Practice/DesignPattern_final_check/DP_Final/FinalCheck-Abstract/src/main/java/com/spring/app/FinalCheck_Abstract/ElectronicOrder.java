package com.spring.app.FinalCheck_Abstract;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

public class ElectronicOrder extends Order {

	static final Logger LOGGER = LoggerFactory.getLogger(ElectronicOrder.class);

	public ElectronicOrder(ChannelType channel, ProductType productType) {
		super(channel, productType);
	}

	@Override
	public void processOrder() {
		LOGGER.debug("[Product Type] : " + productType);
		LOGGER.debug("[Channel Type] : " + channel);
	}

}