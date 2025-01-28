package com.example.price_aggregator.user;

import com.example.price_aggregator.auth.AuthenticationResponse;
import com.example.price_aggregator.auth.AuthenticationService;
import com.example.price_aggregator.auth.RegisterRequest;
import lombok.RequiredArgsConstructor;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/admin")
@RequiredArgsConstructor
public class AdminController {

    private final AuthenticationService authenticationService;

    @GetMapping()
    public String adminOnlyEndpoint() {
        return "Access granted to ADMIN!";
    }

    @PostMapping("/register-admin")
    public ResponseEntity<AuthenticationResponse> registerAdmin(@RequestBody RegisterRequest regRequest) {
        return ResponseEntity.ok(authenticationService.register(regRequest, Role.ADMIN));
    }
}
