package com.frditlabs.actions;

import org.apache.struts2.convention.annotation.Action;
import org.apache.struts2.convention.annotation.Result;

import com.frditlabs.model.Product;
import com.opensymphony.xwork2.ActionSupport;

public class ProductAction extends ActionSupport {

	private static final long serialVersionUID = 1L;
	Product product;
	
	@Action(value="productos", results={
			@Result(name="success",location="product.jsp")
		})
	public String execute(){
		//llamada al DS
		product = new Product();
		product.setDescription("list descripcion");
		product.setName("list");
		
		return SUCCESS;
	}

	@Action(value="producto", results={
			@Result(name="success",location="product.jsp")
		})
	public String showProduct(){
		// http://localhost:8888/producto?product.id=1
		// en este caso el objeto producto ya está inicializado y el único valor que tiene es el id 
		product.setDescription("show Product");
		product.setName("Show");
		
		return SUCCESS;
	}

	public Product getProduct() {
		return product;
	}

	public void setProduct(Product product) {
		this.product = product;
	}

}
