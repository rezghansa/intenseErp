/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package controller;

import javax.inject.Named;
import javax.enterprise.context.SessionScoped;
import java.io.Serializable;
import javax.ejb.EJB;
import model.ProductFacade;
import entity.Product;
import java.util.List;

/**
 *
 * @author hansa
 */
@Named(value = "productController")
@SessionScoped
public class productController implements Serializable {

    @EJB
    private ProductFacade productFacade;

    
    public productController() {
    }
    
    public List<Product> findAllProduct(){
        return this.productFacade.findAll();
    }
}
