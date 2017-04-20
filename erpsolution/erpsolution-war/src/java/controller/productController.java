/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package controller;

import entities.Product;
import java.util.List;
import javax.ejb.EJB;
import javax.faces.bean.ManagedBean;
import javax.faces.bean.SessionScoped;
import model.ProductFacade;

/**
 *
 * @author hansa
 */
@ManagedBean
@SessionScoped
public class productController {
    @EJB
    private ProductFacade productFacade;
    
    
    public productController() {
    }
    
    
    public List<Product> findAll(){
        return this.productFacade.findAll();
    }
    
}
