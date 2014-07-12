package org.upiita.spring.formas;

import org.springframework.context.annotation.Scope;



//@Scope("session")
public class FormaSesion {
	
	private Integer itemsComprados = 0;
	
	public Integer getItemsComprados() {
		return itemsComprados;
	}
	
	public void setItemsComprados(Integer itemsComprados) {
		this.itemsComprados = itemsComprados;
	}

}
