package com.xworkz.abstractImplement;

import com.xworks.abstracts.Building;
import com.xworkz.building.dto.BuildingDto;

public class Apartment extends Building {

	@Override
	public void name() {
	   System.out.println("The name of the building");
	}

	@Override
	public void buildAmount() {
		
		 System.out.println("The amount of the building");
	}

	@Override
	public void noOfPillars() {
		 System.out.println("no of pillars is more");
		
	}

	@Override
	public void ownerName() {
		 System.out.println("owner of the building");
		
	}

	@Override
	public void address() {
		 System.out.println("address of the building");
		
	}

	@Override
	public void design() {
		 System.out.println("The design of the building");
		
	}
	
	
	Object[] obj= new Object[4];
	int index=0;

	@Override
	public boolean onSave(BuildingDto buildingDto) {
		if(buildingDto!=null) {
			System.out.println("dto is null");
			if(index<obj.length) {
				obj[index]=buildingDto;
				index++;
			}
		}
		else {
			System.out.println("dto is not null");
		}
		return false;
	}

	@Override
	public void read() {
		for(Object object:obj) {
			System.out.println("product obj is:"+object);
		       }
	
	

     }
}