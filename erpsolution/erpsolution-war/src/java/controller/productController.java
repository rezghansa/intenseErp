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
    private Product p = new Product();

    public Product getP() {
        return p;
    }

    public void setP(Product p) {
        this.p = p;
    }
    
    
    
    public productController() {
    }
    
    
    public List<Product> findAll(){
        return this.productFacade.findAll();
    }
    
    public String add(){
        this.productFacade.create(this.p);
        this.p = new Product();
        return "/index?faces-redirect=true";
    }
    
    public void delete(Product p){
        this.productFacade.remove(p);
    }
    
    public String edit(Product p){
        this.p = p;
        return "components/edit";
    }
    
    public String edit(){
        this.productFacade.edit(this.p);
        this.p = new Product();
        return "/index?faces-redirect=true";
    }
}
