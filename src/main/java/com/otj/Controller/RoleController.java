package com.otj.Controller;

import com.otj.Domain.Role;
import com.otj.Service.Interface.RoleService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.*;
import org.springframework.web.multipart.MultipartFile;
import org.springframework.web.servlet.ModelAndView;

import java.io.File;
import java.io.IOException;
import java.util.Scanner;

@RequestMapping("/role")
@Controller("RoleController")
public class RoleController {
    @Autowired
    private RoleService roleService;

    @RequestMapping(value = "/findAll",method ={ RequestMethod.GET,RequestMethod.POST})
    public ModelAndView findAll(ModelAndView modelAndView) throws Exception {
        System.out.println("进入了RoleController...");
        modelAndView.setViewName("roleList");
        System.out.println(roleService.findAll());
        modelAndView.addObject("roles",roleService.findAll());
        System.out.println("返回视图前。。。");
        Scanner input=new Scanner(System.in);
        System.out.println("1:空指针\t2:算术\t3:越界");
        switch (input.nextInt()) {
            case 1:
            String s = null;
            s.contains("");
            break;
            case 2:
            int i = 1 / 0;
            break;
            case 3:
            int arr[] = new int[1];
            arr[2] = 1;
            break;
            default:
                break;
        }
        return modelAndView;
    }
    //@RequestMapping  params = {"username","username!=otj"}
    @RequestMapping(value = "/save")
    @ResponseBody
    public Role save(){
        Role role=new Role();
        role.setPassword("123");
        role.setStatus(123);
//        role.setRolename("otj");
        return role;
    }
    @RequestMapping(value = "/update")
    @ResponseBody
    public void update(Role role){
        System.out.println(role);
    }

    @RequestMapping(value = "/insert",method ={ RequestMethod.POST})
    @ResponseBody
    public void insert(Role role){
        System.out.println(role);
    }

    @RequestMapping(value = "/uploadFile",method ={ RequestMethod.POST})
    @ResponseBody
    public void uploadFile(String name, MultipartFile file[]) throws IOException {
       for (MultipartFile f:file){
           f.transferTo(new File("d://"+f.getOriginalFilename()));
       }
    }



}
