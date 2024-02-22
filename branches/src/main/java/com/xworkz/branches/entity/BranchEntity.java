package com.xworkz.branches.entity;

import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.NamedQuery;
import javax.persistence.Table;

import lombok.Data;

@Entity
@Data
@Table(name="branches")
@NamedQuery(name="findhodbyname",query="SELECT entity.hod_name FROM BranchEntity entity WHERE entity.branch_name=:branchNameby")
@NamedQuery(name="findbranch",query="SELECT entity.no_of_branches FROM BranchEntity entity WHERE entity.branch_name=:branchNameby")
@NamedQuery(name="findnameandbranch",query="SELECT entity.no_of_branches,entity.hod_name FROM BranchEntity entity WHERE entity.branch_name=:branchNameby")
public class BranchEntity {
	@Id
	private int id;
	private String branch_name;
	private String hod_name;
	private int no_of_branches;

}
