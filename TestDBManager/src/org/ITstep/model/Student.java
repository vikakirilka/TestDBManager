package org.ITstep.model;

public class Student {

	 private String firstName;
	 private String secondName;
	 private long birthDate;
	 private int groupId;

	 public String getFirstName() {
	  return firstName;
	 }
	 public void setFirstName(String firstName) {
	  this.firstName = firstName;
	 }
	 public String getSecondName() {
	  return secondName;
	 }
	 public void setSecondName(String secondName) {
	  this.secondName = secondName;
	 }
	 public long getBirthDate() {
		  return birthDate;
		 }
		 public void setBirthDate(long birthDate) {
		  this.birthDate = birthDate;
		 }
		 public int getGroupId() {
		  return groupId;
		 }
		 public void setGroupId(int groupId) {
		  this.groupId = groupId;
		 }
		 
		 public Student(String firstName, String secondName, long birthDate, int groupId) {
		  this.firstName = firstName;
		  this.secondName = secondName;
		  this.birthDate = birthDate;
		  this.groupId = groupId;
		 }
		 public Student() {
		 }
		}
