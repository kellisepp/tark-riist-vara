import {HttpClient, json} from 'aurelia-fetch-client'
import environment from '../environment'

export class reg_soit {
   
    
   var userData = {};
    

	
 
    activate() {
        let client = new HttpClient();
        
        
        client.fetch(environment.serverURL + 'rides/all')
        .then(response => response.json())
        .then(users => this.userList = users);
    }
    
    
    
    addRide() {
		let client = new HttpClient();
        var userData = {}
        

		client.fetch(environment.serverURL + 'rides/create', {
			'method': "POST",
			'body': json(this.userData)
		})
			.then(response => response.json())
			.then(data => {
				console.log("Server saatissad " + data.lahteKoht);
            console.log(userData);
		});
        	console.log("Method executed!")
	}
}