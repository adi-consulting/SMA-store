package store.dao;

import org.springframework.data.repository.CrudRepository;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import store.entities.Store;

import java.util.List;

public interface StoreRepository extends CrudRepository<Store, Long> {

    List<Store> findAllByGroupId(Long groupId);
    List<Store> findAllByGroupIdAndActiveIsTrue(Long groupId);



}
