package com.in28minutes.microservices.limitsservice.bean;

public class LimitConfiguration {

    private int maximun;
    private int minimum;

    protected LimitConfiguration() {
        
    }

    public LimitConfiguration(int maximun, int minimum) {
        super();
        this.maximun = maximun;
        this.minimum = minimum;
    }

	/**
	 * @return the maximun
	 */
	public int getMaximun() {
		return maximun;
	}
	/**
	 * @return the minimum
	 */
	public int getMinimum() {
		return minimum;
	}
	/**
	 * @param minimum the minimum to set
	 */
	public void setMinimum(int minimum) {
		this.minimum = minimum;
	}
	/**
	 * @param maximun the maximun to set
	 */
	public void setMaximun(int maximun) {
		this.maximun = maximun;
	}


}