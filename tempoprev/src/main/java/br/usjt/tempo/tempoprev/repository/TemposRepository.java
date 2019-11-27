package br.usjt.tempo.tempoprev.repository;



import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;
import org.springframework.scheduling.annotation.Async;

import br.usjt.tempo.tempoprev.model.Tempo;

import java.util.List;


public interface TemposRepository extends JpaRepository<Tempo, Long> {

    
    /*------------------------------------------------QUERY E ASSICRONAS-----------------------------------------------------------------*/

	@Async
    @Query("select p from Tempo p inner join p.cidade c where c.id = p.id and upper(c.nome) = upper(:nome)")
    List<Tempo> findAllByCidade_Nome(@Param("nome") String nome);
	
	@Async
    @Query("select p from Tempo p inner join p.cidade c where c.id = p.id and c.latitude = :latitude and c.longitude = :longitude")
    List<Tempo> findAllByCidade_LatitudeAndCidade_Longitude(@Param("latitude") Double latitude, @Param("longitude") Double longitude);
	
	List<Tempo> findAllByCidade_NomeIgnoreCase(String nome);

    /*--------------------------------------NOMEANDO QUERIES-----------------------------------------------------------------------*/

    List<Tempo> BuscaPeloCidadeNome (@Param("nome") String nome);

    List<Tempo> BuscaPeloLatELon(@Param("latitude") Double latitude,@Param("longitude") Double longitude);
    
   

}
