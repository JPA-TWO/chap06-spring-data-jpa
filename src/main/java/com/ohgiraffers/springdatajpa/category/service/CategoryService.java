package com.ohgiraffers.springdatajpa.category.service;

import com.ohgiraffers.springdatajpa.category.dto.CategoryDTO;
import com.ohgiraffers.springdatajpa.category.entity.Category;
import com.ohgiraffers.springdatajpa.category.repository.CategoryRepository;
import org.modelmapper.ModelMapper;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.stream.Collectors;

@Service
public class CategoryService {

    private final CategoryRepository categoryRepository;
    private final ModelMapper modelMapper;

    public CategoryService(CategoryRepository categoryRepository, ModelMapper modelMapper) {
        this.categoryRepository = categoryRepository;
        this.modelMapper = modelMapper;
    }

    public List<CategoryDTO> findAllCategory() {

        List<Category> categoryList = categoryRepository.findAllCategory();

        /* TO DO: return the categoryList with proper transformation commands from Category entity to CategoryDTO
         *  (카테고리 엔티니를 카테고리 DTO로 변경)
         * */
        // 람다식 사용 버전

        // 람다식 대신 for문 사용한 버전
    }
}
