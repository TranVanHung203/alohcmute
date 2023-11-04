package hcmute.alohcmute.entities;

import java.io.Serializable;
import java.sql.Date;
import java.time.LocalDateTime;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.JoinColumn;
import jakarta.persistence.ManyToOne;
import jakarta.persistence.Table;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data 
@NoArgsConstructor
@AllArgsConstructor

@Entity
@Table
public class TinNhan implements Serializable{
	private static final long serialVersionUID = -7595339127598956518L;
	
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	@Column(name = "MaTinNhan")
	private int maTinNhan;
	
	@Column(name = "NoiDungChu")
	private String noiDungChu;
	
	@Column(name = "NoiDungHinhAnh")
	private String noiDungHinhAnh;
	
	@Column(name = "ThoiGianGuiTinNhan")
	private LocalDateTime thoiGianGuiTinNhan;
	
	@ManyToOne
	@JoinColumn(name="MaCuocHoiThoai")
	private CuocHoiThoai cuocHoiThoai;

}
