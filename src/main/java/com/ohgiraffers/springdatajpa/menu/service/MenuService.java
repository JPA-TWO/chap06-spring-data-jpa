package com.ohgiraffers.springdatajpa.menu.service;

import com.ohgiraffers.springdatajpa.menu.dto.MenuDTO;
import com.ohgiraffers.springdatajpa.menu.entity.Menu;
import com.ohgiraffers.springdatajpa.category.repository.CategoryRepository;
import com.ohgiraffers.springdatajpa.menu.repository.MenuRepository;
import org.modelmapper.ModelMapper;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.PageRequest;
import org.springframework.data.domain.Pageable;
import org.springframework.data.domain.Sort;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.util.List;
import java.util.stream.Collectors;

@Service
public class MenuService {

	private final MenuRepository menuRepository;
	private final ModelMapper modelMapper;

	public MenuService(MenuRepository menuRepository, ModelMapper modelMapper) {
		this.menuRepository = menuRepository;
		this.modelMapper = modelMapper;
	}
	
	public MenuDTO findMenuByCode(int menuCode) {
		
		Menu menu = menuRepository.findById(menuCode).orElseThrow(IllegalArgumentException::new);
		
		return modelMapper.map(menu, MenuDTO.class);
	}
	
	public List<MenuDTO> findMenuList() {
		
		List<Menu> menuList = menuRepository.findAll(Sort.by("menuCode").descending());

		// 람다식 사용 버전
		return menuList
				.stream()
				.map(menu -> modelMapper.map(menu, MenuDTO.class))
				.collect(Collectors.toList());
	}

	public Page<MenuDTO> findMenuList(Pageable pageable) {
		
		pageable = PageRequest.of(pageable.getPageNumber() <= 0 ? 0 : pageable.getPageNumber() - 1,
					pageable.getPageSize(),
					Sort.by("menuCode").descending());
		
		Page<Menu> menuList = menuRepository.findAll(pageable);
		
		return menuList.map(menu -> modelMapper.map(menu, MenuDTO.class));
	}

	
	public List<MenuDTO> findByMenuPrice(Integer menuPrice) {

		List<Menu> menuList = menuRepository.findByMenuPriceGreaterThan(menuPrice);

		/* 목차. 2. (옵션)전달 받은 가격을 초과하는 메뉴의 목록을 가격 순으로 조회하는 메소드 */
//		List<Menu> menuList = menuRepository.findByMenuPriceGreaterThanOrderByMenuPrice(menuPrice);

		/* 목차. 3. (옵션)전달 받은 가격을 초과하는 메뉴의 목록을 전달 받는 정렬 기준으로 조회하는 메소드 */
//		List<Menu> menuList = menuRepository.findByMenuPriceGreaterThan(menuPrice, Sort.by("menuPrice").descending());

		// 람다식 사용 버전
		return menuList
				.stream()
				.map(menu -> modelMapper.map(menu, MenuDTO.class))
				.collect(Collectors.toList());
	}

	// TO DO: register a new menu(메뉴등록)
	/* 목차. 6. save - 엔티티 저장 */


	// TO DO: modify a new menu(메뉴수정)
	/* 목차. 7. 수정하기 - 엔티티 조회 후 값 변경 */


	// TO DO: delete a new menu(메뉴삭제)
	/* 목차. 8. delete */

	
}
