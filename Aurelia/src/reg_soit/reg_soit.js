import {HttpClient, json} from 'aurelia-fetch-client'
import environment from '../environment'

var userData={};
var userList=[];
var search={};

export class reg_soit {
    contructor(userData){
        this.userData = userData;
    }
    
    
    addRide() {
		let client = new HttpClient();
        
        

		client.fetch(environment.serverURL + 'rides/create', {
			'method': "POST",
			'body': json(this.userData)
		})
			.then(response => response.json())
			.then(userData => {
				console.log("Server saatis ära, networkist create pealt naeb, andmebaasis peaks ka olema");
            console.log(userData);
		});
        	console.log("Method executed!")
	}
};