package com.example.demo.service.impl;

import com.baomidou.dynamic.datasource.annotation.DS;
import com.baomidou.mybatisplus.extension.service.impl.ServiceImpl;
import com.example.demo.entity.Product;
import com.example.demo.entity.User;
import com.example.demo.mapper.ProductMapper;
import com.example.demo.mapper.UserMapper;
import com.example.demo.service.ProductService;
import com.example.demo.service.UserService;
import org.springframework.stereotype.Service;

/**
 * @author Edgar
 * @create 2022-07-09 20:40
 * @faction:
 */

@Service
@DS("slave")
public class ProductServiceImpl extends ServiceImpl<ProductMapper, Product> implements ProductService {
}
