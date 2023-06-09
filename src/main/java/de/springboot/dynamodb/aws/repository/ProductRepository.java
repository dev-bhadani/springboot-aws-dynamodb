package de.springboot.dynamodb.aws.repository;

import de.springboot.dynamodb.aws.entity.Product;
import org.socialsignin.spring.data.dynamodb.repository.EnableScan;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

@Repository
@EnableScan
public interface ProductRepository extends CrudRepository<Product,String> {
}
