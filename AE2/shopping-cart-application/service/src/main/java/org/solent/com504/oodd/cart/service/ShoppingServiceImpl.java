/*
 * Copyright 2021 rgaud.
 *
 * Licensed under the Apache License, Version 2.0 (the "License");
 * you may not use this file except in compliance with the License.
 * You may obtain a copy of the License at
 *
 *      http://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 */
package org.solent.com504.oodd.cart.service;

import java.util.Arrays;
import java.util.List;
import java.util.Map;
import java.util.UUID;
import java.util.concurrent.ConcurrentHashMap;
import org.solent.com504.oodd.cart.dao.impl.ShoppingItemCatalogRepository;
import org.solent.com504.oodd.cart.model.service.ShoppingCart;
import org.solent.com504.oodd.cart.model.dto.ShoppingItem;
import org.solent.com504.oodd.cart.model.service.ShoppingService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

/**
 *
 * @author cgallen
 */
@Component
public class ShoppingServiceImpl implements ShoppingService {
    
    @Autowired
    private ShoppingItemCatalogRepository shoppingItemCatalogRepository;

    // note ConcurrentHashMap instead of HashMap if map can be altered while being read
//    private Map<String, ShoppingItem> itemMap = new ConcurrentHashMap<String, ShoppingItem>();


    public ShoppingServiceImpl() {

//        // initialised the hashmap
//        for (ShoppingItem item : itemlist) {
//            itemMap.put(item.getName(), item);
//        }
    }

    @Override
    public List<ShoppingItem> getAvailableItems() {
        
        List<ShoppingItem> itemList = shoppingItemCatalogRepository.findAll();
        return itemList;
    }

    @Override
    public boolean purchaseItems(ShoppingCart shoppingCart) {
        System.out.println("purchased items");
        for (ShoppingItem shoppingItem : shoppingCart.getShoppingCartItems()) {
            System.out.println(shoppingItem);
        }

        return true;
    }

    @Override
    public ShoppingItem getNewItemByName(String name) {
        //ShoppingItem templateItem = itemMap.get(name);
        
//        if(templateItem==null) return null;
//       
    //    ShoppingItem item = new ShoppingItem();
 //       item.setName(name);
 //      item.setPrice(templateItem.getPrice());
//        item.setQuantity(0);
//        item.setUuid(UUID.randomUUID().toString());
          return null;
    }

}
