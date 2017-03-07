export class App {
  constructor() {
    this.message = 'hei hei!';
  }
    configureRouter(config, router) {
    this.router = router;
    config.title = 'My Aurelia app';
    config.map([
      { route: ['', 'home'],       name: 'home',       moduleId: 'home/index' },
      { route: 'choice',            name: 'choice',      moduleId: 'choice/front-page',   nav: true },
      { route: 'vedaja',            name: 'vedaja',      moduleId: 'vedaja/vedaja',   nav: true },
      { route: 'saatja',            name: 'saatja',      moduleId: 'saatja/saatja',   nav: true },
      { route: 'reg_soit',            name: 'reg_soit',      moduleId: 'reg_soit/reg_soit',   nav: true },
      
      
    ]);
  }
}
