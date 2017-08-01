package com.ssm;

import com.ssm.Users;
import com.ssm.UsersExample;
import java.util.List;
import org.apache.ibatis.annotations.Delete;
import org.apache.ibatis.annotations.Insert;
import org.apache.ibatis.annotations.Param;
import org.apache.ibatis.annotations.ResultMap;
import org.apache.ibatis.annotations.Select;
import org.apache.ibatis.annotations.Update;

public interface UsersMapper {
    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table users
     *
     * @mbggenerated
     */
    int countByExample(UsersExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table users
     *
     * @mbggenerated
     */
    int deleteByExample(UsersExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table users
     *
     * @mbggenerated
     */
    @Delete({
        "delete from users",
        "where id = #{id,jdbcType=INTEGER}"
    })
    int deleteByPrimaryKey(Integer id);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table users
     *
     * @mbggenerated
     */
    @Insert({
        "insert into users (id, username, ",
        "password)",
        "values (#{id,jdbcType=INTEGER}, #{username,jdbcType=VARCHAR}, ",
        "#{password,jdbcType=VARCHAR})"
    })
    int insert(Users record);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table users
     *
     * @mbggenerated
     */
    int insertSelective(Users record);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table users
     *
     * @mbggenerated
     */
    List<Users> selectByExample(UsersExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table users
     *
     * @mbggenerated
     */
    @Select({
        "select",
        "id, username, password",
        "from users",
        "where id = #{id,jdbcType=INTEGER}"
    })
    @ResultMap("BaseResultMap")
    Users selectByPrimaryKey(Integer id);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table users
     *
     * @mbggenerated
     */
    int updateByExampleSelective(@Param("record") Users record, @Param("example") UsersExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table users
     *
     * @mbggenerated
     */
    int updateByExample(@Param("record") Users record, @Param("example") UsersExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table users
     *
     * @mbggenerated
     */
    int updateByPrimaryKeySelective(Users record);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table users
     *
     * @mbggenerated
     */
    @Update({
        "update users",
        "set username = #{username,jdbcType=VARCHAR},",
          "password = #{password,jdbcType=VARCHAR}",
        "where id = #{id,jdbcType=INTEGER}"
    })
    int updateByPrimaryKey(Users record);
}