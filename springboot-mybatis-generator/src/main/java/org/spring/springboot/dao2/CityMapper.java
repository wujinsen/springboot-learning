package org.spring.springboot.dao2;

import java.util.List;
import org.spring.springboot.domain2.City;

public interface CityMapper {
    int deleteByPrimaryKey(Integer id);

    int insert(City record);

    City selectByPrimaryKey(Integer id);

    List<City> selectAll();

    int updateByPrimaryKey(City record);
}