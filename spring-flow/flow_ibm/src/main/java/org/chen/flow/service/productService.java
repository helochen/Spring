package org.chen.flow.service;

import org.chen.flow.entity.Product;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.HashMap;
import java.util.Map;

/**
 * Created by chen on 16-11-9.
 */
@Service(value = "s_product")
public class productService {
    public productService(){
        System.out.println("create the Service");
    }

    private Map<Integer , Product> products = new HashMap<>();

    public int getNumbers(){
        return products.size();
    }

    public void addProduct(String name){
        Product p = new Product();
        int size = products.size();
        p.setIndex(size);
        p.setName(String.format("%s%s", name, size));
        System.out.print("index:" + p.getIndex() +"\tname:"+ p.getName());
        products.put(products.size(),p);
    }

}
