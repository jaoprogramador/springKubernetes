package com.jao._bookmarker_api.domain;

import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;;

public interface BookmarkRepository extends JpaRepository<Bookmark, Long> {

	//@Query("select new com.jao._bookmarker_api.domain.BookMarkDTO(b.id, b.title, b.url, b.com.jao._bookmarker_api.domain) from Bookmark b")
	//@Query("SELECT new com.jao._bookmarker_api.domain.BookMarkDTO(b.id, b.title, b.url) FROM Bookmark b")
	@Query("SELECT new com.jao._bookmarker_api.domain.BookmarkDTO(b.id, b.title, b.url, b.createdAt) FROM Bookmark b")
	Page<BookmarkDTO> findBookmarks(Pageable pageable);


}
