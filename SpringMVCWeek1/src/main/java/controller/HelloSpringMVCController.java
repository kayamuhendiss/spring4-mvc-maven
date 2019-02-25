package controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import service.MyService;

@Controller
public class HelloSpringMVCController  {
    @Autowired
    private MyService myService;


    // -@RequestMapping annotationi hem method hem class seviyesinde kullanabiliriz.
    @RequestMapping(value = "/message",method = RequestMethod.GET)
    public String message(ModelMap modelMap){
        String msg=myService.coolMesssage();
        modelMap.addAttribute("myMessage",msg);
        return "hello";
    }


}

/*
 * <bean
 * class="org.springframework.web.servlet.view.InternalResourceViewResolver">
 * <property name="prefix" value="/WEB-INF/view.pages/"/> <property
 * name="suffix" value=".jsp"/> <!-- /WEB-INF/view.pages/xyz.jsp seklinde olacak
 * --> </bean> bu bean tanimi ile return "helloPage"; dondugumuzde ilgili prefix
 * ve suffixi ekler;
 *
 * /WEB-INF/view.pages/helloPage.jsp
 */

// WEB-INF altindaki dosyaya direkt olarak erisim saglanmaz.
// spring ile bu sekilde erisim saglayabilirz.
