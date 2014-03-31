package net.muszytowski.WearableInspectionServer.items;

import java.util.Collection;

import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.OneToMany;

import com.fasterxml.jackson.annotation.JsonManagedReference;
import com.fasterxml.jackson.annotation.JsonTypeInfo;
import com.fasterxml.jackson.annotation.JsonTypeInfo.As;


@Entity
@JsonTypeInfo(use=com.fasterxml.jackson.annotation.JsonTypeInfo.Id.CLASS, include=As.PROPERTY, property="class")
public class Task extends GenericTask{
	
	@OneToMany(mappedBy="parent", fetch=FetchType.EAGER)
	@JsonManagedReference
	private Collection<GenericTask> children;
			
}