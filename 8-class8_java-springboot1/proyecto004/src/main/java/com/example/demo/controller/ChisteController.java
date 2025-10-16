package com.example.demo.controller;
import com.example.demo.model.Chiste;
import com.example.demo.service.ChisteService;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class ChisteController {
		
		private final ChisteService chisteService;
		
		public ChisteController(ChisteService chisteService) {
			this.chisteService = chisteService;
		}
	
	@GetMapping("/")
	public String inicio(Model model) {
		Chiste chisteAzar = chisteService.obtenerChisteAleatorio();
		model.addAttribute("chiste",chisteAzar);
		return "index";
	}

	
	
}
