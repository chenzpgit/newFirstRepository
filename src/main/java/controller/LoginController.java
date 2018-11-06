package controller;

import org.springframework.web.bind.annotation.RequestMapping;

import java.util.HashMap;
import java.util.Map;

@RequestMapping(value = "login")
public class LoginController {


    public Map<String,Object> longin(){
        Map<String,Object> resultMap=new HashMap<>();
        resultMap.put("success",false);
        return  resultMap;
    }



    public Map<String,Object>  changeStatus(){

        return  null;
    }

}
