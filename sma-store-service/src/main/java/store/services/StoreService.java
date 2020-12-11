package store.services;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import store.dao.StoreRepository;
import store.entities.Store;

import java.util.List;

@Service
public class StoreService {

    @Autowired
    StoreRepository storeRepository;

    public void addStore(Store store){
        storeRepository.save(store);
    }

    public Store findById(Long id){
        return storeRepository.findById(id).get();
    }

    public Iterable<Store> getAllStore()
    {
        return storeRepository.findAll();
    }

    public List<Store> getAllStoreByGroupId(Long groupId)
    {
        return storeRepository.findAllByGroupId( groupId);
    }

    public List<Store> getAllActiveStoreByGroupId(Long groupId){
        return storeRepository.findAllByGroupIdAndActiveIsTrue(groupId);
    }
}
