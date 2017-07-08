package com.canna.recruit.mybatis.handler;

import java.sql.CallableStatement;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

import org.apache.ibatis.type.BaseTypeHandler;
import org.apache.ibatis.type.JdbcType;

import com.canna.recruit.user.domain.Authority;

public class AuthorityTypeHandler extends BaseTypeHandler<Authority> {

	@Override
	public void setNonNullParameter(PreparedStatement ps, int i, Authority parameter, JdbcType jdbcType)
			throws SQLException {
		ps.setInt(i, parameter.getId());
	}

	@Override
	public Authority getNullableResult(ResultSet rs, String columnName) throws SQLException {
		return Authority.valueOf(rs.getInt(columnName));
	}

	@Override
	public Authority getNullableResult(ResultSet rs, int columnIndex) throws SQLException {
		return Authority.valueOf(rs.getInt(columnIndex));
	}

	@Override
	public Authority getNullableResult(CallableStatement cs, int columnIndex) throws SQLException {
		return Authority.valueOf(cs.getInt(columnIndex));
	}

}
