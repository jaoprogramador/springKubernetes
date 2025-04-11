package com.jao._bookmarker_api.domain;

import org.springframework.data.domain.Page;
import org.springframework.data.domain.PageRequest;
import org.springframework.data.domain.Pageable;
import org.springframework.data.domain.Sort;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import lombok.RequiredArgsConstructor;

@Service
@Transactional
@RequiredArgsConstructor
public class BookmarkService {
    private final BookmarkRepository repository;
    
    @Transactional(readOnly = true)
    public BookmarkDTO getBookmarks(Integer page) {
    	int pageNo = page < 1 ? 0 : page -1 ;
    	Pageable pageable = PageRequest.of(pageNo, 5, Sort.Direction.DESC, "createdAt");

        //return repository.findAll();
    	
        return new BookmarkDTO(repository.findAll(pageable));

    }
}
