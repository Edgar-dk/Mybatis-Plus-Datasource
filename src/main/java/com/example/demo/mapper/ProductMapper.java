package com.example.demo.mapper;

import com.baomidou.mybatisplus.core.mapper.BaseMapper;
import com.example.demo.entity.Product;
import com.example.demo.entity.User;
import org.apache.ibatis.annotations.Mapper;

/**
 * @author Edgar
 * @create 2022-07-09 19:06
 * @faction:
 */

@Mapper
public interface ProductMapper extends BaseMapper<Product> {
}
