package cn.com.hkr.goods.admin.admin.service;

import java.sql.SQLException;

import cn.com.hkr.goods.admin.admin.dao.AdminDao;
import cn.com.hkr.goods.admin.admin.domain.Admin;

public class AdminService {
	private AdminDao adminDao = new AdminDao();
	
	/**
	 * 登录功能
	 * @param admin
	 * @return
	 */
	public Admin login(Admin admin) {
		try {
			return adminDao.find(admin.getAdminname(), admin.getAdminpwd());
		} catch (SQLException e) {
			throw new RuntimeException(e);
		}
	}
}
