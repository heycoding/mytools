package com.heycoding.springbootdemo.repository;

import com.heycoding.springbootdemo.model.Product;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;
import org.springframework.stereotype.Repository;

import java.util.Date;

@Repository
public interface ProductRepository extends JpaRepository<Product, Long> {

    @Query("select p from UserInfo u " +
            "left join OrderInfo o on o.userInfo.id = u.id " +
            "left join Item i on i.orderInfo.id = o.id " +
            "left join Product p  on i.product.id = p.id " +
            "where u.id=:userId")
    Object findAllProductByUserId(@Param("userId") String userId);

    @Query("select i from Item i where date(i.orderInfo.createDate)=:createDate and i.orderInfo.location=:location")
    Object findAllItemByDate(@Param("createDate") Date createDate, @Param("location")String location);

    @Query("select u.id from UserInfo u " +
            "left join OrderInfo o on o.userInfo.id = u.id " +
            "left join Item i on i.orderInfo.id = o.id " +
            "left join Product p  on i.product.id = p.id " +
            "group by u.id having sum(p.unitPrice) >1")
    Object findOrOrderByUnitPrice();

    @Query("select p from Product p where p.unitPrice>5000")
    Object findProductByByUnitPrice();
}
