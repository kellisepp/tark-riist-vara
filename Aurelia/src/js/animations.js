jQuery(document).ready(function () {
    jQuery('.fade-block').addClass("hideme").viewportChecker({
        classToAdd: 'visible animated fadeIn',
        offset: 100
    });
    jQuery('.come-in-left').addClass("hideme").viewportChecker({
        classToAdd: 'visible animated slideInLeft',
        offset: 0
    });
    jQuery('.come-in-up').addClass("hideme").viewportChecker({
        classToAdd: 'visible animated fadeInUp',
        offset: 100
    });
    jQuery('.come-in-right').addClass("hideme").viewportChecker({
        classToAdd: 'visible animated fadeInRight',
        offset: 100
    });
});