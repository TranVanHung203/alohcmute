package hcmute.alohcmute.repositories;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import hcmute.alohcmute.entities.TaiKhoan;

@Repository
public interface TaiKhoanRepositories extends JpaRepository<TaiKhoan, String>{

}
