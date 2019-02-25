package service;

import org.springframework.stereotype.Service;

@Service
public class MyServiceImpl implements MyService {


    public String coolMesssage() {

        return "cool Messagee";
    }
}
