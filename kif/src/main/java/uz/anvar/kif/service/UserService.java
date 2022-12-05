package uz.anvar.kif.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import uz.anvar.kif.model.User;
import uz.anvar.kif.repository.UserRepository;

import java.util.List;

@Service
public class UserService {
@Autowired
    private UserRepository repository;

public List<User> getAll(){
    return (List<User>) repository.findAll();
}


    public User createUser(User user) {
    user.setSeniority(user.getSeniority()+" yil");
     repository.save(user);
     return user;

    }
}
