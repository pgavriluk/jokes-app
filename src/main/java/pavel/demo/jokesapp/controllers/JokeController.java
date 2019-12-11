package pavel.demo.jokesapp.controllers;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

import pavel.demo.jokesapp.services.JokeService;
import pavel.demo.jokesapp.services.JokeServiceImpl;

@Controller
public class JokeController {

	// fields
	private JokeService jokeService;

	// constructor
	public JokeController(JokeService jokeService) {
		this.jokeService = jokeService;
	}

	// request methods
	@RequestMapping({"/",""})
	public String displayJoke(Model model){
		model.addAttribute("joke", jokeService.getJoke());
		return "chucknorris";
	}
}
