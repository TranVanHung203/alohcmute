package hcmute.alohcmute.controllers;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;

import hcmute.alohcmute.entities.BaoCaoBaiViet;
import hcmute.alohcmute.services.IBaoCaoBaiVietService;

@Controller
public class BaiVietController {
	@Autowired
	IBaoCaoBaiVietService baoCaoBaiVietService;

	@GetMapping("/admin/dsbaocaobaiviet")
	public String listBaoCaoBaiViet(ModelMap model) {
		List<BaoCaoBaiViet> list = baoCaoBaiVietService.findAll();

		model.addAttribute("baocaobaiviet", list);
		return "admin/manage/quanlybaiviet";
	}

	@GetMapping(value = {"/admin/chophep/{mabaocao}", "/admin/chitiet/chophep/{mabaocao}"})
	public String chophepBaiViet(@PathVariable(value = "mabaocao") int mabaocao, Model model) {
		baoCaoBaiVietService.deleteById(mabaocao);
		
		List<BaoCaoBaiViet> list = baoCaoBaiVietService.findAll();
		model.addAttribute("baocaobaiviet", list);
		
		return "redirect:/admin/dsbaocaobaiviet";
	}
	
	
	@GetMapping("/admin/chitiet/{mabaocao}")
	public String chitietbaiviet(@PathVariable(value = "mabaocao") int mabaocao, Model model) {
		Optional<BaoCaoBaiViet> optBaocaobaiviet = baoCaoBaiVietService.findById(mabaocao);
		BaoCaoBaiViet baocaobaiviet = optBaocaobaiviet.get();

		model.addAttribute("baocaobaiviet", baocaobaiviet);
		return "admin/manage/chitietbaiviet";
	}
}
