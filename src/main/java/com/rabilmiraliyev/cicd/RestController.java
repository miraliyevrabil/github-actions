package com.rabilmiraliyev.cicd;

import org.springframework.web.bind.annotation.GetMapping;

@org.springframework.web.bind.annotation.RestController
public class RestController {
    @GetMapping("/")
    public String welcome(){
        return "Welcome";
//        echo "# ci-cd" >> README.md
//        git init
//        git add README.md
//        git commit -m "first commit"
//        git branch -M main
//        git remote add origin https://github.com/miraliyevrabil/ci-cd.git
//        git push -u origin main
    }
}
