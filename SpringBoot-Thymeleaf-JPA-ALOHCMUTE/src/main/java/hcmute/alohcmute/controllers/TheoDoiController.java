package hcmute.alohcmute.controllers;

import java.util.ArrayList;
import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.servlet.ModelAndView;

import hcmute.alohcmute.entities.TaiKhoan;
import hcmute.alohcmute.services.ITaiKhoanService;

@Controller
@RequestMapping("user/follow")
public class TheoDoiController {

	@Autowired(required = true)
	ITaiKhoanService tkSer;
	@GetMapping("")
	public String TheoDoi(ModelMap model) {
		String username = "lolo928";
		List<TaiKhoan> tkTheoDoi = new ArrayList<>(tkSer.findTaiKhoanTheoDoisByUsername(username));
		model.addAttribute("Listtaikhoan",tkTheoDoi);
		List<TaiKhoan> tkDuocTheoDoi = new ArrayList<>(tkSer.findTaiKhoanFollowersByUsername(username));
		model.addAttribute("ListTKDuocTheoDoi",tkDuocTheoDoi);
		return "user/banbe/banbe.html";
	}
	
	@GetMapping("/unfollow")
	public ModelAndView delet(ModelMap model, @RequestParam("username") String userNameUnfollow) {

		String username="lolo928";
		TaiKhoan user1=tkSer.findBytaiKhoan(username);
		TaiKhoan user2=tkSer.findBytaiKhoan(userNameUnfollow);
		tkSer.unfollow(user1,user2);


		return new ModelAndView("redirect:/user", model);

	}
}