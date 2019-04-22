package com.alibaba.service.impl;
import java.util.List;
import com.alibaba.dao.ResourceDao;
import com.alibaba.entity.Resource;
import com.alibaba.service.ResourceService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
@Service
public class ResourceServiceImpl implements ResourceService{
    @Autowired
    private ResourceDao resourceDao;
    @Override
    public long getResourceRowCount(){
        return resourceDao.getResourceRowCount();
    }
    @Override
    public List<Resource> selectResource(){
        return resourceDao.selectResource();
    }
    @Override
    public Resource selectResourceByObj(Resource obj){
        return resourceDao.selectResourceByObj(obj);
    }
    @Override
    public Resource selectResourceById(Integer id){
        return resourceDao.selectResourceById(id);
    }
    @Override
    public int insertResource(Resource value){
        return resourceDao.insertResource(value);
    }
    @Override
    public int insertNonEmptyResource(Resource value){
        return resourceDao.insertNonEmptyResource(value);
    }
    @Override
    public int deleteResourceById(Integer id){
        return resourceDao.deleteResourceById(id);
    }
    @Override
    public int updateResourceById(Resource enti){
        return resourceDao.updateResourceById(enti);
    }
    @Override
    public int updateNonEmptyResourceById(Resource enti){
        return resourceDao.updateNonEmptyResourceById(enti);
    }

    public ResourceDao getResourceDao() {
        return this.resourceDao;
    }

    public void setResourceDao(ResourceDao resourceDao) {
        this.resourceDao = resourceDao;
    }

}