package com.xworkz.building.dto;

public class BuildingDto {
	
    private String name;
	private String floors;
	private double buildPrice;
	private int noOfPillars;
	private boolean build;
	
	
	public BuildingDto() {
		System.out.println("no-arg constructor");
	}


	public BuildingDto(String name, int noOfFloors, double buildPrice, int noOfPillars, boolean build) {
		this.name = name;
		this.floors = floors;
		this.buildPrice = buildPrice;
		this.noOfPillars = noOfPillars;
		this.build = build;
	}


	public String getName() {
		return name;
	}


	public void setName(String name) {
		this.name = name;
	}


	public String getFloors() {
		return floors;
	}


	public void setFloors(String floors) {
		this.floors = floors;
	}


	public double getBuildPrice() {
		return buildPrice;
	}


	public void setBuildPrice(double buildPrice) {
		this.buildPrice = buildPrice;
	}


	public int getNoOfPillars() {
		return noOfPillars;
	}


	public void setNoOfPillars(int noOfPillars) {
		this.noOfPillars = noOfPillars;
	}


	public boolean isBuild() {
		return build;
	}


	public void setBuild(boolean build) {
		this.build = build;
	}

    @Override
	public String toString() {
		return "BuildingDto is:" + "name:" + name + " "+"noOfFloors:" + floors + " " +"buildPrice:" + buildPrice
				+ " "+ "noOfPillars:" + noOfPillars + " "+ " build:"+ build;
	}
    
    
    @Override
    public boolean equals(Object obj) {
 	   if(this==obj) {
 		   return true;
 	   }
 	   if(obj==null) {
 		   return false;
 	   }
 	   if(getClass()!=obj.getClass()) {
 		   return false;
 	   }
 	   BuildingDto o=(BuildingDto)obj;
 	   return true;
    }
    
    @Override
    public int hashCode() {
    	return 56;
    }
    
	
	
}
