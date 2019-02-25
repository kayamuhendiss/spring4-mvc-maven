package SprinMVCNotes;

public class Notes {

    // MVC
    // model view controller anlamina gelmektedir.
    // 1970lere dayanmakta.

    // separation of concern
    // ilgilerin/iliskilerin/etkilerin ayrilmasi
    // her componentin/modulun kendine ozgu bir gorevi/amaci vardir bunu yapmalidir.
    // separation of concern , temiz bir mimari/clean architecture ve surdurulebilir
    // kod (maintainable) kod icin katki saglar.

    // ##### Model
    // ---------------------------------------------------------------
    // business logic ve state i tutarlar.
    // her projede , projeye ozgu siniflar yer alacaktir.

    // Employee, Department , Project , Address , Company ...
    // Book , Publisher , Customer , Auther , ...
    // Customer , Transaction , Order , Address , ShoppingCart ... gibi siniflar

    // domain siniflardir.

    // bu siniflar , POJO -> plain old java object
    // reusable siniflardir.

    // ##### View
    // presentation /gorunumden sorumlu modul.
    // jsp, xhtml , json , pdf , freemarker , thymleaf , velocity
    // View modulu/layer sunum isini yapmalidir!
    // yani datayi gostermelidir.
    // Burada business logic yapilmamlidir!!!!

    // bunu yapma : JSP sayfasindan veritabanina baglanma!

    // ##### Controller
    // Controller ; istegi karsilayan modul
    // istegin ortaya cikmasi ; linke tiklamak , butona tiklama vs seklinde
    // olabilir.
    // HTTP GET , HTTP POST
    // Controller , service modulu/layeri araciligiyla ilgili business logici
    // gerceklestirir.
    // modeli gunceller/olusturur.
    // ilgili datayi/sonucu/response gosterilmesi icin view layera/module verir.

    // separation of concern
    // her bir component/modul icin cohesion artisi saglanir.
    // degisiklik yaptigimizda minimum etki, katmanlari ayirdigimizda birbirinden
    // minimium sekilde etkilenirler.

    // MVC patterinin 2 yaklasimi vardir
    // 1.yakalsim masaustu/desktop uygulamalari icin kullanilan yaklasimdir.

    // 2.yaklasim ise web uygulamalari icin uygun olan yaklasimdir.
    // Front Controller Patterni olarak ifade edilir.

    // FrontController'lar ;

    // JSF te -> FacesServlet
    // Spring MVC -> DispatcherServlet

    // Front Controller , gelen istegi karsilar (handle request)
    // Front Controller , istegi karsilayacak ilgili Controller'a gelen bu istegi
    // yonlendirme/delagete/devretme islemini yapar.
   // FrontController
    // -----------------------------------------------------------------------
    // Spring MVC Application Layers
    //
    // ##### Domain Layer
    // Projede yer alan , business a ait model siniflarimiz.
    // bu siniflarin business a ozgu state ve behaviorlari olacaktir.
    // state -> instance variable
    // behavior -> instance method

    // #### User Interface Layer
    // Son kullaniciya , end user , response un gosterildigi layerdir.
    // xml,json , html , pdf , excel ..


    // #### Web Layer
    // Web layer gelen istegi karsilar ve asil is service layerda olmalidir!
    // bu layerda businessa ait kodlar olmamalidir! olabildigince az kod olmalidir.

    // cookie , session , header gibi http islemleri yapilabilir.

    // - component based (jsf )
    // - request/response based (spring mvc)

    // @Controller annotation

    // #### Service Layer
    // projemize ozgu kodlarin yer aldigi modul/layer katman
    // transaction yonetimi burada yapilabilir.

    // #### Data Access Layer
    // bu layer veritabani ile iliskili moduldur.
    // jdbc, spring jdbc tamplate , hibernate , jpa..
}
