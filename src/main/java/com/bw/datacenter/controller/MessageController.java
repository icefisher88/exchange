package com.bw.datacenter.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;

@Controller
public class MessageController {
    @RequestMapping("/message/go")
    public String goTest() {
        return "reach";
    }
    @RequestMapping("/message/detail/data={uname}")
    public String goDetail(@PathVariable("uname")String data, Model model)
    {
        model.addAttribute("data",data);
        return "detail";
    }
    @RequestMapping(value="/message/report1",method= RequestMethod.GET)
    public String reportGet(@RequestParam("begin")String begin,
                            @RequestParam("end")String end,Model model)
    {
        model.addAttribute("begin",begin);
        model.addAttribute("end",end);
        model.addAttribute("method","GET");
        return "report";
    }
}
