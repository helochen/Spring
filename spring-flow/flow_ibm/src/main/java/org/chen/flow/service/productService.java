package org.chen.flow.service;

import org.chen.flow.entity.Product;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

/**
 * Created by chen on 16-11-9.
 */
@Service(value = "s_product")
public class productService {
    public productService(){
        System.out.println("create the Service");
        addProduct("cat");
        addProduct("fish");
        addProduct("dog");
    }

    private Map<Integer , Product> products = new HashMap<>();

    public int getNumbers(){
        return products.size();
    }

    public List<?> getProducts(){
        return new ArrayList<Product>(products.values());
    }

    public Product getProduct(int index){
        if( index < 0 ){
            return null;
        }else{
            return products.get(index);
        }
    }

    public void addProduct(String name){
        Product p = new Product();
        int size = products.size();
        p.setIndex(size);
        p.setName(String.format("%s%s", name, size));
        p.setPrice((int) (Math.random()*1000));
        System.out.println("index:" + p.getIndex() +"\tname:"+ p.getName()+"\tprice:" + p.getPrice());
        products.put(products.size(),p);
    }

}
