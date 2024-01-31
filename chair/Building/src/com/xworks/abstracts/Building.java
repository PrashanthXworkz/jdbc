package com.xworks.abstracts;

import com.xworkz.building.dto.BuildingDto;

public abstract class Building {
	public abstract void name();
	public abstract void buildAmount();
	public abstract void noOfPillars();
	public abstract void ownerName();
	public abstract void address();
	public abstract void design();
	
	
public abstract boolean onSave(BuildingDto buildingDto);
	
	public abstract void read();

}
