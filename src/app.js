export class App {
  
    configureRouter(config, router) {
    this.router = router;
    config.title = 'My Aurelia app';
    config.map([
      { route: ['', 'home'],       name: 'home',       moduleId: 'home/index', title:"Home", nav: true },
      { route: 'choice',            name: 'choice',      moduleId: 'choice/front-page', title:"Valik",   nav: true },
      { route: 'vedaja',            name: 'vedaja',      moduleId: 'vedaja/vedaja', title:"Vedaja",   nav: true },
      { route: 'saatja',            name: 'saatja',      moduleId: 'saatja/saatja', title:"Saatja",   nav: true },
      { route: 'reg_soit',            name: 'reg_soit',      moduleId: 'reg_soit/reg_soit', title:"Registreeri sõit",   nav: true },
      { route: 'reg_kaup',            name: 'reg_kaup',      moduleId: 'reg_kaup/reg_kaup', title:"Registreeri kaup",   nav: true },
      
      
    ]);
  }
}