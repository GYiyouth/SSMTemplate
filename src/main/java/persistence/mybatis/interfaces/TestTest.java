package persistence.mybatis.interfaces;

import org.apache.ibatis.annotations.Result;
import org.apache.ibatis.annotations.Select;

import java.util.HashMap;
import java.util.List;

/**
 * 这样是不行的。
 * Created by geyao on 2017/3/23.
 */
public interface TestTest {
    @Select("select * from tb_user3")
    List<HashMap> select1();
}
