package com.xworkz.building.runner;

import com.xworks.abstracts.Building;
import com.xworkz.abstractImplement.Apartment;
import com.xworkz.building.dto.BuildingDto;
import com.xworkz.constants.NoOfFloors;

public class BuildingRunner {
	
	public static void main(String [] args) {
		Building build=new Apartment();
		build.address();
		build.buildAmount();
		build.design();
		build.name();
		build.ownerName();
		build.noOfPillars();
		
		BuildingDto dto=new BuildingDto();
		dto.setBuild(false);
		dto.setBuildPrice(7000);
		dto.setName("Anuraga");
		dto.setNoOfPillars(50);
		dto.setFloors(NoOfFloors.G001.toString());
		
		System.out.println(dto.getBuildPrice());
		System.out.println(dto.getFloors());
		System.out.println(dto.getName());
		System.out.println(dto.getNoOfPillars());
		System.out.println(dto.isBuild());
		
		boolean save=build.onSave(dto);
		System.out.println("save:"+save);
		
		build.read();
		
		
	


	
	
	
	}
}