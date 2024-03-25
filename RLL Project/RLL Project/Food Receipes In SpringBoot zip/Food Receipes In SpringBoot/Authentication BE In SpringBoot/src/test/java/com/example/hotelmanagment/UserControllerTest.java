package com.example.hotelmanagment;

import com.example.project.DTO.BasicResponseDTO;
import com.example.project.DTO.BasicResponseErrorDTO;
import com.example.project.Models.ProfileDetail;
import com.example.project.Services.UserService;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import org.mockito.InjectMocks;
import org.mockito.Mock;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import com.example.project.Controllers.UserController;
import java.util.Optional;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.mockito.ArgumentMatchers.any;
import static org.mockito.Mockito.when;
import static org.mockito.MockitoAnnotations.initMocks;

public class UserControllerTest {

	@Mock
	private UserService userService;

	@InjectMocks
	private UserController userController;

	@BeforeEach
	public void setUp() {
		initMocks(this);
	}

	@Test
	public void testAddProfile() throws Exception {
		ProfileDetail profileDetail = new ProfileDetail();
		when(userService.AddProfile(any(ProfileDetail.class))).thenReturn("Profile added successfully");

		ResponseEntity<?> response = userController.AddProfile(profileDetail);

		assertEquals(HttpStatus.OK, response.getStatusCode());
		BasicResponseDTO responseBody = (BasicResponseDTO) response.getBody();
		assertEquals("Profile added successfully", responseBody.getMessage());
	}

	@Test
	public void testUpdateProfile() throws Exception {
		ProfileDetail profileDetail = new ProfileDetail();
		when(userService.UpdateProfile(any(ProfileDetail.class))).thenReturn("Profile updated successfully");

		ResponseEntity<?> response = userController.UpdateProfile(profileDetail);

		assertEquals(HttpStatus.OK, response.getStatusCode());
		BasicResponseDTO responseBody = (BasicResponseDTO) response.getBody();
		// This will fail due to the current implementation bug (returning null). Adjust the actual method to return a proper response.
		assertEquals("Profile updated successfully",  responseBody.getMessage());
	}

	@Test
	public void testGetProfile() throws Exception {
		Long userId = 1L;
		ProfileDetail profileDetail = new ProfileDetail();
		when(userService.GetProfile(userId)).thenReturn(Optional.of(profileDetail));

		ResponseEntity<?> response = userController.GetProfile(userId);

		assertEquals(HttpStatus.OK, response.getStatusCode());
		//assertEquals(profileDetail, response.getBody());
	}

	@Test
	public void testGetProfileNotFound() throws Exception {
		Long userId = 1L;
		when(userService.GetProfile(userId)).thenReturn(Optional.empty());

		ResponseEntity<?> response = userController.GetProfile(userId);

		// Depending on the desired behavior when a profile is not found, you might want to adjust this test.
		// For instance, if a 404 status is expected, the controller method needs to be adjusted accordingly.
		assertEquals(HttpStatus.BAD_REQUEST, response.getStatusCode());
	}
}