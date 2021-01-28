package coronaMall.web;

import java.util.Arrays;
import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import coronaMall.goods.Goods;
import coronaMall.goods.GoodsService;
import lombok.extern.slf4j.Slf4j;

@Slf4j
@RestController
//@Controller
//경로를 정확히 지정할 때, 클래스 단위의 RequestMapping을 쓴다. (/goods/methods)
public class GoodsController {
	
	//localhost:8080/goods로 접속하면 showGoods가 실행된다.
	@Autowired
	GoodsService goodsservice;
	
	@GetMapping(value = "shop")
	public List<Goods> getAllgoods(){
		return goodsservice.findAll();
	}
	
	@GetMapping(value = "/{id}")
	public Optional<Goods> getGoods(@PathVariable("id") Long id){
		return goodsservice.findById(id);
	}
	

}
