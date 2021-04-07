package company.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import company.beans.Student;
import company.repository.StudentRepository;

/**
 * Arda Rugji - arugji
 * CIS171
 * 
 */
@Controller
public class WebController {
	
	@Autowired
	StudentRepository repo;
	
	@GetMapping("viewAll")
	public String viewAllStudents(Model model) {
		model.addAttribute("Student", repo.findAll());
		return "results";
	}
	
	@GetMapping("/inputStudent")
	public String addNewContact(Model model) {
		//Contact c = new Contact();
		Student e = new Student();
		model.addAttribute("newStudent", e);
		return "input";
	}

	@PostMapping("/inputStudent")
	public String addNewStudent(@ModelAttribute Student e, Model model) {
		repo.save(e);
		return viewAllStudents(model);
	}
	
	@GetMapping("/edit/{id}")
	public String showUpdateStudentoyee(@PathVariable("id") long id,Model model) {
	Student e = repo.findById(id).orElse(null);
	model.addAttribute("newStudent", e);
	return "input";
	}
	
	@PostMapping("/update/{id}")
	public String reviseContact(Student e, Model model) {
	repo.save(e);
	return viewAllStudents(model);
	}
	
	@GetMapping("/delete/{id}")
	public String deleteUser(@PathVariable("id") long id, Model model) {
	Student e = repo.findById(id).orElse(null);
	repo.delete(e);
	return viewAllStudents(model);
	}

}