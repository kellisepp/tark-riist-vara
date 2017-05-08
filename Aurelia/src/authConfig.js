var configForDevelopment = {
    providers: {
        google: {
            clientId: '871886354688-3oemcs4m084ppqamnu0cp8nigio6gm8o.apps.googleusercontent.com'
        }
        
    }
};

var configForProduction = {
    providers: {
        google: {
            clientId: '871886354688-3oemcs4m084ppqamnu0cp8nigio6gm8o.apps.googleusercontent.com'
        }

    }
};
var config;
if (window.location.hostname === 'localhost') {
    config = configForDevelopment;
} else {
    config = configForProduction;
}


export default config;