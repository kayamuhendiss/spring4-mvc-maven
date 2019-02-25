package SprinMVCNotes;

public class Notes2 {

	// Spring MVC , MVC2 yaklasimini kullanmakta.
	// Front Controlleri mevcuttur (DispatcherServlet)

	// - Istek(request) , FrontController tarafindan yakalanir/karsilanir.
	// - DispatcherServlet , HandlerMapping'e gider ve ilgili Controller bilgisine
	// ulasir. (BeanNameUrlHandlerMapping default olarak kullanilan)
	// - Controller bilgisi DispatcherServlet e gelir.
	// - Ilgili controller istegi karsilar (handle request)
	// - view ismi , ViewResolver tarafindan kullanilir ve geriye ilgili view doner.
	// - Model/data hazirlanir.
	// - render islemi yapilir.
	
	// -------------------------------------
	// Spring MVC , Spring Frameworkun bir moduludur.
}
