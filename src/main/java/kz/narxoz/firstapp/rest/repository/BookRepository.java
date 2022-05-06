package kz.narxoz.firstapp.rest.repository;


import kz.narxoz.firstapp.rest.model.Book;

import org.springframework.data.jpa.repository.JpaRepository;

public interface BookRepository extends JpaRepository<Book, Long> {
}