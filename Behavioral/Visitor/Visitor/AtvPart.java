package com.pluralsight.visitor;

public interface AtvPart {
	public void accept(AtvPartVisitor visitor);
}
