package de.aittr.g_31_2_mapstruct.UserServices;

import de.aittr.g_31_2_mapstruct.domain.UserDto;
import de.aittr.g_31_2_mapstruct.repositories.UserRepository;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class UserService {

    private UserRepository repository;

    public UserService(UserRepository repository) {
        this.repository = repository;
    }

    public List<UserDto> getAll(){
        return repository.findAll();
    }

    public UserDto getById(int id){

    }

    public UserDto save(UserDto dto){

    }

    public void deleteById(int id){
        repository.deleteById(id);
    }
}
