package com.how2java.springboot.dao;

import org.springframework.data.jpa.repository.JpaRepository;

import com.how2java.springboot.pojo.Category;

public interface CategoryDAO extends JpaRepository<Category,Integer>{
//这个是针对Category类的DAO,Integer表示主键是Integer类型。
//JpaRepository 这个父接口，就提供了CRUD, 分页等等一系列的查询了，直接拿来用，都不需要二次开发的了
}
