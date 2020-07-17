import { User } from './user';
import { Injectable } from '@angular/core';
import { flatten } from '@angular/compiler';
import { Router, ActivatedRouteSnapshot, RouterStateSnapshot } from '@angular/router';

@Injectable({
  providedIn: 'root'
})
export class UtilisateurService {
  utilisateur: User;
  users: Array<User> =  new Array<User>();
   errors = {
    'email': "InvalidEmailError",
    'nom': "InvalidNomError",
    'prenom': "InvalidPrenomError",
    'age': "InvalidAgeError"
};
  // isValid: boolean = false;

  constructor(private router: Router) { }

  // public connexion2(utilisateur: User){
  //   if(utilisateur.email === 'toto@toto.com' && utilisateur.firstName === '666'){
  //     this.utilisateur = utilisateur;
  //     return true;
  //   }

  //   return false;
  // }

  public connexion2(user:User) {
    let age = Number(user.age);
    if(this.isValidEmail(user.email) === false){
      console.log("erreur sur le mail");
      return this.errors.email;

    } else if(user.email ="test@test.com" && (user.firstName = "abdou") && (age > 13) &&(user.name ="TRAORE")){
      this.users.push(user);
      console.log(age);
      console.log(this.users);
    }
  }
  
   public isValidEmail (valeur) {
    const expression = /^\w+([.-]?\w+)*@\w+([.-]?\w+)*(\.\w{2,3})+$/;
    const verification = expression.test(valeur);
    return true === verification;
}

public validAge(age){
  age = Number(age);
  return age;

}
}
