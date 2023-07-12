package repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import entity.KhoaHoc;

@Repository
public interface KhoaHocRepository extends JpaRepository<KhoaHoc, Long> {

}
