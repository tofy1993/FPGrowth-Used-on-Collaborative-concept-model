package org.apriori;

import java.util.Set;

public class TmpClass {
	Set<String> firstSet;
	Set<String> secondSet;
	Double dou;
	
	public TmpClass(Set<String> firstSet, Set<String> secondSet, Double dou) {
		super();
		this.firstSet=firstSet;
		this.secondSet=secondSet;
		this.dou = dou;
	}
	
	public Set<String> getFirstSet() {
		return firstSet;
	}

	public void setFirstSet(Set<String> firstSet) {
		this.firstSet = firstSet;
	}

	public Set<String> getSecondSet() {
		return secondSet;
	}

	public void setSecondSet(Set<String> secondSet) {
		this.secondSet = secondSet;
	}

	public Double getDou() {
		return dou;
	}
	public void setDou(Double dou) {
		this.dou = dou;
	}
	
}
