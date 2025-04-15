package com.jao._bookmarker_api.api;

import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseStatus;
import org.springframework.web.bind.annotation.RestController;

import com.jao._bookmarker_api.domain.BookmarkDTO;
import com.jao._bookmarker_api.domain.BookmarkService;
import com.jao._bookmarker_api.domain.BookmarksDTO;
import com.jao._bookmarker_api.domain.CreateBookmarkRequest;

import jakarta.validation.Valid;
import lombok.RequiredArgsConstructor;

@RestController
@RequestMapping("/api/bookmarks")
@RequiredArgsConstructor

public class BookmarkController {
	
    private final BookmarkService bookmarkService;
    
    //http://localhost:8080/api/bookmarks
    @GetMapping  
    public BookmarksDTO getBookMarks(@RequestParam(name="page", defaultValue = "1") Integer page,
    		@RequestParam(name="query", defaultValue = "") String query	) {
    	
    	if(query == null || query.trim().length()==0) {
    			return bookmarkService.getBookmarks(page);
    	}
    	
    	return bookmarkService.searchBookmarks(query,page);
    }
    
    @PostMapping
    @ResponseStatus(HttpStatus.CREATED)
    public BookmarkDTO createBookmark(@RequestBody @Valid CreateBookmarkRequest request) {
        return bookmarkService.createBookmark(request);
    }
}
