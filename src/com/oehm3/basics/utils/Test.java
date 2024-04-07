package com.oehm3.basics.utils;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;

import com.oehm3.basics.dao.AssosiationsDao;
import com.oehm3.basics.dao.HqlProductDao;
import com.oehm3.basics.dao.ProductDao;
import com.oehm3.basics.dao.SqlProductDao;
import com.oehm3.basics.dto.Answer;
import com.oehm3.basics.dto.Brand;
import com.oehm3.basics.dto.Ceo;
import com.oehm3.basics.dto.Company;
import com.oehm3.basics.dto.Hero;
import com.oehm3.basics.dto.Model;
import com.oehm3.basics.dto.Movies;
import com.oehm3.basics.dto.Product;
import com.oehm3.basics.dto.Question;

public class Test {

	public static void main(String[] args) {
//		Product product =new Product();
//		product.setId(new Long(501));
//		product.setName("bmw");
//		product.setManufactureDate(new Date());
//		product.setPrice(new Double(20000.20));
//		product.setProductType("cars");
//		
//		ProductDao productDao = new ProductDao();
//		productDao.saveProduct(product);

//		ProductDao productDao = new ProductDao();
//		productDao.deleteById(new Long(151))
		
//		ProductDao productDao = new ProductDao();
//		Product productFrontDb = productDao.getProduct(new Long(500));
//		System.out.println(productFrontDb);
		
//		HqlProductDao hqlProductDao = new HqlProductDao();
		
//		hqlProductDao.getProducts().forEach(a ->{
//			System.out.println(a);
//		});
//		hqlProductDao.deleteById(new Long(501));
		
//		hqlProductDao.updateProductPriceByName("bmw", new Double(40000.50));
//		hqlProductDao.getProducts().forEach(a ->{
//			System.out.println(a);
//		});
		
//		SqlProductDao productDao=  new SqlProductDao();
//		productDao.getProducts().forEach(data->{
//			System.out.println((Object).data); 
//		});
		
//		Ceo ceo = new Ceo();
//		ceo.setName("sundar pichai");
//		ceo.setAge(new Long(47));
//		ceo.setNationality("Indian");
//		
//		Company company = new Company();
//		company.setName("Google");
//		company.setCompanySize(new Long(1000));
//		company.setType("product based");
//		company.setCeo(ceo);
//		
//		AssosiationsDao dao = new AssosiationsDao();
//		dao.saveCompanyDetails(company);
		
		
		
//		ArrayList<Model> list =new ArrayList<Model>();
//		
//		Model model1 =new Model();
//		model1.setName("tiago");
//		model1.setVersion("2.0");
//		model1.setPrice(new Double(500000.500));
//		model1.setManufactureDate(new Date());
//		list.add(model1);
//		
//		Model model2 =new Model();
//		model2.setName("Nexon");
//		model2.setVersion("3.0");
//		model2.setPrice(new Double(200000.500));
//		model2.setManufactureDate(new Date());
//		list.add(model2);
//		
//		Model model3 =new Model(); 
//		model3.setName("Jaguar");
//		model3.setVersion("2.0");
//		model3.setPrice(new Double(600000.500));
//		model3.setManufactureDate(new Date());
//		list.add(model3);
//		
//		Brand brand = new Brand();
//		brand.setName("Tata");
//		brand.setRank(new Long(3));
//		brand.setStartDate(new Date());
//		brand.setModels(list);
//		
//		AssosiationsDao dao = new AssosiationsDao();
//		dao.saveBrandDetails(brand);
		
		
		
//		Movies movies = new Movies();
//		movies.setName("Avengers");
//		movies.setRating(new Double(8.9));
//		movies.setReleaseDate(new Date());
//		movies.setGrossCollection(new Double(1000.500));
//		
//		Hero hero = new Hero();
//		hero.setName("Robert");
//		hero.setNumberOfMovies(new Long(10));
//		hero.setDebutDate(new Date());
//		movies.setHero(hero);
//		
//		
//		AssosiationsDao dao = new AssosiationsDao();
//		dao.saveMovieDetails(movies);
		
		Question question = new Question();
		question.setDetails("What is java");
		List<Answer> arrayList =new ArrayList<Answer>();
		
		Answer answer1= new Answer();
		answer1.setDetails("Java is a programming language");
		
		Answer answer2= new Answer();
		answer2.setDetails("Java is a platform");
		
		Answer answer3= new Answer();
		answer3.setDetails("Java uses OOPs concept");
		
		arrayList.add(answer1);
		arrayList.add(answer2);
		arrayList.add(answer3);
		question.setAnswers(arrayList);
		
		AssosiationsDao dao = new AssosiationsDao();
		dao.saveQuestionAndAnswerDetails(question);
	}
}
