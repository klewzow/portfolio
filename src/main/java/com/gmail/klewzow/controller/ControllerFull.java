package com.gmail.klewzow.controller;

import com.gmail.klewzow.Validator.MultipartFileValidator;
//import com.gmail.klewzow.entity.WorkExample;
//import com.gmail.klewzow.repositories.WorkExampleRepository;
import org.apache.catalina.webresources.FileResource;
//import org.apache.commons.io.FileUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.validation.BindingResult;
import org.springframework.validation.Errors;
import org.springframework.web.bind.annotation.*;

//
//import javax.validation.Valid;
import java.io.*;
import java.util.Base64;
import java.util.UUID;

@Controller
@ControllerAdvice
@RequestMapping("")
public class ControllerFull {


//    @Autowired
//    WorkExampleRepository workExampleRepository;

    @ModelAttribute
    public Model style(Model model) {

        model.addAttribute("style", "/css/style.min.css");
        model.addAttribute("iconFont", "/css/iconFont.css");
        return model;
    }

    @RequestMapping(value = {"/", "/index"}, method = RequestMethod.GET)
    public String indexPage() {
        return "index";
    }


    @Value("${document.doc.cv}")
    String pathImg;

    @RequestMapping(value = ("/cv"), method = RequestMethod.GET)
    public String cv(Model model) {
        model.addAttribute("doc", new File(pathImg));
        return "cv";
    }

    @RequestMapping(value = ("/java"), method = RequestMethod.GET)
    public String javaPage() {
        return "java";
    }

    @RequestMapping(value = ("/layout"), method = RequestMethod.GET)
    public String layoutPage() {
        return "layout";
    }

    @RequestMapping(value = ("/c"), method = RequestMethod.GET)
    public String cPage() {
        return "c";
    }

//    @GetMapping(value = ("/admin"))
//    public String adminPage(Model model) {
//        model.addAttribute("work", new WorkExample());
//        return "admin";
//    }

    @Value("${upload.img.article}")
    private String path;


//    @PostMapping(value = ("/admin"))
//    public String adminPage(
//            @ModelAttribute("work") @Valid WorkExample workExample,
//            BindingResult bindingResult) throws IOException {
//        new MultipartFileValidator().verify(workExample.getFile(), bindingResult);
//        System.out.println("First  ------------------------------ - " + workExample);
//        if (bindingResult.hasErrors()) {
//            return "admin";
//        }
//
//
//        workExample.setFileName(workExample.getFile().getOriginalFilename());
//
//        try (ByteArrayInputStream bis = new ByteArrayInputStream(workExample.getFile().getBytes());
//             ByteArrayOutputStream bos = new ByteArrayOutputStream();
//             FileOutputStream fos = new FileOutputStream(new File("classpath:/src/" + UUID.randomUUID() +"."
//                     + workExample.getFile().getOriginalFilename()
//                     .substring(workExample.getFile().getOriginalFilename().lastIndexOf(".") + 1)))
//        ) {
//            int b;
//            String  code = Base64.getEncoder().encodeToString(workExample.getFile().getBytes());
//            System.out.println(code);
//            while ((b = bis.read()) != -1) {
//                fos.write(b);
//            }
//        } catch (IOException e) {
//            e.printStackTrace();
//        }
//        System.out.println(workExample.getFile().getBytes());
//
////            while((dt = fis.read())!=-1){
////                sb.append(dt);
////            }
//
////        workExampleRepository.save(workExample);
//
//
//        System.out.println("Last  ------------------------------ - " + workExample);
//        return "admin";
//    }

//
//    }
//
 }

