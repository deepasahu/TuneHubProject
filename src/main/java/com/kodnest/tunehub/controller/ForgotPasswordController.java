package com.kodnest.tunehub.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.validation.BindingResult;
import org.springframework.validation.annotation.Validated;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;

import com.kodnest.tunehub.entity.ResetPasswordForm;
import com.kodnest.tunehub.service.UserService;

@Controller
public class ForgotPasswordController {

	@Autowired
	private UserService userService;

	@GetMapping("/forgotpassword")
	public String showResetPasswordForm(Model model) {
		model.addAttribute("resetPasswordForm", new ResetPasswordForm());
		return "forgotpassword";
	}

	@PostMapping("/forgotpassword")
	public String processResetPasswordForm(
			@ModelAttribute("resetPasswordForm") @Validated ResetPasswordForm resetPasswordForm, BindingResult result, Model model) {
		if (result.hasErrors()) {
			return "forgotpassword"; // Return to the form with validation errors
		}

		// Logic to reset password
		userService.forgotpassword(resetPasswordForm.getEmail(), resetPasswordForm.getNewPassword());
		


		return "redirect:/login"; // Redirect to login page
	}
}
