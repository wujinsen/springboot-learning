package cn.springboot.dao2;

import cn.springboot.domain2.City;
import java.util.List;

public interface CityMapper {
    int deleteByPrimaryKey(Integer id);

    int insert(City record);

    City selectByPrimaryKey(Integer id);

    List<City> selectAll();

    int updateByPrimaryKey(City record);
}