//package com.heycoding.springbootdemo.repository;
//
//import org.springframework.data.domain.Page;
//import org.springframework.data.domain.Pageable;
//import org.springframework.data.domain.Sort;
//import org.springframework.data.jpa.repository.JpaRepository;
//import org.springframework.data.repository.NoRepositoryBean;
//
//import java.io.Serializable;
//import java.util.List;
//
//@NoRepositoryBean
//public interface IBaseRepository<T,ID extends Serializable> extends JpaRepository<T,ID> {
//
//    /**
//     * 根据主键删除
//     *
//     * @param ids
//     */
//    void delete(ID[] ids);
//
//    List<T> findAll();
//
//
//    List<T> findAll(Sort sort);
//
//
//    /**
//     * Returns a {@link Page} of entities meeting the paging restriction provided in the {@code Pageable} object.
//     *
//     * @param pageable
//     * @return a page of entities
//     */
//    Page<T> findAll(Pageable pageable);
//
//
//
//
//}
