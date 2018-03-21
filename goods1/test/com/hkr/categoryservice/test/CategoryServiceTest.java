package com.hkr.categoryservice.test;

import static org.junit.Assert.*;

import java.util.List;

import org.junit.Test;

import cn.com.hkr.goods.category.domain.Category;
import cn.com.hkr.goods.category.service.CategoryService;

public class CategoryServiceTest {

	@Test
	public void testLoad() {
		CategoryService cs = new CategoryService();
		Category category1 = cs.load("12");
		assertNotNull(category1);
	}
	
	@Test
	public void testFindChildrenCountByParent1(){
		CategoryService cs = new CategoryService();
		//Category category = new Category();
		int len = cs.findChildrenCountByParent("1");
		System.out.println("子类的个数为：" + len);
	}
	
	@Test
	public void testFindChildrenCountByParent2(){
		CategoryService cs = new CategoryService();
		//Category category = new Category();
		int len = cs.findChildrenCountByParent("2");
		System.out.println("子类的个数为：" + len);
	}

	@Test
	public void testFindChildrenCountByParent3(){
		CategoryService cs = new CategoryService();
		//Category category = new Category();
		int len = cs.findChildrenCountByParent("3");
		System.out.println("子类的个数为：" + len);
	}
	
	@Test
	public void testFindChildrenCountByParent4(){
		CategoryService cs = new CategoryService();
		//Category category = new Category();
		int len = cs.findChildrenCountByParent("4");
		System.out.println("子类的个数为：" + len);
	}
	
	@Test
	public void testFindChildrenCountByParent5(){
		CategoryService cs = new CategoryService();
		//Category category = new Category();
		int len = cs.findChildrenCountByParent("5");
		System.out.println("子类的个数为：" + len);
	}
	
	@Test
	public void testFindChildrenCountByParent6(){
		CategoryService cs = new CategoryService();
		//Category category = new Category();
		int len = cs.findChildrenCountByParent("99");
		if(len==0){
			System.out.println("不存在该父类");
		}
		else {
			System.out.println("子类的个数为：" + len);
		}
	}
	
	@Test
	public void testFindChildrenCountByParent7(){
		CategoryService cs = new CategoryService();
		//Category category = new Category();
		int len = cs.findChildrenCountByParent("fe ewre");
		if(len==0){
			System.out.println("不存在该父类");
		}
		else {
			System.out.println("子类的个数为：" + len);
		}
	}
	
	@Test
	public void testFindAll() {
		CategoryService cs = new CategoryService();
		List<Category> list = cs.findAll();
		for (Category category : list) {
			System.out.println(category.getCname());
		}
	}

	@Test
	public void testFindParents() {
		CategoryService cs = new CategoryService();
		List<Category> list = cs.findParents();
		for (Category category2 : list) {
			System.out.println(category2.getCname());
		}
	}

	@Test
	public void testFindChildren1() {
		CategoryService cs = new CategoryService();
		List<Category> list = cs.findChildren("1");
		for (Category category2 : list) {
			System.out.println(category2.getCname());
		}
	}
	
	@Test
	public void testFindChildren2() {
		CategoryService cs = new CategoryService();
		List<Category> list = cs.findChildren("2");
		for (Category category2 : list) {
			System.out.println(category2.getCname());
		}
	}
	
	@Test
	public void testFindChildren3() {
		CategoryService cs = new CategoryService();
		List<Category> list = cs.findChildren("3");
		for (Category category2 : list) {
			System.out.println(category2.getCname());
		}
	}
	
	@Test
	public void testFindChildren4() {
		CategoryService cs = new CategoryService();
		List<Category> list = cs.findChildren("4");
		for (Category category2 : list) {
			System.out.println(category2.getCname());
		}
	}
	
	@Test
	public void testFindChildren5() {
		CategoryService cs = new CategoryService();
		List<Category> list = cs.findChildren("5");
		for (Category category2 : list) {
			System.out.println(category2.getCname());
		}
	}
	
	@Test
	public void testFindChildren6() {
		CategoryService cs = new CategoryService();
		List<Category> list = cs.findChildren("6");
		for (Category category2 : list) {
			System.out.println(category2.getCname());
		}
	}
	
	@Test
	public void testFindChildren7() {
		CategoryService cs = new CategoryService();
		List<Category> list = cs.findChildren("7");
		for (Category category2 : list) {
			System.out.println(category2.getCname());
		}
	}@Test
	public void testFindChildren8() {
		CategoryService cs = new CategoryService();
		List<Category> list = cs.findChildren("10");
		for (Category category2 : list) {
			System.out.println(category2.getCname());
		}
	}@Test
	public void testFindChildren9() {
		CategoryService cs = new CategoryService();
		List<Category> list = cs.findChildren("20");
		for (Category category2 : list) {
			System.out.println(category2.getCname());
		}
	}@Test
	public void testFindChildren10() {
		CategoryService cs = new CategoryService();
		List<Category> list = cs.findChildren("458795C27E7346A8A5F1B942319297E0");
		for (Category category2 : list) {
			System.out.println(category2.getCname());
		}
	}@Test
	public void testFindChildren11() {
		CategoryService cs = new CategoryService();
		List<Category> list = cs.findChildren("56AD72718C524147A2485E5F4A95A062");
		for (Category category2 : list) {
			System.out.println(category2.getCname());
		}
	}@Test
	public void testFindChildren12() {
		CategoryService cs = new CategoryService();
		List<Category> list = cs.findChildren("57DE3C2DDA784B81844029A28217698C");
		for (Category category2 : list) {
			System.out.println(category2.getCname());
		}
	}
	//创建一级分类
	@Test
	public void testadd() {
		CategoryService cs = new CategoryService();
		Category category = new Category();
		category.setCid("10");
		category.setCname("安卓入门到精通");
		category.setDesc("程序设计分类1");
		cs.add(category);
	}
	
	//创建二级分类
	@Test
	public void testadd1() {
		CategoryService cs = new CategoryService();
		Category category = new Category();
		Category parents = new Category();
		parents.setCid("4");
		category.setParent(parents);
		category.setCid("666795C27E7346A8A5F1B942319297E0");
		category.setCname("数据aa");
		category.setDesc("数据aa");
		cs.add(category);
	 }

}
