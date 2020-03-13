package zy.com.cn.demo.take.task.service.impl;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.util.Assert;
import zy.com.cn.demo.take.task.mapper.FoodInfoMapper;
import zy.com.cn.demo.take.task.model.FoodInfo;
import zy.com.cn.demo.take.task.service.FoodInfoService;

import java.util.List;

/**
 * @title: FoodInfoServiceImpl
 * @description: 食品信息服务实现层
 * @author: zhangyan
 * @date: 2020-03-12 10:58
 * @version: 1.0
 **/
@Service
public class FoodInfoServiceImpl implements FoodInfoService {

    @Autowired
    private FoodInfoMapper foodInfoMapper;

    private Logger logger = LoggerFactory.getLogger(getClass());

    @Override
    public FoodInfo insertFoodInfo(FoodInfo record) {
        Assert.notNull(record, "record is null");
        try{
            foodInfoMapper.insertRecord(record);
            return record;
        }catch (Exception e){
            logger.error("新增食品失败：{}", e.getMessage(), e);
            return  null;
        }
    }

    @Override
    public FoodInfo updateFoodInfo(FoodInfo record) {
        Assert.notNull(record, "record is null");
        try{
            foodInfoMapper.updateRecord(record);
            return record;
        }catch (Exception e){
            logger.error("修改食品失败：{}", e.getMessage(), e);
            return null;
        }
    }

    @Override
    public FoodInfo getFoodInfo(Integer id) {
        Assert.notNull(id, "id is null");
        try{
            return foodInfoMapper.getRecord(id);
        }catch (Exception e){
            logger.error("查询食品失败：{}", e.getMessage(), e);
            return null;
        }
    }

    @Override
    public List<FoodInfo> listFoods(FoodInfo record) {
        Assert.notNull(record, "record is null");
        try{
            return foodInfoMapper.listRecord(record);
        }catch (Exception e){
            logger.error("查询食品列表失败：{}", e.getMessage(), e);
            return null;
        }
    }
}