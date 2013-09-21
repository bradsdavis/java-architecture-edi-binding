package com.bradsdavis.edi.util;

public class TransformerException extends Exception {

	public TransformerException(String message) {
		super(message);
	}
	
	public TransformerException(String message, Throwable t) {
		super(message, t);
	}
}
