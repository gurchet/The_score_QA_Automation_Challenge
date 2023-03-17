package test.mobile.score_qa_automation_challenge.base;

import org.openqa.selenium.remote.DesiredCapabilities;

/**
 * @author gurchet.singh
 * @since 15 March 2023 Description : This Class is created to store the device data structure
 */


public class Device {

	private String name;
	private String os;
	private boolean availability;
	private DesiredCapabilities capabilities;
	
	
	public Device(String name, String os, boolean availability, DesiredCapabilities capabilities){
		this.name = name;
		this.os = os;
		this.availability = availability;
		this.capabilities = capabilities;	
	}
	
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getOs() {
		return os;
	}
	public void setOs(String os) {
		this.os = os;
	}
	public boolean isAvailability() {
		return availability;
	}
	public void setAvailability(boolean availability) {
		this.availability = availability;
	}
	
	public DesiredCapabilities getCapabilities() {
		return capabilities;
	}
	public void setCapabilities(DesiredCapabilities capabilities) {
		this.capabilities = capabilities;
	}
	
	
	@Override
	public boolean equals(Object object) {
		
        if (!(object instanceof Device)) {
            return false;
        }
        
        Device device = (Device)object;
        
        if(this.getName().equals(device.getName()) && this.getOs().equals(device.getOs()))
        	return true;
        else
        	return false;
		
	}
	
}
