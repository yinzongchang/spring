package com.yin.aop.schema.advisors;

import org.springframework.core.Ordered;

public class ConcurrentOperationExecutor implements Ordered {

	private static final int DEFAULT_MAX_RETRIES = 2;
	
	private int maxRetries = DEFAULT_MAX_RETRIES;
	
	private int order = 1;

	public void setMaxRetries(int maxRetries) {
		this.maxRetries = maxRetries;
	}
	
	@Override
	public int getOrder() {
		return this.order;
	}
	
}
