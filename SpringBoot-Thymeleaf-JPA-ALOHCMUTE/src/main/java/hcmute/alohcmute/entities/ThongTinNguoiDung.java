package hcmute.alohcmute.entities;

import java.io.Serializable;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.Table;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data 
@NoArgsConstructor 
@AllArgsConstructor

@Entity
@Table
public class ThongTinNguoiDung implements Serializable {
	private static final long serialVersionUID = 1L;

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private int MaNguoiDung;
	
	@Column
	private String HoTen; 

	@Column
	private String NickName;
	
	@Column
	private String Email;
	
	@Column
	private String GioiTinh;
	
	@Column
	private String SDT;
	
	@Column
	private String AvatarURl;
}
