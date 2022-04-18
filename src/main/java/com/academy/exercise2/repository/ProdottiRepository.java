package com.academy.exercise2.repository;


import com.academy.exercise2.domain.Prodotti;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface ProdottiRepository extends JpaRepository<Prodotti,String> {


    Prodotti findByName(String name);
}


/* CON MONGO DB, ma anche senza probabilmente
//lo mettiamo qua perchè Spring ci dà possibilità di farle o a codice nel server oppure qui solo come firma
    //metodi add
    @Query("{id:?0}") //SQL equivalent: select * from book where id=?
    Optional<Book> getBookById(Integer id);

    @Query("{pages: {$lt: ?0} }")  //lt=less than; gt=grand then
    List<Book> getBooksByPages(Integer pages);

    //NEW
    //parentesi quadre per passare piu parametri
    @Query("[{author:?0, title:?1}]")
    List<Book> getBooksByAuthorOrName(String author, String title);

    @Query(value = "{author:?0}",count = true)
    Integer getBooksCountByAuthor(String author);

    //sort= {nomeCampoSuCuiOrdinare: 1--> crescente, -1--> descrescente}
    @Query(value = "{author:?0}", sort = "{title:1}")
    List<Book> getBooksByAuthorSortByName(String author);
 */



/* firth project, con H2, query native
@Query(value = "SELECT d.id,d.name FROM departments d WHERE d.id=?1 AND d.name=?2 ",nativeQuery = true)
     Departement findByIdAndName(String id,String name);
 */