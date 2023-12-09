package hcmute.alohcmute.repositories;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import hcmute.alohcmute.entities.BaiViet;
import hcmute.alohcmute.entities.Nhom;

@Repository
public interface BaiVietRepository extends JpaRepository<BaiViet, Integer> {

	List<BaiViet> findBynhom(Nhom Nhom);

	
	
}
