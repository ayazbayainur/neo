//package Week3.example.neo_3.controllers;
//
//import Week3.example.neo_3.dto.UserDto;
//import Week3.example.neo_3.services.ProductService;
//import lombok.AccessLevel;
//import lombok.RequiredArgsConstructor;
//import lombok.experimental.FieldDefaults;
//import org.springframework.http.HttpStatus;
//import org.springframework.http.ResponseEntity;
//import org.springframework.web.bind.annotation.*;
//
//import javax.validation.Valid;
//import java.util.List;
//
//@RestController
//@RequiredArgsConstructor
//@FieldDefaults(level = AccessLevel.PRIVATE, makeFinal = true)
//@RequestMapping("/api/products")
//public class ProductController {
//    private ProductService productService;
//    @PostMapping("/addUser")
//    public ResponseEntity<UserDto> createUser(@Valid @RequestBody UserDto user){
//        UserDto savedUser = productService.createUser(user);
//        return new ResponseEntity<>(savedUser, HttpStatus.CREATED);
//    }
//
//    @GetMapping("{id}")
//    public ResponseEntity<UserDto> getUserById(@PathVariable ("id") Long UserId){
//        UserDto user = productService.getUserById(UserId);
//        return new ResponseEntity<>(user, HttpStatus.OK);
//    }
//
//    @GetMapping
//    public ResponseEntity<List<UserDto>> getAllUsers(){
//        List<UserDto> users = productService.getAllUsers();
//        return new ResponseEntity<>(users, HttpStatus.OK);
//    }
//
//    @PutMapping("{name}")
//    public ResponseEntity<UserDto> updateUserName(@PathVariable("name") String userName, @RequestBody UserDto user){
//        user.setName(userName);
//        UserDto updatedUser = productService.updateUserUsername(user);
//        return new ResponseEntity<>(updatedUser, HttpStatus.OK);
//    }
//
//    @PutMapping("{role}")
//    public ResponseEntity<UserDto> updateUser(@PathVariable("role") String userRole,
//                                              @RequestBody UserDto user){
//        user.setRole(userRole);
//        UserDto updatedUser = productService.updateUserRole(user);
//        return new ResponseEntity<>(updatedUser, HttpStatus.OK);
//    }
//
//}
