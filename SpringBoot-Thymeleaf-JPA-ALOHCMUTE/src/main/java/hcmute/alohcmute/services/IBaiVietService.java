package hcmute.alohcmute.services;

import java.util.List;
import java.util.Optional;

import org.springframework.data.domain.Page;

import hcmute.alohcmute.entities.BaiViet;

public interface IBaiVietService {

	Optional<BaiViet> findById(Integer id);

	List<BaiViet> findAll();

	BaiViet getById(Integer id);

	List<BaiViet> findAllBaiVietByUsername(String taiKhoanUsername);

	void deleteById(Integer id);
	
	long demSoTuongTac(int maBaiViet);
	
	Page<BaiViet> getBaiVietByPage(String mabaiviet, int page, int pageSize);
	
	void deleteByMaBaiViet(int maBaiViet);
	long tangLike(int maBaiViet, String taiKhoan);
	long giamLike(int maBaiViet, String taiKhoan);
	boolean checkLiked(int maBaiViet, String taiKhoan);
}
