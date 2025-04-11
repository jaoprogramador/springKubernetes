package com.jao._bookmarker_api.api;

import java.util.List;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;
import com.jao._bookmarker_api.domain.BookmarkDTO;
import com.jao._bookmarker_api.domain.Bookmark;
import com.jao._bookmarker_api.domain.BookmarkService;

import lombok.RequiredArgsConstructor;

@RestController
@RequestMapping("/api/bookmarks")
@RequiredArgsConstructor
public class BookmarkController {
    private final BookmarkService bookmarkService;
    @GetMapping
    public BookmarkDTO getBookMarks(@RequestParam(name="page", defaultValue = "1") Integer page) {
    	return bookmarkService.getBookmarks(page);
    }
}
