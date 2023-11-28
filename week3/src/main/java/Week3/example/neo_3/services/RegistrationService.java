package Week3.example.neo_3.services;

import Week3.example.neo_3.requests.RegistrationRequest;
import org.springframework.stereotype.Service;

@Service
public class RegistrationService {
    public String register(RegistrationRequest request){
        return "works";
    }
}

// wild