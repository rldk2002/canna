package com.canna.recruit.mybatis.handler;

import java.sql.CallableStatement;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

import org.apache.ibatis.type.BaseTypeHandler;
import org.apache.ibatis.type.JdbcType;

import com.canna.recruit.user.domain.Gender;

public class GenderTypeHandler extends BaseTypeHandler<Gender> {

	@Override
	public void setNonNullParameter(PreparedStatement ps, int i, Gender parameter, JdbcType jdbcType)
			throws SQLException {
		ps.setInt(i, parameter.getId());
	}

	@Override
	public Gender getNullableResult(ResultSet rs, String columnName) throws SQLException {
		return Gender.valueOf(rs.getInt(columnName));
	}

	@Override
	public Gender getNullableResult(ResultSet rs, int columnIndex) throws SQLException {
		return Gender.valueOf(rs.getInt(columnIndex));
	}

	@Override
	public Gender getNullableResult(CallableStatement cs, int columnIndex) throws SQLException {
		return Gender.valueOf(cs.getInt(columnIndex));
	}

}
