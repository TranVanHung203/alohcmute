package hcmute.alohcmute.repositories;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import hcmute.alohcmute.entities.BaiViet;

@Repository
public interface BaiDangRepository extends JpaRepository<BaiViet, Integer> {

	
}
